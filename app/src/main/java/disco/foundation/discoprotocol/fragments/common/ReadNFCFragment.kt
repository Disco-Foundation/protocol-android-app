package disco.foundation.discoprotocol.fragments.common

import android.annotation.SuppressLint
import android.app.PendingIntent
import android.content.Intent
import android.nfc.NfcAdapter
import android.nfc.Tag
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.api.RequestStatus
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.databinding.FragmentReadNFCBinding
import disco.foundation.discoprotocol.utils.ModuleType
import disco.foundation.discoprotocol.utils.setNFCIcon
import disco.foundation.discoprotocol.viewModels.ReadNfcViewModel

class ReadNFCFragment : BaseFragment(), NfcAdapter.ReaderCallback {

    private val args: ReadNFCFragmentArgs by navArgs()

    private lateinit var binding: FragmentReadNFCBinding
    private lateinit var viewModel: ReadNfcViewModel

    private var nfcAdapter: NfcAdapter? = null
    private var nfcPendingIntent: PendingIntent? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentReadNFCBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(
            this,
            ReadNfcViewModel.FACTORY(ProtoDataStoreManager(requireContext()))
        )[ReadNfcViewModel::class.java]
        viewModel.module = args.module
        setupNFCReader()
        setupUI()
    }

    @SuppressLint("UnspecifiedImmutableFlag")
    private fun setupNFCReader(){
        nfcAdapter = NfcAdapter.getDefaultAdapter(context)
        if(nfcAdapter == null){
            dialog.update(getString(R.string.device_not_supported),
                viewModel.module.color,
                true,
                getString(R.string.ok)
            ){
                dismissDialog()
                activity?.finish()
            }
        }
        nfcPendingIntent = PendingIntent.getActivity(context,0,Intent(activity,javaClass).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP),0)
    }

    private fun setupUI(){
        binding.customToolbar.setupToolbar(viewModel.module.color, getString(viewModel.module.title))
        if (viewModel.module == ModuleType.CHECK_IN || viewModel.module == ModuleType.VIEW_INFO ){
            binding.customToolbar.setListener { activity?.finish() }
        }
        binding.nfcTextBox.setupTextBoxView(getString(R.string.approach_wearable),viewModel.module.color)
        binding.nfcImageView.setNFCIcon(viewModel.module.color)
        viewModel.clearData()
        subscribeToData()
    }

    override fun onResume() {
        super.onResume()
        if (nfcAdapter != null) {
            val options = Bundle()
            // Work around for some broken Nfc firmware implementations that poll the card too fast
            options.putInt(NfcAdapter.EXTRA_READER_PRESENCE_CHECK_DELAY, 250)

            // Enable ReaderMode for all types of card and disable platform sounds
            nfcAdapter?.enableReaderMode(
                activity,
                this,
                NfcAdapter.FLAG_READER_NFC_A or
                        NfcAdapter.FLAG_READER_NFC_B or
                        NfcAdapter.FLAG_READER_NFC_F or
                        NfcAdapter.FLAG_READER_NFC_V or
                        NfcAdapter.FLAG_READER_NFC_BARCODE or
                        NfcAdapter.FLAG_READER_SKIP_NDEF_CHECK,
                options
            )
        }
    }

    override fun onPause() {
        super.onPause()
        nfcAdapter?.disableReaderMode(activity)
    }

    override fun onTagDiscovered(tag: Tag?) {
        viewModel.readDiscoveredTag(tag)
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.clearData()
    }

    private fun subscribeToData(){
        viewModel.loading.observe(viewLifecycleOwner){
            when (it) {
                RequestStatus.LOADING -> {
                    dialog.update(
                        getString(R.string.reading_info),
                        viewModel.module.color,
                        false
                    )
                }
                RequestStatus.SUCCESS -> {
                    this.findNavController()
                        .navigate(ReadNFCFragmentDirections
                            .actionReadNFCFragmentToNext(args.module))
                }
                RequestStatus.ERROR -> {
                    dialog.update(
                        getString(R.string.something_went_wrong),
                        viewModel.module.color,
                        true,
                        getString(R.string.try_again)
                    ) { dismissDialog() }
                }
                else -> { }
            }
        }
    }
}
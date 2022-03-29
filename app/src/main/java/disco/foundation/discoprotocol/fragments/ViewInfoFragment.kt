package disco.foundation.discoprotocol.fragments

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.api.RequestStatus
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.databinding.FragmentViewInfoBinding
import disco.foundation.discoprotocol.fragments.common.BaseFragment
import disco.foundation.discoprotocol.viewModels.ViewInfoViewModel

class ViewInfoFragment : BaseFragment() {

    private val args: ViewInfoFragmentArgs by navArgs()
    private lateinit var binding: FragmentViewInfoBinding
    private lateinit var viewModel: ViewInfoViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentViewInfoBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(
            this,
            ViewInfoViewModel.FACTORY(ProtoDataStoreManager(requireContext()))
        )[ViewInfoViewModel::class.java]
        viewModel.module = args.module
        setupUI()
        subscribeToData()
    }

    override fun onResume() {
        super.onResume()
        viewModel.loadTicketInfo()
    }

    private fun setupUI(){
        binding.customToolbar.setupToolbar(viewModel.module.color, getString(viewModel.module.title))
        binding.ticketInfoContainer.color = viewModel.module.color
        setupButtons()
    }

    private fun subscribeToData(){
        viewModel.ticket.observe(viewLifecycleOwner){
            binding.ticketInfoContainer.setTicket(it)
        }

        viewModel.loading.observe(viewLifecycleOwner){
            when(it){
                RequestStatus.LOADING -> dialog.update(
                    getString(R.string.loading),
                    viewModel.module.color,
                    false
                )
                RequestStatus.SUCCESS -> {
                    binding.ticketInfoContainer.visibility = View.VISIBLE
                    dismissDialog()
                }
                RequestStatus.ERROR -> {
                    dialog.update(
                        getString(R.string.something_went_wrong),
                        viewModel.module.color,
                        showButton = true,
                        getString(R.string.try_again)
                    ){
                        activity?.finish()
                    }
                }
                else -> {}
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun setupButtons(){
        binding.transactionsBtn.buttonText = getString(R.string.finalize)
        binding.transactionsBtn.color = viewModel.module.color
        binding.transactionsBtn.setupAnimation {
            activity?.finish()
        }
    }


}
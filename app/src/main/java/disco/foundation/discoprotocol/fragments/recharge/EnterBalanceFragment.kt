package disco.foundation.discoprotocol.fragments.recharge

import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.api.RequestStatus
import disco.foundation.discoprotocol.components.CustomPopup
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.databinding.FragmentEnterBalanceBinding
import disco.foundation.discoprotocol.viewModels.EnterBalanceViewModel


class EnterBalanceFragment : Fragment() {

    private val args: EnterBalanceFragmentArgs by navArgs()
    private lateinit var binding: FragmentEnterBalanceBinding
    private lateinit var viewModel: EnterBalanceViewModel

    private lateinit var progressDialog : CustomPopup

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentEnterBalanceBinding.inflate(inflater,container,false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(
            this,
            EnterBalanceViewModel.FACTORY(ProtoDataStoreManager(requireContext()))
        )[EnterBalanceViewModel::class.java]
        viewModel.module = args.module
        setupUI()
        subscribeToData()
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.clearData()
    }

    private fun setupUI(){
        binding.customToolbar.setupToolbar(viewModel.module.color, getString(viewModel.module.title))
        binding.customToolbar.setListener { activity?.finish() }
        progressDialog = CustomPopup(requireContext())
        setupButtons()
        setupTextBox()
        setupBalanceInput()
    }

    private fun subscribeToData(){
        viewModel.saving.observe(viewLifecycleOwner){
            when (it) {
                RequestStatus.SUCCESS -> {
                    progressDialog.dismiss()
                    progressDialog.showPopup(getString(R.string.balance_to_cart),
                        viewModel.module.color,true, getString(R.string.ok)){
                        progressDialog.dismiss()
                    }
                }
                RequestStatus.LOADING -> {
                    progressDialog.showPopup(getString(R.string.loading), viewModel.module.color,false)
                }
                RequestStatus.ERROR -> {
                    progressDialog.dismiss()
                    progressDialog.showPopup(getString(R.string.something_went_wrong),
                        viewModel.module.color,true, getString(R.string.try_again)
                    ) { progressDialog.dismiss() }
                }
                else -> {
                    progressDialog.dismiss()
                }
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun setupButtons(){

        binding.checkoutBtn.color = viewModel.module.color
        binding.checkoutBtn.setupAnimation {
            viewModel.clearData()
            this.findNavController().navigate(
                EnterBalanceFragmentDirections.actionEnterBalanceFragmentToNext(args.module)
            )
        }
    }

    private fun setupBalanceInput(){
        binding.enterBalanceTextInputUnderline.setBackgroundColor(
            ContextCompat.getColor(requireContext(),viewModel.module.color))

        binding.enterBalanceEditText.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                viewModel.saveBalance(binding.enterBalanceEditText.text.toString().toDouble())
            }
            false
        }

        binding.enterBalanceInfo.text = getString(R.string.well_recharge, "0")
        // add text changed listener for edit text
        binding.enterBalanceEditText.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                s?.apply {
                    binding.enterBalanceInfo.text = getString(R.string.well_recharge, s.toString())
                }
            }
            override fun afterTextChanged(s: Editable?) {}
        })
    }

    private fun setupTextBox(){
        binding.enterPasswordTextbox.setupTextBoxView(getString(viewModel.getTextBoxText()), viewModel.module.color)
    }

}
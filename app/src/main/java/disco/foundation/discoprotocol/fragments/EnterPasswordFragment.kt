package disco.foundation.discoprotocol.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.api.RequestStatus
import disco.foundation.discoprotocol.components.CustomPopup
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.databinding.FragmentEnterPasswordBinding
import disco.foundation.discoprotocol.utils.isPasswordValid
import disco.foundation.discoprotocol.viewModels.EnterPasswordViewModel

class EnterPasswordFragment : Fragment() {

    private val args: EnterPasswordFragmentArgs by navArgs()

    private lateinit var binding: FragmentEnterPasswordBinding
    private lateinit var progressDialog : CustomPopup
    private lateinit var viewModel: EnterPasswordViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentEnterPasswordBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(
            this,
            EnterPasswordViewModel.FACTORY(ProtoDataStoreManager(requireContext()))
        )[EnterPasswordViewModel::class.java]
        viewModel.module = args.module
        setupUI()
    }

    override fun onResume() {
        super.onResume()
        viewModel.loadTicket()
    }


    override fun onDestroy() {
        super.onDestroy()
        viewModel.clearData()
    }

    private fun setupUI(){
        binding.customToolbar.setupToolbar(viewModel.module.color, getString(viewModel.module.title))
        progressDialog = CustomPopup(requireContext())
        viewModel.clearData()
        setupTicketView()
        setupPasswordTextViews()
        subscribeToData()
    }

    private fun subscribeToData(){
        viewModel.ticket.observe(viewLifecycleOwner){
            binding.ticketInfoContainer.setTicket(it)
        }

        viewModel.saving.observe(viewLifecycleOwner){
            when(it){
                RequestStatus.LOADING -> progressDialog.showPopup(
                    getString(viewModel.getProcessingText()),
                    viewModel.module.color,
                    false)
                RequestStatus.SUCCESS -> {
                    progressDialog.updatePopup(
                        getString(viewModel.getSuccessProcessingText()),
                        true,
                        getString(R.string.ok)
                    ) {
                        progressDialog.dismiss()
                        if(viewModel.goHomeAfter()){
                            activity?.finish()
                        } else {
                            findNavController().navigate(
                               EnterPasswordFragmentDirections
                                   .actionEnterPasswordFragmentToNext(viewModel.module))
                        }
                    }
                }
                RequestStatus.ERROR -> {
                    val error = if(viewModel.errorMsg != null) viewModel.errorMsg
                    else getString(R.string.something_went_wrong)
                    progressDialog.updatePopup(
                        error.toString(),
                        true,
                        getString(R.string.try_again)
                    ) {  progressDialog.dismiss() }
                }
                else -> { progressDialog.dismiss() }
            }
        }

        viewModel.loading.observe(viewLifecycleOwner){
            when(it){
                RequestStatus.LOADING -> progressDialog.showPopup(
                    getString(R.string.loading),
                    viewModel.module.color,
                    false)
                RequestStatus.SUCCESS -> {
                    binding.ticketInfoContainer.visibility = VISIBLE
                    progressDialog.dismiss()
                }
                RequestStatus.ERROR -> {
                    progressDialog.updatePopup(
                        getString(R.string.something_went_wrong),
                        true,
                        getString(R.string.try_again)
                    ) {  progressDialog.dismiss() }
                }
                else -> { progressDialog.dismiss() }
            }
        }

        viewModel.purchaseText.observe(viewLifecycleOwner){
            if(it != null){
                binding.purchaseAmount.visibility = VISIBLE
                binding.purchaseAmount.text = it
            }
        }
    }

    private fun setupTicketView(){
        binding.ticketInfoContainer.color = viewModel.module.color
        binding.ticketInfoContainer.infoType = viewModel.getInfoCardType()
    }

    private fun setupPasswordTextViews(){
        binding.enterPwdText.setupTextBoxView(getString(viewModel.getTextBoxText()),viewModel.module.color)
        binding.passwordEditText.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                if(viewModel.shouldAskConfirmation()){ showConfirmPasswordTextView() }
                else {  viewModel.checkValidPassword(binding.passwordEditText.text.toString()) }
            }
            false
        }

        binding.confirmPasswordEditText.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                viewModel.saveNewPassword(binding.confirmPasswordEditText.text.toString())

            }
            false
        }

        // add text changed listener for edit text
        binding.confirmPasswordEditText.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                s?.apply {
                    // check user input a valid formatted password
                    if (isPasswordValid(binding.passwordEditText.text.toString())) {
                        binding.confirmPasswordEditText.error = null
                    } else {
                        // show error on input invalid password
                        binding.confirmPasswordEditText.error = getText(R.string.password_mismatch)
                    }
                }
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        binding.textInputUnderline.setBackgroundColor(
            ContextCompat.getColor(requireContext(), viewModel.module.color)
        )
        binding.confirmTextInputUnderline.setBackgroundColor(
            ContextCompat.getColor(requireContext(), viewModel.module.color)
        )
    }

    private fun showConfirmPasswordTextView(){
        binding.confirmPasswordEditText.visibility = VISIBLE
        binding.confirmTextInputUnderline.visibility = VISIBLE
        binding.passwordEditText.visibility = GONE
        binding.textInputUnderline.visibility = GONE
        binding.enterPwdText.setupTextBoxView(
            getString(viewModel.confirmPwdDescription),
            viewModel.module.color)
        binding.confirmPasswordEditText.requestFocus()
    }

}

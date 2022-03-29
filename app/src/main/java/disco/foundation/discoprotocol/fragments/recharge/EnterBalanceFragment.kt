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
import disco.foundation.discoprotocol.components.CustomDialog
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.databinding.FragmentEnterBalanceBinding
import disco.foundation.discoprotocol.fragments.common.BaseFragment
import disco.foundation.discoprotocol.utils.twoDecimalDouble
import disco.foundation.discoprotocol.viewModels.EnterBalanceViewModel


class EnterBalanceFragment : BaseFragment() {

    private val args: EnterBalanceFragmentArgs by navArgs()
    private lateinit var binding: FragmentEnterBalanceBinding
    private lateinit var viewModel: EnterBalanceViewModel


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
        setupButtons()
        setupTextBox()
        setupBalanceInput()
    }

    private fun subscribeToData(){
        viewModel.saving.observe(viewLifecycleOwner){
            when (it) {
                RequestStatus.SUCCESS -> {
                    dialog.update(getString(R.string.balance_to_cart),
                        viewModel.module.color,true, getString(R.string.ok)){
                        dismissDialog()
                    }
                }
                RequestStatus.LOADING -> {
                    dialog.update(getString(R.string.loading), viewModel.module.color,false)
                }
                RequestStatus.ERROR -> {
                   dismissDialog()
                    dialog.update(getString(R.string.something_went_wrong),
                        viewModel.module.color,true, getString(R.string.try_again)
                    ) { dismissDialog() }
                }
                else -> {}
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
                if(binding.enterBalanceEditText.error == null) {
                    viewModel.saveBalance(binding.enterBalanceEditText.text.toString().toDouble())
                }
            }
            false
        }

        binding.enterBalanceInfo.text = getString(R.string.well_recharge, "0")
        // add text changed listener for edit text
        binding.enterBalanceEditText.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                s?.apply {
                    try {
                        val amount = s.toString().toDouble().twoDecimalDouble()
                        binding.enterBalanceInfo.text = getString(R.string.well_recharge, amount.toString())
                        binding.enterBalanceInfo.error = null
                    } catch (e: Exception){
                        binding.enterBalanceInfo.error = ""
                        binding.enterBalanceInfo.text = getString(R.string.invalid_amount)
                    }

                }
            }
            override fun afterTextChanged(s: Editable?) {}
        })
    }

    private fun setupTextBox(){
        binding.enterPasswordTextbox.setupTextBoxView(getString(viewModel.getTextBoxText()), viewModel.module.color)
    }

}
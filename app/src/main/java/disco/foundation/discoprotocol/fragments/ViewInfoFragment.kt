package disco.foundation.discoprotocol.fragments

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.api.RequestStatus
import disco.foundation.discoprotocol.components.CustomPopup
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.databinding.FragmentViewInfoBinding
import disco.foundation.discoprotocol.viewModels.ViewInfoViewModel

class ViewInfoFragment : Fragment() {

    private val args: ViewInfoFragmentArgs by navArgs()
    private lateinit var binding: FragmentViewInfoBinding
    private lateinit var viewModel: ViewInfoViewModel
    private lateinit var progressDialog: CustomPopup

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
        progressDialog = CustomPopup(requireContext())
        binding.ticketInfoContainer.color = viewModel.module.color
        setupButtons()
    }

    private fun subscribeToData(){
        viewModel.ticket.observe(viewLifecycleOwner){
            binding.ticketInfoContainer.setTicket(it)
        }

        viewModel.loading.observe(viewLifecycleOwner){
            when(it){
                RequestStatus.LOADING -> progressDialog.showPopup(
                    getString(R.string.loading),
                    viewModel.module.color,
                    false
                )
                RequestStatus.SUCCESS -> {
                    binding.ticketInfoContainer.visibility = View.VISIBLE
                    progressDialog.dismiss()
                }
                RequestStatus.ERROR -> {
                    progressDialog.updatePopup(
                        getString(R.string.something_went_wrong),
                        showButton = true,
                        getString(R.string.try_again)
                    ){
                        progressDialog.dismiss()
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
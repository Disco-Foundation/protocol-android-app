package disco.foundation.discoprotocol.fragments

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.activities.HomeActivity
import disco.foundation.discoprotocol.api.RequestStatus
import disco.foundation.discoprotocol.components.CustomPopup
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.databinding.FragmentHomeBinding
import disco.foundation.discoprotocol.utils.ModuleType
import disco.foundation.discoprotocol.viewModels.HomeViewModel
import kotlinx.android.synthetic.main.fragment_home.*

@RequiresApi(Build.VERSION_CODES.M)
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: HomeViewModel
    private lateinit var progressDialog : CustomPopup

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container,false)
        progressDialog = CustomPopup(requireContext())
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(
            this,
            HomeViewModel.FACTORY(ProtoDataStoreManager(requireContext()))
        )[HomeViewModel::class.java]
        subscribeToEventData()

    }
    override fun onResume() {
        super.onResume()
        viewModel.getEvent()
        initButtons()
    }

    private fun setupCheckIn(){
        binding.checkInBtn.color = ModuleType.CHECK_IN.color
        binding.checkInBtn.setupAnimation {
            (activity as HomeActivity).goToCheckIn()
        }
    }

    private fun setupRecharge(){
        binding.rechargeBtn.color =  ModuleType.RECHARGE.color
        binding.rechargeBtn.setupAnimation {
            (activity as HomeActivity).goToRecharge()
        }
    }

    private fun setupPurchase(){
        binding.purchaseBtn.color =  ModuleType.PURCHASE.color
        binding.purchaseBtn.setupAnimation {
            (activity as HomeActivity).goToPurchase()
        }
    }

    private fun setupCheckInfo(){
        binding.checkInfoBtn.color =  ModuleType.VIEW_INFO.color
        binding.checkInfoBtn.setupAnimation {
            (activity as HomeActivity).goToViewInfo()
        }
    }

    @SuppressLint("NewApi")
    private fun setupReadQr(){
        val showPopUp = PopupMenu(
            requireContext(),
            binding.qrReader
        )
        showPopUp.inflate(R.menu.settings_menu)
        showPopUp.setForceShowIcon(true)
        showPopUp.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.item1 -> {
                    (activity as HomeActivity).goToReadQr()
                }
            }
            false
        }
        binding.qrReader.setOnClickListener {
            showPopUp.show()
        }
    }

    private fun initButtons(){
        setupCheckIn()
        setupRecharge()
        setupPurchase()
        setupCheckInfo()
        setupReadQr()
    }


    private fun subscribeToEventData() {
        // Observe product data
        viewModel.liveEvent.observe(viewLifecycleOwner
        ) {
            when (it) {
                RequestStatus.LOADING -> {  }
                RequestStatus.ERROR -> {
                    progressDialog.updatePopup(
                        getString(viewModel.errorMsg?: R.string.something_went_wrong),
                        true,
                        getString(R.string.ok)
                    ){
                        progressDialog.dismiss()
                        (activity as HomeActivity).goToReadQr()
                    }
                }
                else -> {
                    progressDialog.dismiss()
                }
            }
        }
    }
}
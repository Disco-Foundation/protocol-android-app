package disco.foundation.discoprotocol.fragments.common

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import disco.foundation.discoprotocol.components.CustomDialog

open class BaseFragment : Fragment() {

    lateinit var dialog : CustomDialog

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog = CustomDialog(requireContext())
    }

    override fun onDestroy() {
        super.onDestroy()
        dismissDialog()
    }

    override fun onPause() {
        super.onPause()
        dismissDialog()
    }

    fun dismissDialog(){
        if(dialog.isShowing) {
            dialog.dismiss()
        }
    }
}
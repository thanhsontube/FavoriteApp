package lab.ts.favoriteapp.host


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.NavHost

import lab.ts.favoriteapp.R



/**
 * A fragment with a Google +1 button.
 */
class HostFragment : Fragment(), NavHost {
    // The URL to +1.  Must be a valid URL.
    private val PLUS_ONE_URL = "http://developer.android.com"
    private var mPlusOneButton: Button? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_host, container, false)

        //Find the +1 button
        mPlusOneButton = view.findViewById<View>(R.id.plus_one_button) as Button

        return view
    }

    override fun onResume() {
        super.onResume()

        // Refresh the state of the +1 button each time the activity receives focus.
    }

    companion object {

        // The request code must be 0 or greater.
        private val PLUS_ONE_REQUEST_CODE = 0
    }

    override fun getNavController(): NavController {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}// Required empty public constructor

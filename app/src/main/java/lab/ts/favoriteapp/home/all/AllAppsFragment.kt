package lab.ts.favoriteapp.home.all


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import lab.ts.favoriteapp.R
import lab.ts.favoriteapp.base.BaseFragment


/**
 * A simple [Fragment] subclass.
 */
class AllAppsFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_all_apps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

//    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
//                              savedInstanceState: Bundle?): View? {
//        // Inflate the layout for this fragment
//        return inflater!!.inflate(R.layout.fragment_all_apps, container, false)
//    }

}

package com.fortatic.apps.nestednavigationexample.one

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.navGraphViewModels
import com.fortatic.apps.nestednavigationexample.R

class BFragment : Fragment() {

    private val modelOne: SharedViewModelOne by navGraphViewModels(R.id.navGraphOne) {
        //defaultViewModelProviderFactory or the ViewModelProvider.Factory you are using.
        defaultViewModelProviderFactory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        //use binding.lifecycleOwner = viewLifecycleOwner
        //to make sure the observer disappears when the fragment is destroyed
        modelOne.item.observe(viewLifecycleOwner, Observer {
            //do Something
        })

        return view
    }

}

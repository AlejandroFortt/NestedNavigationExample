package com.fortatic.apps.nestednavigationexample.two

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.navGraphViewModels
import com.fortatic.apps.nestednavigationexample.R

class DFragment : Fragment() {

    private val modelTwo: SharedViewModelTwo by navGraphViewModels(R.id.navGraphTwo) {
        //defaultViewModelProviderFactory or the ViewModelProvider.Factory you are using.
        defaultViewModelProviderFactory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_d, container, false)

        //use binding.lifecycleOwner = viewLifecycleOwner
        //to make sure the observer disappears when the fragment is destroyed
        modelTwo.item.observe(viewLifecycleOwner, Observer {
            //do Something
        })

        return view
    }

}

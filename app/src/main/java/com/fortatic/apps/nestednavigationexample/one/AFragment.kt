package com.fortatic.apps.nestednavigationexample.one

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fortatic.apps.nestednavigationexample.R
import kotlinx.android.synthetic.main.fragment_a.view.*

class AFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        view.btnA.setOnClickListener {
            findNavController().navigate(R.id.action_AFragment_to_BFragment)
        }
        return view
    }

}

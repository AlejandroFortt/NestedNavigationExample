package com.fortatic.apps.nestednavigationexample.two

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fortatic.apps.nestednavigationexample.R
import kotlinx.android.synthetic.main.fragment_c.view.*

class CFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_c, container, false)
        view.btnC.setOnClickListener {
            findNavController().navigate(R.id.action_CFragment_to_DFragment)
        }
        return view
    }

}

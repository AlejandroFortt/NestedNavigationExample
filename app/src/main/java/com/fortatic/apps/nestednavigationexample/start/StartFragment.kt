package com.fortatic.apps.nestednavigationexample.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fortatic.apps.nestednavigationexample.R
import kotlinx.android.synthetic.main.fragment_start.view.*

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_start, container, false)
        view.btnStart1.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_navGraphOne)
        }
        view.btnStart2.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_navGraphTwo)
        }
        return view
    }

}

package com.example.weathertactons2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation

class InstructionFragment : Fragment() {

//    val model : MyViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.instruction_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        model.myExperimentOrder.observe(viewLifecycleOwner, Observer<Array<Int>>{ order ->
//
//        })

        view.findViewById<View>(R.id.next_button).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.estimation_dest, null)
        )
    }

}
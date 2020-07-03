package com.example.gamesuit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_landing2.*


class Landing2Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_landing2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragment1 = Landing3Fragment()
        val fm = fragmentManager
        btn_fragmant3.setOnClickListener {
            fm?.beginTransaction()?.apply {
                replace(R.id.fagment_contaner, fragment1, Landing3Fragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
        }
        }
    }

}
package com.example.gamesuit

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_landing.*
import kotlinx.android.synthetic.main.fragment_landing2.*


class LandingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_landing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fm1 = Landing2Fragment()
        val mFragmentManager = fragmentManager
        btn_fragmant2.setOnClickListener {
            mFragmentManager?.beginTransaction()?.apply {
                replace(R.id.fagment_contaner, fm1, Landing2Fragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }
    }

}
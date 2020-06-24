package com.example.gamesuit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_landing.*
import kotlinx.android.synthetic.main.fragment_landing2.*
import kotlinx.android.synthetic.main.fragment_landing3.*

class MainActivityfragmant : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityfragmant)

        val fragmentManager = supportFragmentManager
        val fragment = LandingFragment()
        val fragmentPemain = fragmentManager.findFragmentByTag(LandingFragment::class.java.simpleName)

        if (fragmentPemain !is LandingFragment){
            fragmentManager.beginTransaction().add(R.id.fagment_contaner, fragment, LandingFragment::class.java.simpleName).commit()
        }


    }
}
package com.example.gamesuit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_menu.*

class Menu : AppCompatActivity(), View.OnClickListener {
    companion object {
        var user: String? = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        user = intent.getStringExtra("username")
        tv_user.text = user
        tv_user1.text = user

        iv_vspemain.setOnClickListener(this)
        iv_vscpu.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.iv_vspemain -> {
                val menuVsPemain = Intent(this@Menu, MainActivityVsPemain::class.java)
                startActivity(menuVsPemain)
            }
            R.id.iv_vscpu -> {
                val menuVsCpu = Intent(this@Menu, MainActivityVsCpu::class.java)
                startActivity(menuVsCpu)
            }
        }
    }
}
package com.example.gamesuit

import Pemain
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val pemain = Pemain()
    var pemain1 = ""
    var pemain2 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iv_batu.setOnClickListener {
            pemain1 = pemain.permainan[1]
            tampilPemain()
        }
        iv_gunting.setOnClickListener {
            pemain1 = pemain.permainan[0]
            tampilPemain()
        }
        iv_kertas.setOnClickListener {
            pemain1 = pemain.permainan[2]
            tampilPemain()
        }
        iv_batu1.setOnClickListener {
            pemain2 = pemain.permainan[1]
            tampilPemain()
        }
        iv_gunting1.setOnClickListener {
            pemain2 = pemain.permainan[0]
            tampilPemain()
        }
        iv_kertas1.setOnClickListener {
            pemain2 = pemain.permainan[2]
            tampilPemain()
        }


    }

    fun tampilPemain() {
        Toast.makeText(this, "Pemain 1 : $pemain1 Pemain 2 : $pemain2", Toast.LENGTH_LONG).show()
        val hasil = pemain.hasil(pemain1, pemain2)
        tv_pemenang.text = hasil

    }


}

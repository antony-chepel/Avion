package com.tocaboca.tocalifeworlda.jghgn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tocaboca.tocalifeworlda.databinding.ActivityLoxiijxcuhycvBinding

class Loxiijxcuhycv : AppCompatActivity() {
    private lateinit var reweuhsa : ActivityLoxiijxcuhycvBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        reweuhsa = ActivityLoxiijxcuhycvBinding.inflate(layoutInflater)
        setContentView(reweuhsa.root)
        asokdwko()
    }


    private fun asokdwko() = with(reweuhsa){
        crd1.setOnClickListener {
            startActivity(Intent(this@Loxiijxcuhycv,Iqpqpqoisjxc::class.java)
                .putExtra("chs_avion",0)
            )
        }

        crdSec.setOnClickListener {
            startActivity(Intent(this@Loxiijxcuhycv,Iqpqpqoisjxc::class.java)
                .putExtra("chs_avion",1)
            )
        }
    }
}
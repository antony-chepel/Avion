package com.tocaboca.tocalifeworlda.jghgn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tocaboca.tocalifeworlda.R
import com.tocaboca.tocalifeworlda.databinding.ActivityGvokckohudfusdfBinding
import kotlin.random.Random

class Gvokckohudfusdf : AppCompatActivity() {
    private var listScoresTotals : List<Int>? = null
    private lateinit var cxnuvshud : ActivityGvokckohudfusdfBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cxnuvshud = ActivityGvokckohudfusdfBinding.inflate(layoutInflater)
        setContentView(cxnuvshud.root)
        tdsgysdfgy()
    }


    private fun tdsgysdfgy() = with(cxnuvshud){
        val getgst = intent.getIntExtra("totals_avion",100)
        val chos = intent.getIntExtra("chs_avion",0)

        val ings = listOf(
            R.drawable.avalon_it_1,
            R.drawable.avalon_it_2,
            R.drawable.avalon_it_3,
            R.drawable.avalon_it_4,
            R.drawable.avalon_it_5,
            R.drawable.avalon_it_6,
        )

        imSec.setImageResource(ings[Random.nextInt(6)])
        if(chos==0){
            listScoresTotals = listOf(
                100,
                200,
                400,
                500,
                700,
                1000
            )
        }else {
            listScoresTotals = listOf(
                50,
                100,
                200,
                250,
                300,
                500
            )
        }
        val calcscrs = listScoresTotals!![Random.nextInt(6)]
        val totals = calcscrs + getgst
        gftScr.text = "Giftness scores - $getgst"
        tvTotal.text = "Total avion scores - $totals"
        bTr.setOnClickListener {
            startActivity(Intent(this@Gvokckohudfusdf,Loxiijxcuhycv::class.java))
        }

    }
}
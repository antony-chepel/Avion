package com.tocaboca.tocalifeworlda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tocaboca.tocalifeworlda.osdijehu.Woaoaosijsjxhucgysd
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val otkkoodkjiijvc by viewModel<Woaoaosijsjxhucgysd>(named("MainModel"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        otkkoodkjiijvc.bjijicvihuhuxcokd(this)
    }
}
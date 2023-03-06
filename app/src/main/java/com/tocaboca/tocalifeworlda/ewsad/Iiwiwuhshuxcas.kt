package com.tocaboca.tocalifeworlda.dxssdf
import androidx.navigation.fragment.findNavController
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.ViewGroup
import com.tocaboca.tocalifeworlda.R
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.gjiijfjikokocokxov

import org.koin.core.qualifier.named
import android.content.Context
import android.view.View
import android.view.LayoutInflater
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.android.ext.android.inject
import android.content.SharedPreferences
import com.tocaboca.tocalifeworlda.osdijehu.Woaoaosijsjxhucgysd


class Iiwiwuhshuxcas : Fragment() {
    private lateinit var qpqlps: Context
    val njijivcgycgyd by activityViewModel<Woaoaosijsjxhucgysd>(named("MainModel"))

    val btgdsgtyyxhuzchuzxhu: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var sposlxocok: String



    override fun onAttach(context: Context) {
        super.onAttach(context)
        qpqlps = context
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bkvockxcij, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        njijivcgycgyd.dkkookxz.observe(viewLifecycleOwner) {
            if (it!=null) {
                sposlxocok = it.hvbhcijjicvjiidjsi
                btgdsgtyyxhuzchuzxhu.edit().putString(gjiijfjikokocokxov, sposlxocok).apply()
                findNavController().navigate(R.id.teyuhwjjisad)
            }
        }
    }












}
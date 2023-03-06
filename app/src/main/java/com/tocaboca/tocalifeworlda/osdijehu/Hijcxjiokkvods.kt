package com.tocaboca.tocalifeworlda.osdijehu
import android.webkit.WebSettings
import android.webkit.WebView
import android.content.pm.PackageManager
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import android.app.Application








class Hijcxjiokkvods(nvkvockcvkoijfd: Application): ViewModel() {
    val pfpplcplxlplpvokockdji = nvkvockcvkoijfd.packageManager



    fun hfidfikokcxokvko(gokbkovb: String) {
        OneSignal.setExternalUserId(
            gokbkovb,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(dplflplpcvkobkojiv: JSONObject) {
                    try {
                        if (dplflplpcvkobkojiv.has("push") && dplflplpcvkobkojiv.getJSONObject("push").has("success")) {
                            val okfkojivjic = dplflplpcvkobkojiv.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $okfkojivjic"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (dplflplpcvkobkojiv.has("email") && dplflplpcvkobkojiv.getJSONObject("email").has("success")) {
                            val ppwpwllwokskod =
                                dplflplpcvkobkojiv.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $ppwpwllwokskod"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (dplflplpcvkobkojiv.has("sms") && dplflplpcvkobkojiv.getJSONObject("sms").has("success")) {
                            val bnbjvbhyuvbgycvhuhuffd = dplflplpcvkobkojiv.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $bnbjvbhyuvbgycvhuhuffd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    fun jchhxcuhxji(roeossa: String): Boolean {
        try {
            pfpplcplxlplpvokockdji.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }

    fun vpbppbpvokibjvhuc(dplelplpwoks: WebView): WebSettings{
        val lvlokbvhcvuhuhuvchc = dplelplpwoks.settings
        lvlokbvhcvuhuhuvchc.setSupportZoom(true)
        lvlokbvhcvuhuhuvchc.allowFileAccess = true
        lvlokbvhcvuhuhuvchc.javaScriptEnabled = true
        lvlokbvhcvuhuhuvchc.javaScriptCanOpenWindowsAutomatically = true
        lvlokbvhcvuhuhuvchc.builtInZoomControls = true
        lvlokbvhcvuhuhuvchc.cacheMode = WebSettings.LOAD_DEFAULT
        lvlokbvhcvuhuhuvchc.userAgentString = lvlokbvhcvuhuhuvchc.userAgentString.replace("; wv", "")
        lvlokbvhcvuhuhuvchc.allowContentAccess = true
        lvlokbvhcvuhuhuvchc.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        lvlokbvhcvuhuhuvchc.domStorageEnabled = true
        lvlokbvhcvuhuhuvchc.setSupportMultipleWindows(false)
        lvlokbvhcvuhuhuvchc.allowFileAccess = true
        lvlokbvhcvuhuhuvchc.allowContentAccess = true
        lvlokbvhcvuhuhuvchc.mediaPlaybackRequiresUserGesture = false
        lvlokbvhcvuhuhuvchc.loadWithOverviewMode = true
        lvlokbvhcvuhuhuvchc.useWideViewPort = true
        lvlokbvhcvuhuhuvchc.pluginState = WebSettings.PluginState.ON

        lvlokbvhcvuhuhuvchc.displayZoomControls = false

        return lvlokbvhcvuhuhuvchc
    }




}
package com.tocaboca.tocalifeworlda.dxssdf
import org.koin.androidx.viewmodel.ext.android.viewModel
import android.os.Looper
import android.widget.Toast
import android.net.Uri
import org.koin.core.qualifier.named
import java.io.File
import android.content.Intent
import java.text.SimpleDateFormat
import android.webkit.*
import android.util.Log
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.owpwpspa
import android.provider.MediaStore
import android.os.Bundle
import android.os.Handler
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.splxlpzpcp
import com.tocaboca.tocalifeworlda.jghgn.Lpwpwposkxjichuv.fodospsplzoxk
import android.os.Environment
import java.io.IOException
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.tocaboca.tocalifeworlda.osdijehu.Hijcxjiokkvods
import java.util.*





class Uookowkosadx : AppCompatActivity() {
    var apalplpslpxokocijcjivj = ""
    private  val twwuijisji = 1
    private var kckixji: String? = null
    private val vcpxppxpxozxkc by viewModel<Hijcxjiokkvods>(
        named("BeamModel")
    )
    lateinit var sijdji: WebView
    private var vijbkbvkojihyugycxyg = false
    private var fkorkoe: ValueCallback<Array<Uri>>? = null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sijdji = WebView(this)
        setContentView(sijdji)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(sijdji, true)
        vcpxppxpxozxkc.vpbppbpvokibjvhuc(sijdji)

        sijdji.webViewClient = Kiwowkkosoxjicuhz()
        sijdji.webChromeClient = Toqkqooksokkxc()
        sijdji.loadUrl(kkwijsjijixjiczhuhzxus())
    }

    override fun onActivityResult(uewiok: Int, wplslp: Int, lcoxkv: Intent?) {

        if (uewiok != twwuijisji || fkorkoe == null) {
            super.onActivityResult(uewiok, wplslp, lcoxkv)
            return
        }
        var bbjvjiicvjicv: Array<Uri>? = null

        if (wplslp == RESULT_OK) {
            if (lcoxkv == null) {
                if (kckixji != null) {
                    bbjvjiicvjicv = arrayOf(Uri.parse(kckixji))
                }
            } else {
                val wowokso = lcoxkv.dataString
                if (wowokso != null) {
                    bbjvjiicvjicv = arrayOf(Uri.parse(wowokso))
                }
            }
        }
        fkorkoe!!.onReceiveValue(bbjvjiicvjicv)
        fkorkoe = null
        return
    }


    fun eowoowoksoixcji(nvnjcjicv: String?) {
        if (!nvnjcjicv!!.contains("t.me")) {

            if (apalplpslpxokocijcjivj == "") {
                apalplpslpxokocijcjivj = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    nvnjcjicv
                ).toString()

                val elwplpsokkoxkcozcjizxchus = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val wooskoxkoco = elwplpsokkoxkcozcjizxchus.edit()
                wooskoxkoco.putString("SAVED_URL", nvnjcjicv)
                wooskoxkoco.apply()
            }
        }
    }

    inner class Toqkqooksokkxc : WebChromeClient() {

        override fun onShowFileChooser(
            mvmckcvkocojisdhufhu: WebView?,
            hhgydui: ValueCallback<Array<Uri>>?,
            swplqplpls: FileChooserParams?
        ): Boolean {
            fkorkoe?.onReceiveValue(null)
            fkorkoe = hhgydui
            var eywiwokkqookksoksad: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (eywiwokkqookksoksad!!.resolveActivity(packageManager) != null) {
                var hvhibvkocvkcod: File? = null
                try {
                    hvhibvkocvkcod = vjnijcvkoko()
                    eywiwokkqookksoksad.putExtra("PhotoPath", kckixji)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (hvhibvkocvkcod != null) {
                    kckixji = "file:" + hvhibvkocvkcod.absolutePath
                    eywiwokkqookksoksad.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(hvhibvkocvkcod)
                    )
                } else {
                    eywiwokkqookksoksad = null
                }
            }
            val repwpwllpspxpclpz = Intent(Intent.ACTION_GET_CONTENT)
            repwpwllpspxpclpz.addCategory(Intent.CATEGORY_OPENABLE)
            repwpwllpspxpclpz.type = "image/*"
            val hbjijvcjivckokovkodsjifjie: Array<Intent?> = eywiwokkqookksoksad?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val eplwpllpqlpplslp = Intent(Intent.ACTION_CHOOSER)
            eplwpllpqlpplslp.putExtra(Intent.EXTRA_INTENT, repwpwllpspxpclpz)
            eplwpllpqlpplslp.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            eplwpllpqlpplslp.putExtra(Intent.EXTRA_INITIAL_INTENTS, hbjijvcjivckokovkodsjifjie)
            startActivityForResult(eplwpllpqlpplslp, twwuijisji)
            return true
        }

        fun vjnijcvkoko(): File? {
            val dossdllpx = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val icjjixjivixcj = "JPEG_" + dossdllpx + "_"
            val sokwkokooskox = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                icjjixjivixcj,
                ".jpg",
                sokwkokooskox
            )
        }
    }


    override fun onBackPressed() {

        if (sijdji.canGoBack()) {
            if (vijbkbvkojihyugycxyg) {
                sijdji.stopLoading()
                sijdji.loadUrl(apalplpslpxokocijcjivj)
            }
            this.vijbkbvkojihyugycxyg = true
            sijdji.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                vijbkbvkojihyugycxyg = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }


    private fun kkwijsjijixjiczhuhzxus(): String {
        val gokfdkokockox = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)
        val ieiwoowkkos = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val diosofkksodfkoixijjizjics = gokfdkokockox.getString(splxlpzpcp, null)
        val pqllpqlp = gokfdkokockox.getString(owpwpspa, null)
        val icjjixjvixcji = gokfdkokockox.getString(fodospsplzoxk, null)
        when (gokfdkokockox.getString("WebInt", null)) {
            "campaign" -> {
                vcpxppxpxozxkc.hfidfikokcxokvko(pqllpqlp.toString())
            }
            "deepLink" -> {
                vcpxppxpxozxkc.hfidfikokcxokvko(pqllpqlp.toString())
            }
            "deepLinkNOApps" -> {
                vcpxppxpxozxkc.hfidfikokcxokvko(diosofkksodfkoixijjizjics.toString())
            }
            "geo" -> {
                vcpxppxpxozxkc.hfidfikokcxokvko(diosofkksodfkoixijjizjics.toString())
            }
        }
        return ieiwoowkkos.getString("SAVED_URL", icjjixjvixcji).toString()
    }


    inner class Kiwowkkosoxjicuhz: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (vcpxppxpxozxkc.jchhxcuhxji(url)) {

                    val bnnbjiivc = Intent(Intent.ACTION_VIEW)
                    bnnbjiivc.data = Uri.parse(url)
                    startActivity(bnnbjiivc)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            eowoowoksoixcji(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@Uookowkosadx, description, Toast.LENGTH_SHORT).show()
        }
    }




}


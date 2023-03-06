package com.tocaboca.tocalifeworlda.dxssdf

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.tocaboca.tocalifeworlda.osdijehu.Hijcxjiokkvods
import com.tocaboca.tocalifeworlda.osdijehu.Woaoaosijsjxhucgysd
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val mvmcijcihufd = module {

    single  <Twopkpqqlsokxkozc> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Twopkpqqlsokxkozc::class.java)
    }

    single <Losijshuxgyzcxftztcf> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Losijshuxgyzcxftztcf::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://mesmerisingkings.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Sowkoosjixuhcz(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Uwjijisasjdi(get(named("HostInter")))
    }
    single{
        ncxcnxcojiokcxkovokdjihusd()
    }
    single (named("SharedPreferences")) {
        lldockxko(androidApplication())
    }
}

fun lldockxko(hvcjn: Application): SharedPreferences {
    return hvcjn.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun ncxcnxcojiokcxkovokdjihusd(): Gson {
    return GsonBuilder().create()
}

val fppwplwlpskosad = module {
    viewModel (named("MainModel")){
        Woaoaosijsjxhucgysd((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Hijcxjiokkvods(get())
    }
}
package com.sduduzog.slimlauncher.data.model

import com.sduduzog.slimlauncher.models.HomeApp

// NOTE: This App is object is used
data class App(
        val appName: String,
        val packageName: String,
        val activityName: String,
        val userSerial : Long
){
    companion object{
        fun from(homeApp: HomeApp) = App(homeApp.appName, homeApp.packageName, homeApp.activityName, homeApp.userSerial)
    }
}

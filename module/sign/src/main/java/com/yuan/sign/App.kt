package com.yuan.sign

import android.app.Application
import android.util.Log
import com.yuan.root.BaseApplication

class App : BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        Log.d("onCreate","onCreate")
        init(this)
    }

    override fun init(realApplication: Application) {
        super.init(realApplication)
        Log.d("initFun",realApplication.packageName)
    }
}
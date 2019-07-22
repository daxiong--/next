package com.yuan.next

import com.yuan.root.AppInitManager
import com.yuan.root.BaseApplication

class App : BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        AppInitManager.init(this)
    }

}
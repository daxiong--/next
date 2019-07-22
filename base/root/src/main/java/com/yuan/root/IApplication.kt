package com.yuan.root

import android.app.Application

interface IApplication {
    fun isDebug(){

    }

    /**
     * 1.子模块在Application 中 初始化，必须
     * 2.重合性的剔除，比如arouter
     */
    fun init(realApplication: Application){

    }
}
package com.yuan.next

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import com.bumptech.glide.Glide
import com.yuan.root.AppInitManager
import kotlinx.android.synthetic.main.app_activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_activity_welcome)
        supportActionBar?.hide()
        Glide.with(this).load(R.mipmap.ic_launcher).into(image)
        toNext()
    }

    private fun toNext() {
        Handler().postDelayed({
            ARouter.getInstance().build("/sign/login")
                .navigation().let { finish() }
        },3000)
    }

}

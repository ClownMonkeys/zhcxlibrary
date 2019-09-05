package com.zhcx.zhcxlibrary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zhcx.commonlib.StrUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        StrUtils.pri()
    }
}

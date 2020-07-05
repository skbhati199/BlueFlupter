package com.fluper.blueflupter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fluper.bluefluper.BlueActivity

class MainActivity : BlueActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

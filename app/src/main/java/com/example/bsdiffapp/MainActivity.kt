package com.example.bsdiffapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
    }

    private fun test() {
        bspatch("src", "patchfile", "dest")
    }

    external fun bspatch(oldapk: String?, patch: String?, output: String?)

    companion object {
        init {
            System.loadLibrary("bspatch")
        }
    }
}

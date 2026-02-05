package com.example.hisdk

import android.content.Context
import android.widget.Toast

object HiSdk {

    fun showHi(context: Context) {
        Toast.makeText(context, "Hi", Toast.LENGTH_SHORT).show()
    }

    fun getHi(): String {
        return "Hi"
    }
}

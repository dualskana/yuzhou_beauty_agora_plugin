package com.sc.jojo.logic.utils

import android.util.Log

object LogUtil {
    fun v(tag: String?, content: String?) {
        Log.v(tag, content.toString())
    }
}
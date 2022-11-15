package com.app.mylibrary

import android.content.Context
import android.widget.Toast

class Test(var context: Context) {
    init {
        Toast.makeText(context,"From Lib",Toast.LENGTH_SHORT).show()
    }
}
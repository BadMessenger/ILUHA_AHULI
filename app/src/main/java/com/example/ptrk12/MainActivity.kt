package com.example.ptrk12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.graphics.component2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(R.string.hello)
        println(getString(R.string.hello))

    }
    var m = 0
    fun LikeClick(view: View) {
        m++
        val textView: TextView = findViewById(R.id.textView8)
        textView.text = m.toString()

    }
    var m1 = 0
    fun CommentClick(view: View) {
        m1++
        val textView: TextView = findViewById(R.id.textView9)
        textView.text = m1.toString()
    }

}

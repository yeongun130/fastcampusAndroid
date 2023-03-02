package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.databinding.ActivityListenerBinding

class Listener : AppCompatActivity() {

    val binding by lazy { ActivityListenerBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 뷰를 가져오는 방법
        // 1> 직접 찾아서 가져온다.
        // val textView : TextView = findViewById(R.id.txt_hello)
        // 2> ViewBinding
        // binding.txtHello.
    }
}
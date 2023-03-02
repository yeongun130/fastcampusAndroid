package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
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

        with(binding) {
            // 익명 함수
            // 1 -> 람다 방식
            txtHello.setOnClickListener {
                Log.d("Click","Click!!")
            }

            // 2 -> 익명 함수 방식
            txtHello.setOnClickListener(object : View.OnClickListener {
                override fun onClick(p0: View?) {
                    Log.d("Click","Click!!")
                }
            })

            // 3 -> 이름이 필요한 경우
            val click = object : View.OnClickListener{
                override fun onClick(p0: View?) {
                }
            }

            txtHello.setOnClickListener(click)
        }
    }
}
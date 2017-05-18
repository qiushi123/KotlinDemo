package com.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        kotlin实现botton的点击事件
        val btn = findViewById(R.id.button) as Button;
        btn.setOnClickListener {
            myToast("我是用kotlin写的toast");
        }

    }

    //用kotlin创建函数的写法
    fun myToast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show();
    }
}

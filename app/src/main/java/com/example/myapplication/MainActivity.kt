package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var  viewModel: MainViewModel
    lateinit var tv_text :TextView
    lateinit var  bt_buttob : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel= ViewModelProvider(this).get(MainViewModel::class.java)
        tv_text= findViewById(R.id.tv_text)
        bt_buttob= findViewById(R.id.bt_click)

        viewModel.livedata.observe(this, Observer {
            tv_text.text= it
        })


        bt_buttob.setOnClickListener{
            viewModel.updateLivedata()
        }
    }




}
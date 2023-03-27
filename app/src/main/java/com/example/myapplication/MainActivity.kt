package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var dataBinding :ActivityMainBinding
    lateinit var  viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel= ViewModelProvider(this).get(MainViewModel::class.java)

        dataBinding.databind=viewModel
        dataBinding.lifecycleOwner=this

        dataBinding.btClick.setOnClickListener{
            viewModel.updateLivedata()
        }
    }


}
package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val livedata = MutableLiveData<String>("This is fact")

    fun updateLivedata(){
        livedata.value="Another data"
    }




}
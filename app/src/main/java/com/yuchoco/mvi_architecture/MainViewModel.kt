package com.yuchoco.mvi_architecture

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    var data = MutableLiveData<MainModel>()

    init {
        data.value = MainModel("startMainViewModel")
    }
}
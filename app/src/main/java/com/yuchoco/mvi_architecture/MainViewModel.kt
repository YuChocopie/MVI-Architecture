package com.yuchoco.mvi_architecture

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    var data = MutableLiveData<MainModel>()

    var searchText1: String = ""
    var searchText2: String = ""
    init {
        data.value = MainModel("startMainViewModel")
    }

    fun setMultiplcation() {

    }

    fun setDivision(){

    }
}
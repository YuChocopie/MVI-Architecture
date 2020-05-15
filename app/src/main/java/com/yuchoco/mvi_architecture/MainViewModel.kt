package com.yuchoco.mvi_architecture

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    var data = MutableLiveData<MainModel>()

    var searchText1: String = ""
    var searchText2: String = ""
    var mainmodel = MainModel("MainModel")
    init {
        mainmodel.testText = "startMainViewModel"
        data.value = mainmodel
    }

    fun setMultiplcation() {
        mainmodel.testText = searchText1
        render(MainState.DataState(mainmodel))
    }

    fun setDivision(){
        mainmodel.testText = searchText2
        render(MainState.ErrorState("error$searchText2"))

    }

    fun render(state: MainState) {
        when (state) {
            is MainState.DataState -> renderDataState(state)
            is MainState.LoadingState -> renderLoadingState()
            is MainState.ErrorState -> renderErrorState(state)
        }
    }

    fun renderDataState(state: MainState.DataState) {
        mainmodel = state.data
        data.value = mainmodel
    }

    private fun renderErrorState(state: MainState.ErrorState) {
        mainmodel.testText = state.data
        data.value = mainmodel
    }

    private fun renderLoadingState() {
    }


}

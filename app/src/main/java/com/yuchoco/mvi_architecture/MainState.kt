package com.yuchoco.mvi_architecture

sealed class MainState {
    object LoadingState : MainState()
    data class DataState(val data: MainModel) : MainState()
    data class ErrorState(val data: String) : MainState()
    data class ConfirmationState(val main: MainModel) : MainState()
    object FinishState : MainState()
}
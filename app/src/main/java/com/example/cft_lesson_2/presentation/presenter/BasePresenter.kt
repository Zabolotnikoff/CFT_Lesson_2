package com.example.cft_lesson_2.presentation.presenter

import com.example.cft_lesson_2.presentation.ui.ViewContract

open class BasePresenter<ViewC:ViewContract> {
    var viewC:ViewC? = null

    fun attachView (newViewC:ViewC){
        this.viewC = newViewC
        onViewAttached()
    }

    open fun onViewAttached(){

    }

    fun detachView(){
        viewC = null
    }
}
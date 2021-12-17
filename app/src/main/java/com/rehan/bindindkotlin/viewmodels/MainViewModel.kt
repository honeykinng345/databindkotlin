package com.rehan.bindindkotlin.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.rehan.bindindkotlin.model.DataProvider
import com.rehan.bindindkotlin.model.Product


class MainViewModel(application: Application) : AndroidViewModel(application) {

    private var product = DataProvider.productList.get(1)

    fun getProduct(): Product = product

}
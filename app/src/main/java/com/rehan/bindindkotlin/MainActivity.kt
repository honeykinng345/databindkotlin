package com.rehan.bindindkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.rehan.bindindkotlin.model.DataProvider


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* supportFragmentManager.beginTransaction()
            .add(R.id.main_fragment_container, MainFragment(), "main_fragment")
            .commit()*/


        val binding: ViewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.setVariable(BR.dataList, DataProvider.productList.toList())
    }
    fun runCode(): Unit {
        Toast.makeText(applicationContext, "sonu", Toast.LENGTH_SHORT).show()
    }
}
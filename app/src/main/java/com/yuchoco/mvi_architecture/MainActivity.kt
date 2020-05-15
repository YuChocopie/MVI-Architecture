package com.yuchoco.mvi_architecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.yuchoco.mvi_architecture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    protected lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.setVariable(BR.mainVM, viewModel)
        binding.lifecycleOwner = this
    }
}

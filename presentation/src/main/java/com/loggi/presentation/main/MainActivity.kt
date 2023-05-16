package com.loggi.presentation.main

import android.os.Bundle
import androidx.activity.viewModels
import com.loggi.presentation.R
import com.loggi.presentation.base.BaseActivity
import com.loggi.presentation.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {

    override val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind {
            title = "MainActivity"
        }
    }
}
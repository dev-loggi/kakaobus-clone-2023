package com.loggi.presentation.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel

abstract class BaseActivity<B : ViewDataBinding, VM : ViewModel>(
    @LayoutRes private val layoutResId: Int
) : AppCompatActivity() {

    protected lateinit var binding: B
        private set

    protected abstract val viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutResId)

        performDataBinding()
    }

    private fun performDataBinding() {
        binding.lifecycleOwner = this
        binding.executePendingBindings()
    }

    protected fun bind(action: B.() -> Unit) {
        binding.run(action)
    }
}
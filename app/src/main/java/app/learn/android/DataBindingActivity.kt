package app.learn.android

import android.app.Activity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import app.learn.android.databinding.ActivityMainBinding

class DataBindingActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnSubmit.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting() {
        binding.apply {
            val str = resources.getString(R.string.txt_hello) +" "+ edtName.text
            tvGreeting.text =  str
        }
    }
}
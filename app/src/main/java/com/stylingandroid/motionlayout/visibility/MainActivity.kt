package com.stylingandroid.motionlayout.visibility

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.stylingandroid.motionlayout.visibility.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.switch1.setOnCheckedChangeListener { _, isChecked ->
            binding.textView.visibility = if (isChecked) View.VISIBLE else View.GONE
        }
    }
}

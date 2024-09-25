package com.example.multipagetask

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.multipagetask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{ ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with(binding){
            signUpButton.setOnClickListener{
                val intentToSecondActivity =
                    Intent(this@MainActivity, SecondActivity::class.java)
                intentToSecondActivity.putExtra("EXTRA_NUMBER", phoneNumber.text.toString())
                intentToSecondActivity.putExtra("EXTRA_USERNAME", username.text.toString())
                intentToSecondActivity.putExtra("EXTRA_PASSWORD", password.text.toString())
                intentToSecondActivity.putExtra("EXTRA_EMAIL", email.text.toString())
                intentToSecondActivity.putExtra("EXTRA_SEX", sex.text.toString())

                startActivity(intentToSecondActivity)
            }
        }
    }
}
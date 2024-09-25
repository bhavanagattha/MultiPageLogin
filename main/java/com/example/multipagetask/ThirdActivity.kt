package com.example.multipagetask

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.multipagetask.databinding.ActivitySecondBinding
import com.example.multipagetask.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private val binding by lazy { ActivityThirdBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val phoneNumber = intent.getStringExtra("EXTRA_NUMBER")
        val username = intent.getStringExtra("EXTRA_USERNAME")
        val email= intent.getStringExtra("EXTRA_EMAIL")
        val sex = intent.getStringExtra("EXTRA_SEX")

        with(binding) {
            textPhone.text = phoneNumber
            textUsername.text = username
            textEmail.text = email
            textSex.text = sex
        }
    }
}
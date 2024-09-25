package com.example.multipagetask

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multipagetask.ThirdActivity
import com.example.multipagetask.databinding.ActivitySecondBinding
import kotlin.math.sign

class SecondActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val phoneNumber = intent.getStringExtra("EXTRA_NUMBER")
        val username = intent.getStringExtra("EXTRA_USERNAME")
        val password = intent.getStringExtra("EXTRA_PASSWORD")
        val email = intent.getStringExtra("EXTRA_EMAIL")
        val sex = intent.getStringExtra("EXTRA_SEX")

        with(binding) {
            signInButton.setOnClickListener {
                val userName_Check = edtTxtUsername.text.toString()
                val password_Check = edtTxtPassword.text.toString()
                if (username == userName_Check) {
                    if (password == password_Check) {
                        val intentToSecondActivity =
                            Intent(this@SecondActivity, ThirdActivity::class.java)
                        intentToSecondActivity.putExtra("EXTRA_NUMBER", phoneNumber)
                        intentToSecondActivity.putExtra("EXTRA_USERNAME", username)
                        intentToSecondActivity.putExtra("EXTRA_EMAIL", email)
                        intentToSecondActivity.putExtra("EXTRA_SEX", sex)

                        startActivity(intentToSecondActivity)
                    }
                }
            }
        }
    }
}
package com.example.quiz_app

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(false)
        } else {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN



            btn_start.setOnClickListener {

                if (et_name.text.toString().isEmpty()) {
                    Toast.makeText(
                        this,
                        "please enter your name", Toast.LENGTH_SHORT
                    ).show()

                } else {
                    val intent = Intent(this, QuizQuestionActivity::class.java)
                    intent.putExtra(Constants.USER_NAME,et_name.text.toString())
                    startActivity(intent)
                    finish()

                }
            }
        }
    }
}
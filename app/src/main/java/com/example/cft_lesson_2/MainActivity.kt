package com.example.cft_lesson_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonPicture.setOnClickListener {
            imageView.visibility = (View.VISIBLE + View.GONE) - imageView.visibility
        }

        button.setOnClickListener {
            startActivity(Intent(this, NoteListActivity::class.java))
        }
    }
}
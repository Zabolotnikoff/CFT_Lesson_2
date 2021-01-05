package com.example.cft_lesson_2.feature.hello.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.cft_lesson_2.R
import com.example.cft_lesson_2.feature.note.list.presentation.NoteListActivity
import kotlinx.android.synthetic.main.activity_main.*

class HelloActivity : AppCompatActivity() {

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

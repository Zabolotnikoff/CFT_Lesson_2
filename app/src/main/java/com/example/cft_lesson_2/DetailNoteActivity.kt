package com.example.cft_lesson_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail_note.*

class DetailNoteActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_note)

        val parameters = intent.getStringArrayListExtra("Note")
        detailTitle.text = parameters?.get(0)
        detailDescription.text = parameters?.get(1)
    }
}


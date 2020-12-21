package com.example.cft_lesson_2.presentation.ui.note

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cft_lesson_2.R
import com.example.cft_lesson_2.model.entity.Note
import kotlinx.android.synthetic.main.activity_detail_note.*

class NoteDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_note)

        val parameters = intent.getSerializableExtra("Note") as Note?
        detailTitle.text = parameters?.title
        detailDescription.text = parameters?.description
    }
}


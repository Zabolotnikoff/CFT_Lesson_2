package com.example.cft_lesson_2.feature.note.list.domain

import com.example.cft_lesson_2.feature.note.domain.entity.Note

interface NotesRepository {

    fun getNotes(): List<Note>
}
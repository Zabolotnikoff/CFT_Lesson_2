package com.example.cft_lesson_2.feature.note.list.data

import com.example.cft_lesson_2.feature.note.domain.entity.Note
import com.example.cft_lesson_2.feature.note.list.domain.NotesRepository

class NotesRepositoryImpl(
    private val networkNoteDataSource: NetworkNoteDataSource
) : NotesRepository {

    override fun getNotes(): List<Note> = networkNoteDataSource.getNotes()
}
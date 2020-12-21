package com.example.cft_lesson_2.presentation.ui.note.list

import com.example.cft_lesson_2.model.entity.Note
import com.example.cft_lesson_2.presentation.ui.ViewContract

interface NoteListView : ViewContract {

    fun setNoteList(note: List<Note>)

    fun showNoteDetails(note: Note)
}
package com.example.cft_lesson_2.feature.note.list.domain

import com.example.cft_lesson_2.feature.note.domain.entity.Note

class GetNotesUseCase (
    private val notesRepository: NotesRepository
        ){

    operator fun invoke() : List<Note> = notesRepository.getNotes()


}
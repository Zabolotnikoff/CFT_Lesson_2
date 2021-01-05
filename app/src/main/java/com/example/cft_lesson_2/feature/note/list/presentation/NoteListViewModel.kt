package com.example.cft_lesson_2.feature.note.list.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cft_lesson_2.feature.note.domain.entity.Note
import com.example.cft_lesson_2.feature.note.list.domain.GetNotesUseCase
import com.example.cft_lesson_2.feature.util.viewmodel.SingleLiveEvent

class NoteListViewModel(
    getNotesUseCase: GetNotesUseCase
) : ViewModel() {

    val notes = MutableLiveData<List<Note>>()
    val noteClickedEvent = SingleLiveEvent<Note>()

    init {
        notes.value = getNotesUseCase()
    }

    fun noteClicked(note: Note){
        noteClickedEvent.value = note
    }
}
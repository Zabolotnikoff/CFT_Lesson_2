package com.example.cft_lesson_2.presentation.viewmodel.note.list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cft_lesson_2.model.entity.Note
import com.example.cft_lesson_2.presentation.viewmodel.SingleLiveEvent

class NoteListViewModel : ViewModel() {

    private val noteList = listOf(
        Note("Научиться создавать приложения под Android", "Ох уж эта наука..."),
        Note("Сходить в магазин", "Шесть пива, две рыбки. ...Хотя, пива всё таки восемь."),
        Note("Ответить на вопросы из чатика", "Ну..., мне надо подумать"),
        Note("Открыть Америку", "Снаряжаем экспедицию Христофора Колумба"),
        Note(
            "Закрыть Америку",
            "Проверить координаты... Первая, третья, восьмая, четырнадцатая - пуск! "
        ),
        Note("Сдать сессию"),
        Note("Накормить хомяка зёрнами", "Ням-ням... Хрум-хрум..."),
        Note("Накормить кота хомяком", "Мяу... Дайте лучше рыбки")
    )

    val notes = MutableLiveData<List<Note>>()
    val noteClickedEvent = SingleLiveEvent<Note>()

    init {
        notes.value = noteList
    }

    fun noteClicked(note: Note){
        noteClickedEvent.value = note
    }
}
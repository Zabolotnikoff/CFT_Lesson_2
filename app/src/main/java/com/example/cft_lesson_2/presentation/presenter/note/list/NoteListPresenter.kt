package com.example.cft_lesson_2.presentation.presenter.note.list

import com.example.cft_lesson_2.model.entity.Note
import com.example.cft_lesson_2.presentation.presenter.BasePresenter
import com.example.cft_lesson_2.presentation.ui.note.list.NoteListView

class NoteListPresenter : BasePresenter<NoteListView>() {

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

    override fun onViewAttached() {
        viewC?.setNoteList(noteList)
    }

    fun onNoteClicked(note: Note) {
        viewC?.showNoteDetails(note)
    }
}
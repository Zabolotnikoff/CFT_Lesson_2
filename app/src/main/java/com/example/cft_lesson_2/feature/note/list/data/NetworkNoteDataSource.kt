package com.example.cft_lesson_2.feature.note.list.data

import com.example.cft_lesson_2.feature.note.domain.entity.Note

interface NetworkNoteDataSource {

    fun getNotes(): List<Note>
}

class NetworkNoteDataSourceImpl : NetworkNoteDataSource {

    override fun getNotes(): List<Note> =
        listOf(
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
}
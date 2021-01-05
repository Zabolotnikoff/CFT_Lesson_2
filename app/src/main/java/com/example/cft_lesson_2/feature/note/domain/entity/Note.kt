package com.example.cft_lesson_2.feature.note.domain.entity

import java.io.Serializable

data class Note(
    val title: String?,
    val description: String? = "На момент публикации информация отсутствует"
) : Serializable
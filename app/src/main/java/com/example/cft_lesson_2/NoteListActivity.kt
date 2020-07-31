package com.example.cft_lesson_2

import android.content.Intent
import android.os.Bundle
//import android.os.PersistableBundle
//import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
//import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.note_list_activity.*

class NoteListActivity: AppCompatActivity() {

   private val noteList = listOf(
       Note("Научиться создавать приложения под Android", "Ох уж эта наука..."),
       Note("Сходить в магазин", "Шесть пива, две рыбки. ...Хотя, пива всё таки восемь."),
       Note("Ответить на вопросы из чатика", "Ну..., мне надо подумать"),
       Note("Открыть Америку", "Снаряжаем экспедицию Христофора Колумба"),
       Note("Закрыть Америку", "Проверить координаты... Первая, третья, восьмая, четырнадцатая - пуск! "),
       Note("Сдать сессию"),
       Note("Накормить хомяка зёрнами", "Ням-ням... Хрум-хрум..."),
       Note("Накормить кота хомяком", "Мяу... Дайте лучше рыбки")
   )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.note_list_activity)

        val adapter = NoteListAdapter()

        reciclerView.adapter = adapter
        reciclerView.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)

        adapter.setNoteList(noteList)
        adapter.setNoteListener(object : NoteListAdapter.NoteListener {
            override fun onNoteClick(note: Note) {
                val intent = Intent(this@NoteListActivity, DetailNoteActivity::class.java)
                intent.putStringArrayListExtra("Note", arrayListOf(note.title, note.description))
                startActivity(intent)
             }
        })

    }
}
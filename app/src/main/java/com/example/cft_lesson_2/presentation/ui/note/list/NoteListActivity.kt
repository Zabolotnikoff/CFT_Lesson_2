package com.example.cft_lesson_2.presentation.ui.note.list

import android.content.Intent
import android.os.Bundle
//import android.os.PersistableBundle
//import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cft_lesson_2.R
import com.example.cft_lesson_2.model.entity.Note
import com.example.cft_lesson_2.presentation.presenter.note.list.NoteListPresenter
import com.example.cft_lesson_2.presentation.ui.note.NoteDetailActivity
//import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.note_list_activity.*

class NoteListActivity : AppCompatActivity(), NoteListView {

    val presenter = NoteListPresenter()
    val adapter: NoteListAdapter = NoteListAdapter { note -> presenter.onNoteClicked(note) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.note_list_activity)
        presenter.attachView(this)

        val layoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)

        reciclerView.adapter = adapter
        reciclerView.layoutManager = layoutManager

    }

    override fun setNoteList(note: List<Note>) {
        adapter.setNoteList(note)
    }

    override fun showNoteDetails(note: Note) {
        val intent = Intent(this@NoteListActivity, NoteDetailActivity::class.java)
        intent.putExtra("Note", note)
        startActivity(intent)
    }

    override fun onDestroy() {
        presenter.detachView()
        super.onDestroy()
    }
}
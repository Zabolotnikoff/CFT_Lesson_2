package com.example.cft_lesson_2.feature.note.list.presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cft_lesson_2.R
import com.example.cft_lesson_2.feature.note.domain.entity.Note
import com.example.cft_lesson_2.feature.note.detail.presentation.NoteDetailActivity
import com.example.cft_lesson_2.feature.note.list.di.NoteListViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.note_list_activity.*

class NoteListActivity : AppCompatActivity() {


    private val viewModel: NoteListViewModel by viewModels() {
        NoteListViewModelFactory()
    }

    /*   private val viewModel: NoteListViewModel by lazy {
           ViewModelProvider(this).get(NoteListViewModel::class.java)
       }
   */
    private val adapter = NoteListAdapter { note -> viewModel.noteClicked(note) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.note_list_activity)

        viewModel.notes.observe(this, Observer(::setNoteList))
        viewModel.noteClickedEvent.observe(this, Observer(::showNoteDetails))

        val layoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)

        reciclerView.adapter = adapter
        reciclerView.layoutManager = layoutManager
    }

    private fun setNoteList(notesList: List<Note>) {
        adapter.setNoteList(notesList)
    }

    private fun showNoteDetails(note: Note) {
        val intent = Intent(this@NoteListActivity, NoteDetailActivity::class.java)
        intent.putExtra("Note", note)
        startActivity(intent)
    }
}
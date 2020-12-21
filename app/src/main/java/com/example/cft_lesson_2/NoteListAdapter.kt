package com.example.cft_lesson_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cft_lesson_2.model.entity.Note
import java.util.*

class NoteListAdapter(private val clickListener: (Note) -> Unit) : RecyclerView.Adapter<NoteListAdapter.ViewHolder>() {

//    private val noteList: MutableList<Note> = mutableListOf()
    private val noteList: MutableList<Note> = LinkedList()

    fun setNoteList(newNotes: List<Note>) {
        noteList.clear()
        noteList.addAll(newNotes)

        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_note, parent, false)
        return ViewHolder(view, clickListener)
    }

    override fun getItemCount(): Int {
        return noteList.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(noteList[position])
    }

    class ViewHolder(itemView: View, private val noteListener: (Note) -> Unit ) :
        RecyclerView.ViewHolder(itemView) {

        val title: TextView = itemView.findViewById(R.id.itemTitle)

        fun bind(model: Note) {
            title.text = model.title
            itemView.setOnClickListener {
                noteListener(model)
            }
        }
    }
}
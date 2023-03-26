package com.nvkhang96.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.nvkhang96.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.nvkhang96.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}
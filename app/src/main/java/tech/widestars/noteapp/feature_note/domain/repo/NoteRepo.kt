package tech.widestars.noteapp.feature_note.domain.repo

import kotlinx.coroutines.flow.Flow
import tech.widestars.noteapp.feature_note.domain.model.Note

interface NoteRepo {
    fun getNotes(): Flow<List<Note>>
    suspend fun getNoteById(id: Int): Note?
    suspend fun insertNote(note: Note)
    suspend fun deleteNote(note: Note)
}
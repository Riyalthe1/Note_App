package tech.widestars.noteapp.feature_note.data.repo

import kotlinx.coroutines.flow.Flow
import tech.widestars.noteapp.feature_note.data.data_source.NoteDao
import tech.widestars.noteapp.feature_note.domain.model.Note
import tech.widestars.noteapp.feature_note.domain.repo.NoteRepo

class NoteRepoImpl (private val noteDao: NoteDao):NoteRepo {
    override fun getNotes(): Flow<List<Note>> {
        return noteDao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return noteDao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        noteDao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }
}
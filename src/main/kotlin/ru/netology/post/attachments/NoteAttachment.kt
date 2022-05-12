package ru.netology.post.attachments

data class NoteAttachment(
    override var attachmentsId: Long = 1,
    override val type: String = "Note",
    val note: Note = Note(),
) : Attachments

data class Note(
    val attachmentsAlbumId: Long = 1,
    val attachmentsOwnerId: Long = 1,
    val attachmentsUserId: Long = 1,
)
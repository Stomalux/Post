package ru.netology.post.attachments

data class NoteAttachment(

    override var attachmentsId: Long,
    override val attachmentsAlbumId: Long,
    override val attachmentsOwnerId: Long,
    override val attachmentsUserId: Long,
    val type: Note?
) : Attachments {
    override fun infoFun() = "#$attachmentsId by $attachmentsAlbumId at $attachmentsOwnerId --- $type"
}

class Note(
    var realNote: String
)
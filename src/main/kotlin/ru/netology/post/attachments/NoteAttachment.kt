package ru.netology.post.attachments

data class NoteAttachment(

    override var id: Long,
    override val album_id: Long,
    override val owner_id: Long,
    override val user_id: Long,
    val type: Note?
) : Attachments {
    override fun infoFun() = "#$id by $album_id at $owner_id --- $type"
}

class Note(
    var realNote: String
)
package ru.netology.post.attachments

data class DocAttachment(

    override var attachmentsId: Long,
    override val attachmentsAlbumId: Long,
    override val attachmentsOwnerId: Long,
    override val attachmentsUserId: Long,
    val type: Doc?
) : Attachments {
    override fun infoFun() = "#$attachmentsId by $attachmentsAlbumId at $attachmentsOwnerId --- $type"
}

class Doc(
    var realDoc: String
)
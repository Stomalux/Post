package ru.netology.post.attachments

data class PhotoAttachment(

    override var attachmentsId: Long,
    override val attachmentsAlbumId: Long,
    override val attachmentsOwnerId: Long,
    override val attachmentsUserId: Long,
    val type: Photo?
) : Attachments {
    override fun infoFun() = "#$attachmentsId by $attachmentsAlbumId at $attachmentsOwnerId --- $type"
}

class Photo(
    var realPoto: String
)
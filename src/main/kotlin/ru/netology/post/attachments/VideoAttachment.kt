package ru.netology.post.attachments

data class VideoAttachment(

    override var attachmentsId: Long,
    override val attachmentsAlbumId: Long,
    override val attachmentsOwnerId: Long,
    override val attachmentsUserId: Long,
    val type: Video?
) : Attachments {
    override fun infoFun() = "#$attachmentsId by $attachmentsAlbumId at $attachmentsOwnerId --- $type"
}

class Video(
    var realVideo: String
)
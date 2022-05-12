package ru.netology.post.attachments

data class AudioAttachment(

    override var attachmentsId: Long,
    override val attachmentsAlbumId: Long,
    override val attachmentsOwnerId: Long,
    override val attachmentsUserId: Long,
    val type: Audio?
) : Attachments {
    override fun infoFun() = "#$attachmentsId by $attachmentsAlbumId at $attachmentsOwnerId --- $type"
}

class Audio(
    var realAudio: String
)
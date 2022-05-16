package ru.netology.post.attachments

data class AudioAttachment(
    override var attachmentsId: Long = 1,
    override val type: String = "audio",
    val audio: Audio = Audio(),
) : Attachments

data class Audio(
    val attachmentsAlbumId: Long = 1,
    val attachmentsOwnerId: Long = 1,
    val attachmentsUserId: Long = 1,
)
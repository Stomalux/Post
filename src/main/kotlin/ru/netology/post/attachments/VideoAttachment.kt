package ru.netology.post.attachments

data class VideoAttachment(
    override var attachmentsId: Long = 1,
    override val type: String = "video",
    val video: Video = Video(),
) : Attachments

data class Video(
    val attachmentsAlbumId: Long = 1,
    val attachmentsOwnerId: Long = 1,
    val attachmentsUserId: Long = 1,
)
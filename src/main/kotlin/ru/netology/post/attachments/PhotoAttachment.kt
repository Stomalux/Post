package ru.netology.post.attachments

data class PhotoAttachment(
    override var attachmentsId: Long = 1,
    override val type: String = "Photo",
    val photo: Photo = Photo(),
) : Attachments

data class Photo(
    val attachmentsAlbumId: Long = 1,
    val attachmentsOwnerId: Long = 1,
    val attachmentsUserId: Long = 1,
)
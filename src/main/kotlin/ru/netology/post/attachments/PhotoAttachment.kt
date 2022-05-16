package ru.netology.post.attachments

data class PhotoAttachment(
   // override var attachmentsId: Long = 1,
    override val type: String = "photo",
    val photo: Photo = Photo(),
) : Attachments

data class Photo(
    var attachmentsId: Long = 1,
    val attachmentsAlbumId: Long = 1,
    val attachmentsOwnerId: Long = 1,
    val attachmentsUserId: Long = 1,
)
package ru.netology.post.attachments

data class DocAttachment(
    override var attachmentsId: Long = 1,
    override val type: String = "Doc",
    val doc: Doc = Doc(),
) : Attachments

data class Doc(
    val attachmentsAlbumId: Long = 1,
    val attachmentsOwnerId: Long = 1,
    val attachmentsUserId: Long = 1,
)
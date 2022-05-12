package ru.netology.post.attachments

interface Attachments {
    var attachmentsId: Long
    val attachmentsAlbumId: Long
    val attachmentsOwnerId: Long
    val attachmentsUserId: Long

    val info: String
        get() = "#$attachmentsId by $attachmentsAlbumId at $attachmentsOwnerId"

    fun infoFun() = "#$attachmentsId by $attachmentsAlbumId at $attachmentsOwnerId ---"
}
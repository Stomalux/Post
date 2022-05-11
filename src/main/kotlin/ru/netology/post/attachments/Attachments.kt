package ru.netology.post.attachments

interface Attachments {
    var id: Long
    val album_id: Long
    val owner_id: Long
    val user_id: Long

    val info: String
        get() = "#$id by $album_id at $owner_id"

    fun infoFun() = "#$id by $album_id at $owner_id ---"
}
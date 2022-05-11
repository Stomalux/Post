package ru.netology.post.data

import ru.netology.post.attachments.Attachments

data class Post(
    val ownerId: Long = 0,
    val autorId: Long = 1,
    val autorName: String = "Autor1",
    val content: String = "Запись поста номер 1",
    val created: Long = 0,
    var likes: Int = 0,
    val datePost: String = "01.05.2022",

    val attachments: Array<Attachments>? = null
)
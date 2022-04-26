package ru.netology.post.data

data class Post(
    val id: Long = 0,
    val autorId: Long = 1,
    val autorName: String = "Autor1",
    val content: String = "Запись поста номер 1",
    val created: Long = 0,
    val likes: Int = 0
)
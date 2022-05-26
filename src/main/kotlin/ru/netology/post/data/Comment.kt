package ru.netology.post.data

data class Comment(

    val id: Long = 1,
    val fromId: Long = 1,
    val date: String = "01.01.2022",
    val text: String = " ",

    val postId: Int = 0,

    )
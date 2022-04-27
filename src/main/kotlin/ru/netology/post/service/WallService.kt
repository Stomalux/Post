package ru.netology.post.service

import ru.netology.post.data.Post

object WallService {

    private var posts = emptyArray<Post>() //конструктор массива - создает пустой массив
    private var property: Long = 100    // Начальный номер индивидуальных id.


    // присваиваем посту индивидуальный id и записываем в массив
    fun add(post: Post): Post {
        property += 1
        val postId = post.copy(id = property)
        posts += postId
        return posts.last() // возвращаем последний рост
    }

    // перебор с индексом замена поста по индексу

    fun update(post: Post): Boolean {
        val (id, _, _, content) = post

        var ok: Boolean = false
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(content = content) // по индексу ищем нужный пост и меняем content
                ok = true
            }
        }
        return ok
    }

    // печать всех постов
    fun printAll() {
        for (post in posts) {
            println(post.toString())
        }
    }

}
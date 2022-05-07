package ru.netology.post.service

import ru.netology.post.data.Post

object WallService {

    private var posts = emptyArray<Post>() //конструктор массива - создает пустой массив

    fun postsClean() {
        //конструктор массива - создает пустой массив (очищает от заптсей)
        // - функция нужна для теста
        posts = emptyArray<Post>()
    }

    // присваиваем посту индивидуальный id и записываем в массив новая редакция
    fun addPost(postAdd: Post): Post {
        val postId = postAdd.copy(ownerId = (if (posts.isEmpty()) 1 else posts.last().ownerId + 1))
        posts += postId
        return posts.last() // возвращаем последний рост
    }

    // перебор с индексом замена поста по индексу
    fun update(postUpdate: Post): Boolean {
        val (id, _, _, content) = postUpdate
        var ok = false
        for ((index, post) in posts.withIndex()) {
            if (post.ownerId == id) {
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
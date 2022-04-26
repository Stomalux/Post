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
        return posts.last() // возвращаем последний рост first
        //return posts.first()
    }

    // перебор с индексом замена поста по индексу
    fun update(id: Long, nowPost: String): Boolean {
        var ok: Boolean = false
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(content = nowPost) // по индексу ищем нужный пост и меняем content
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

//    fun removeById(id: Long): Boolean {
//        var ok: Boolean = false
//        for ((index, post) in posts.withIndex()) {
//            if (post.id == id) {
//               // val postId = post.copy(id = property)
//                //posts += postId
//             posts.remove(posts[index])
//              //  println(ru.toString())
//           val ru = posts[index].copy()
//                posts -= ru
//
//                // remove.             // = post.copy(content = nowPost) // по индексу ищем нужный пост и меняем content
//                ok = true
//            }
//        }
//        return ok
//
//
//
//
//       // posts.remove(id) // удаляет только первое значение `3`
 //   }

}
package ru.netology

//import WallServise
import org.junit.Test

import org.junit.Assert.*
import ru.netology.post.data.Post
import ru.netology.post.service.WallService

class WallServiseTest {

    @Test
    fun addWallServise() {
       // var posts = emptyArray<Post>() //конструктор массива - создает пустой массив
       // var property: Long = 100

        data class Post(
            val id: Long = 0,
            val autorId: Long = 1,
            val autorName: String = "Autor1",
            val content: String = "Запись поста номер 1",
            val created: Long = 0,
            val likes: Int = 0
        )

        val post2 = ru.netology.post.data.Post(0, 2, "Autor2", "Запись поста номер 2", 2, 2)
        val post3 = ru.netology.post.data.Post(101, 2, "Autor2", "Запись поста номер 2", 2, 2)

        val result = WallService.add(post2)
        println(result.toString())

        assertEquals(post3, result)
    }

    @Test
    fun updateWallServise() {

         //var posts = emptyArray<Post>() //конструктор массива - создает пустой массив
        // var property: Long = 100

        data class Post(
            val id: Long = 0,
            val autorId: Long = 1,
            val autorName: String = "Autor1",
            val content: String = "Запись поста номер 1",
            val created: Long = 0,
            val likes: Int = 0
        )

        val post2 = ru.netology.post.data.Post(0, 2, "Autor2", "Запись поста номер 2", 2, 2)
        //val post3 = ru.netology.post.data.Post(101, 2, "Autor2", "Запись поста номер 2", 2, 2)


        WallService.add(post2)

        val result = WallService.update(101, "updatePost")
            println(result.toString())

        assertEquals(true, result)
    }
}
//
//
//        // Arrange — подготовка данных (задание переменных).
//        val tipKardTest: String = "VK_Pay"
//        val summOldTest: Int = 10_000_00
//        val summNewTest: Int = 15_000_00
//
//        //  Act — выполнение целевого действия (вызов функции).
//        val result = commission(
//
//            tipKard = tipKardTest,
//            summOld = summOldTest,
//            summNew = summNewTest
//        )
//
//        //  Assert — сравнение ожидаемого результата с фактическим.
//        assertEquals(0, result)
//    }
//
//}
//
//

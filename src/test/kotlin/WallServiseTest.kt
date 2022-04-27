package ru.netology


import org.junit.Test

import org.junit.Assert.*
import ru.netology.post.data.Post
import ru.netology.post.service.WallService

class WallServiceTest {
    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService

        // заполняем несколькими постами
        service.add(Post(1, 1, "Autor1", "Запись поста номер 1", 1, 1/* заполняете поля */))
        service.add(Post(2, 2, "Autor2", "Запись поста номер 2", 2, 2/* заполняете поля */))
        val result: Post = service.add(Post(3, 3, "Autor3", "Запись поста номер 3", 3, 3/* заполняете поля */))

        // создаём информацию об обновлении
        val post = Post(103, 3, "Autor3", "Запись поста номер 3", 3, 3/* заполняете поля */)

        // проверяем результат
        assertEquals(post, result)

        // заполняем Пост с изменениями
        val update = Post(101, 1, "Autor1", "Запись обновлена", 1, 1/* заполняете поля */)

        // выполняем целевое действие

        val resultUpdate = service.update(update)


        // проверяем результат (используйте assertTrue или assertFalse)
        assertEquals(true, resultUpdate)
        //  assertTrue(result)

    }
}
package ru.netology


import org.junit.Test

import org.junit.Assert.*
import ru.netology.post.data.Post
import ru.netology.post.service.WallService

class WallServiceTest {
    @Test
    fun addPostTest() {
        // создаём целевой сервис
        val service = WallService

        // Очищаем массив от предыдущих данных
        WallService.postsClean()

        // заполняем несколькими постами
        service.addPost(Post(0, 1, "Autor1", "Запись поста номер 1", 1, 1/* заполняете поля */))
        service.addPost(Post(0, 2, "Autor2", "Запись поста номер 2", 2, 2/* заполняете поля */))
        val result: Post = service.addPost(Post(0, 3, "Autor3", "Запись поста номер 3", 3, 3/* заполняете поля */))

        // создаём информацию об ожидаемом результате
        val post = Post(3, 3, "Autor3", "Запись поста номер 3", 3, 3/* заполняете поля */)

        // проверяем результат
        assertEquals(post, result)
    }

    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val serviceUpdate = WallService

        // Очищаем массив от предыдущих данных
        WallService.postsClean()

        // заполняем несколькими постами
        serviceUpdate.addPost(Post(0, 1, "Autor1", "Запись поста номер 1", 1, 1/* заполняете поля */))
        serviceUpdate.addPost(Post(0, 2, "Autor2", "Запись поста номер 2", 2, 2/* заполняете поля */))
        serviceUpdate.addPost(Post(0, 3, "Autor3", "Запись поста номер 3", 3, 3/* заполняете поля */))

        // заполняем Пост с изменениями
        val update = Post(1, 1, "Autor1", "Запись обновлена", 1, 1/* заполняете поля */)

        // выполняем целевое действие
        val resultUpdate = serviceUpdate.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertEquals(true, resultUpdate)
    }

    @Test
    fun updateExistingNot() {
        // создаём целевой сервис
        val serviceUpdate = WallService

        // Очищаем массив от предыдущих данных
        WallService.postsClean()

        // заполняем несколькими постами
        serviceUpdate.addPost(Post(0, 1, "Autor1", "Запись поста номер 1", 1, 1/* заполняете поля */))
        serviceUpdate.addPost(Post(0, 2, "Autor2", "Запись поста номер 2", 2, 2/* заполняете поля */))
        serviceUpdate.addPost(Post(0, 3, "Autor3", "Запись поста номер 3", 3, 3/* заполняете поля */))

        // заполняем Пост с изменениями
        val update = Post(5, 1, "Autor1", "Запись обновлена", 1, 1/* заполняете поля */)

        // выполняем целевое действие
        val resultUpdate = serviceUpdate.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertEquals(false, resultUpdate)
    }
}
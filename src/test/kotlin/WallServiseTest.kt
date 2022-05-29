package ru.netology


import org.junit.Test

import org.junit.Assert.*
import ru.netology.post.data.Comment
import ru.netology.post.data.Post
import ru.netology.post.data.PostNotFoundException
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
    fun updateExistingTest() {
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
    fun updateExistingNotTest() {
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

    @Test
    fun getIdPostCommentOkTest() {
        // создаём целевой сервис
        val serviceUpdate = WallService

        // Очищаем массив от предыдущих данных
        WallService.postsClean()

        // заполняем несколькими постами
        serviceUpdate.addPost(Post(0, 1, "Autor1", "Запись поста номер 1", 1, 1/* заполняете поля */))
        serviceUpdate.addPost(Post(0, 2, "Autor2", "Запись поста номер 2", 2, 2/* заполняете поля */))
        serviceUpdate.addPost(Post(0, 3, "Autor3", "Запись поста номер 3", 3, 3/* заполняете поля */))
        // создаем комментарии
        val comment1 = Comment(1, 1, "01.01.2021", "Text_1", 5)
        //val comment2 = Comment(2, 2, "02.01.2021", "Text_2", 6)

        // Задаем номер поста
        val id = 1L
        // выполняем целевое действие
        val result = WallService.getIdPostComment(id,comment1)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertEquals(true, result)
    }

    @Test (expected = PostNotFoundException::class)
    fun getIdPostCommentNotTest() {
        // создаём целевой сервис
        val serviceUpdate = WallService

        // Очищаем массив от предыдущих данных
        WallService.postsClean()

        // заполняем несколькими постами
        serviceUpdate.addPost(Post(0, 1, "Autor1", "Запись поста номер 1", 1, 1/* заполняете поля */))
        serviceUpdate.addPost(Post(0, 2, "Autor2", "Запись поста номер 2", 2, 2/* заполняете поля */))
        serviceUpdate.addPost(Post(0, 3, "Autor3", "Запись поста номер 3", 3, 3/* заполняете поля */))
        // создаем комментарии
      //  val comment1 = Comment(1, 1, "01.01.2021", "Text_1", 5)
        val comment2 = Comment(2, 2, "02.01.2021", "Text_2", 6)

        // Задаем номер поста
        val id = 98L
        // выполняем целевое действие
        val result = WallService.getIdPostComment(id,comment2)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertEquals(true, result)
    }






}
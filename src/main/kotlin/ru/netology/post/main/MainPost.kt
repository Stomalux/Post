import ru.netology.post.data.Post
import ru.netology.post.service.WallService

fun main() {

    //создаем посты

    val post1 = Post()
    val post2 = Post(0, 2, "Autor2", "Запись поста номер 2", 2, 2)
    val post3 = post1.copy(0, 3, "Autor3", "Запись поста номер 3", likes = post1.likes + 3)

    // какой пост будем менять после публикации

    val updatePost = "(((((  Пост  изменен  на   новую   запись  ! ))))) "
    val idUpdatePost: Long = 102

    val updatePostNot = "(((((  Пост НЕ изменен  на   новую   запись  !!!!!!!!!!!!!!!!!!!!! ))))) "
    val idUpdatePostNot: Long = 105

    // Печать исходных постов

    println("========================================================")
    println("Исходные посты - id у всех одинаковый. ")
    println("========================================================")
    println(post1)
    println(post2)
    println(post3)

    // запись постов в массив

    WallService.add(post1)
    WallService.add(post2)
    WallService.add(post3)

    // Печать постов в массиве

    println("========================================================")
    println("Посты записаны в массив - id у всех индивидуальный. ")
    println("========================================================")
    WallService.printAll()

    // меняем пост с нужным номером и проверяем изменен пост или нет

    println()
    if (WallService.update(idUpdatePost, updatePost)) {
        println("Изменения записаны!")
    } else println("Изменения не записаны!")

    // Печать изменений

    println("========================================================")
    println("Пост с id - 102 в массивe - изменен. ")
    println("========================================================")
    WallService.printAll()

    println()
    if (WallService.update(idUpdatePostNot, updatePostNot)) {
        println("Изменения записаны!")
    } else println("Изменения не записаны!")

    // Печать изменений

    println("========================================================")
    println("Пост с id - 105 в массивe - НЕ изменен. Такого номера нет! ")
    println("========================================================")
    WallService.printAll()


  // val rem = WallService.removeById(101)
   // println(rem)
}
import ru.netology.post.attachments.attachiMain.AttachiMain
import ru.netology.post.data.Comment
import ru.netology.post.data.Post
import ru.netology.post.data.PostNotFoundException
import ru.netology.post.service.WallService


fun main() {

    //создаем аттачменты
    val attachiForPost = AttachiMain.mainAttachmentsArray()


    //создаем посты

    val post1 = Post()
    val post2 = Post(0, 2, "Autor2", "Запись поста номер 2", 2, 2, "02.05.2022", attachiForPost)
    val post3 = post1.copy(0, 3, "Autor3", "Запись поста номер 3", 3, likes = post1.likes + 3, "03.05.2022")

    // какой пост будем менять после публикации

    val updatePostOk =
        Post(2, 2, "Autor2", "(((((  Пост  изменен  на   новую   запись  ! )))))", 2, 2, "04.05.2022", null)


    val updatePostNot =
        Post(105, 2, "Autor2", "(((((  Пост НЕ изменен  на   новую   запись  !!!!!!!!!!!!!!!!!!!!! )))))", 2, 2)


    // Печать исходных постов

//    println("========================================================")
//    println("Исходные посты - id у всех одинаковый. ")
//    println("========================================================")
//    println(post1)
//    println(post2)
//    println(post3)

    // запись постов в массив

    WallService.addPost(post1)
    WallService.addPost(post2)
    WallService.addPost(post3)
    WallService.addPost(post2)
    WallService.addPost(post2)

    // Печать постов в массиве

//    println("========================================================")
//    println("Посты записаны в массив - id у всех индивидуальный. ")
//    println("========================================================")
//    WallService.printAll()

    // меняем пост с нужным номером и проверяем изменен пост или нет

//    println()
//    if (WallService.update(updatePostOk)) {
//        println("Изменения записаны!")
//    } else println("Изменения не записаны!")

    // Печать изменений

//    println("========================================================")
//    println("Пост с id - 2 в массивe - изменен. ")
//    println("========================================================")
//    WallService.printAll()

//    println()
//    if (WallService.update(updatePostNot)) {
//        println("Изменения записаны!")
//    } else println("Изменения не записаны!")

    // Печать изменений

//    println("========================================================")
//    println("Пост с id - 105 в массивe - НЕ изменен. Такого номера нет! ")
//    println("========================================================")
    WallService.printAll()
//
//
    //   WallService.printAll2()


    println(" Работа с коментариями")
    // создаем комментарии
    val comment1 = Comment(1, 1, "01.01.2021", "Text_1", 5)
    val comment2 = Comment(2, 2, "02.01.2021", "Text_2", 6)
    val comment3 = Comment(3, 3, "03.01.2021", "Text_3", 7)
    // val comment4 = Comment(4,4,"04.01.2021","Text_4",8)
    //  val comment5 = Comment(5,5,"05.01.2021","Text_5",56)

    println()
    println("Всего 5 постов.")

    //  val servis = WallService
    var id = 1L
    WallService.getIdPostComment(id, comment1)
    id = 3
    WallService.getIdPostComment(id, comment2)
    id = 98
    WallService.getIdPostComment(id, comment3)


    //   println()
//    println("Проверяем есть ли номер $id  ?")
//    val postComment = servis.findById(id)?: throw PostNotFoundException("No post with id $id")
//    println(postComment)
//    println("Номер $id имеется. Комментарий загружен.")


}

package ru.netology.post.main

import ru.netology.post.data.Comment
import ru.netology.post.service.WallService

class WorkComment {

  fun createWorkComment()  {   //: Array<Comment>

        val comment1 = Comment(1,1,"01.01.2021","Text_1",5)

        val comment2 = Comment(1,2,"02.01.2021","Text_2",6)
        val comment3 = Comment(1,3,"03.01.2021","Text_3",7)
        val comment4 = Comment(1,4,"04.01.2021","Text_4",8)
        val comment5 = Comment(1,5,"05.01.2021","Text_5",56)


        var (_,_,_,_,postId) = comment1

          WallService.createComment(postId,comment1)

    }
}
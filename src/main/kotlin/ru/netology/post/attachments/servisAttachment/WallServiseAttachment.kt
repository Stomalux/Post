package ru.netology.post.attachments.servisAttachment

import ru.netology.post.attachments.*


object WallServiseAttachment {
    var attachments = emptyArray<Attachments>()
    // добавление Аттачментов в массив

    fun addAttachmentsAllWhenPost(attach: Attachments): Boolean {
        attachments +=attach
        return true}


    // печать всех Аттачментов
    fun printAllAttach() {
        for (attach in attachments) {
            println(attach.toString())
        }
    }

    fun attachmentsClean() {
        //конструктор массива - создает пустой массив Attachments (очищает от заптсей)
        // - функция нужна для теста
        attachments = emptyArray<Attachments>()
    }


}


// добавление Аттачментов в массив

//   fun addAttachmentsAllWhenPost(attach: Attachments): Boolean {

//        when (attach) {
//            is AudioAttachment -> {
//                val postTemp = attach.copy()
//                attachments += postTemp
//                return true
//            }
//            is PhotoAttachment -> {
//                val postTemp = attach.copy()
//                attachments += postTemp
//                return true
//            }
//            is VideoAttachment -> {
//                val postTemp = attach.copy()
//                attachments += postTemp
//                return true
//            }
//            is DocAttachment -> {
//                val postTemp = attach.copy()
//                attachments += postTemp
//                return true
//            }
//            is NoteAttachment -> {
//                val postTemp = attach.copy()
//                attachments += postTemp
//                return true
//            }
//            else -> {
//                println(" Что - то пошло не так ! ")
//                return false
//            }
//        }
//    }
//



// добавление Аттачментов в массив

//    fun addAttachmentsAllWhenPost(attach: Attachments): Boolean {
//
//        when (attach) {
//            is AudioAttachment -> {
//                val postTemp = attach.copy()
//                println("------------------------------------------------------------------------------------")
//                println(postTemp.audio.attachmentsId)
//                println(postTemp.audio)
//                println("================================================================================")
//
//                //val a = (if (attachments.isEmpty()) 1 else attachments.last())
//                // postTemp.attachmentsId = (if (attachments.isEmpty()) 1 else attachments.last().attachmentsId + 1)
//                attachments += postTemp
//
//                val (_, ani) =  postTemp//
//
//                println(ani.attachmentsId)
//
//                println(attachments.last().type)
//
//                //val (_, audio3) = attachments.last() as AudioAttachment
//
//
//                val audio2 = (attachments.last() as AudioAttachment).audio.attachmentsId + 1
//                println(audio2)
//               // println(audio2.attachmentsId)
//                println(attachments.last(2))
//                println("OK!")
//                return true
////            }
////            is PhotoAttachment -> {
////                val postTemp = attach.copy()
////                postTemp.attachmentsId = (if (attachments.isEmpty()) 1 else attachments.last().attachmentsId + 1)
////                attachments += postTemp
////                return true
////            }
////            is VideoAttachment -> {
////                val postTemp = attach.copy()
////                postTemp.attachmentsId = (if (attachments.isEmpty()) 1 else attachments.last().attachmentsId + 1)
////                attachments += postTemp
////                return true
////            }
////            is DocAttachment -> {
////                val postTemp = attach.copy()
////                postTemp.attachmentsId = (if (attachments.isEmpty()) 1 else attachments.last().attachmentsId + 1)
////                attachments += postTemp
////                return true
////            }
////            is NoteAttachment -> {
////                val postTemp = attach.copy()
////                postTemp.attachmentsId = (if (attachments.isEmpty()) 1 else attachments.last().attachmentsId + 1)
////                attachments += postTemp
////                return true
////            }
//            else -> {
//                println(" Что - то пошло не так ! ")
//                return false
//            }
//        }
//    }




//    // добавление Аттачментов в массив
//
//    fun addAttachmentsAllWhenPost(attach: Attachments): Boolean {
//
//        when (attach) {
//            is AudioAttachment -> {
//                val postTemp = attach.copy()
//                postTemp.attachmentsId = (if (attachments.isEmpty()) 1 else attachments.last().attachmentsId + 1)
//                attachments += postTemp
//                return true
//            }
//            is PhotoAttachment -> {
//                val postTemp = attach.copy()
//                postTemp.attachmentsId = (if (attachments.isEmpty()) 1 else attachments.last().attachmentsId + 1)
//                attachments += postTemp
//                return true
//            }
//            is VideoAttachment -> {
//                val postTemp = attach.copy()
//                postTemp.attachmentsId = (if (attachments.isEmpty()) 1 else attachments.last().attachmentsId + 1)
//                attachments += postTemp
//                return true
//            }
//            is DocAttachment -> {
//                val postTemp = attach.copy()
//                postTemp.attachmentsId = (if (attachments.isEmpty()) 1 else attachments.last().attachmentsId + 1)
//                attachments += postTemp
//                return true
//            }
//            is NoteAttachment -> {
//                val postTemp = attach.copy()
//                postTemp.attachmentsId = (if (attachments.isEmpty()) 1 else attachments.last().attachmentsId + 1)
//                attachments += postTemp
//                return true
//            }
//            else -> {
//                println(" Что - то пошло не так ! ")
//                return false
//            }
//        }
//    }
//  postTemp.audio.attachmentsId = (if (attachments.isEmpty()) 1 else (attachments.last() as AudioAttachment).audio.attachmentsId + 1)


//abstract class Attachment
//
//class AudioAttachment : Attachment()
//
//fun main() {
//    val post = Post()
//    val firstAttachment = post.attachments[0]
//    if (firstAttachment is AudioAttachment) {
//        val audioAttachment = firstAttachment
//        println(audioAttachment)
//    }
//}
//}
package ru.netology.post.attachments.servisAttachment

import ru.netology.post.attachments.*


object WallServiseAttachment {
    var attachments = emptyArray<Attachments>()


    // добавление Аттачментов в массив

    fun addAttachmentsAllWhenPost(attach: Attachments): Boolean {

        when (attach) {
            is AudioAttachment -> {
                val postTemp = attach.copy()
                postTemp.id = (if (attachments.isEmpty()) 1 else attachments.last().id + 1)
                attachments += postTemp
                return true
            }
            is PhotoAttachment -> {
                val postTemp = attach.copy()
                postTemp.id = (if (attachments.isEmpty()) 1 else attachments.last().id + 1)
                attachments += postTemp
                return true
            }
            is VideoAttachment -> {
                val postTemp = attach.copy()
                postTemp.id = (if (attachments.isEmpty()) 1 else attachments.last().id + 1)
                attachments += postTemp
                return true
            }
            is DocAttachment -> {
                val postTemp = attach.copy()
                postTemp.id = (if (attachments.isEmpty()) 1 else attachments.last().id + 1)
                attachments += postTemp
                return true
            }
            is NoteAttachment -> {
                val postTemp = attach.copy()
                postTemp.id = (if (attachments.isEmpty()) 1 else attachments.last().id + 1)
                attachments += postTemp
                return true
            }
            else -> {
                println(" Что - то пошло не так ! ")
                return false
            }
        }
    }

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
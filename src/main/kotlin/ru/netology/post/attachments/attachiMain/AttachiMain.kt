package ru.netology.post.attachments.attachiMain

import ru.netology.post.attachments.*
import ru.netology.post.attachments.servisAttachment.WallServiseAttachment

object AttachiMain {
    fun mainAttachmentsArray(): Array<Attachments> {


        // Создаем Аттачи с Audio

        val audio1 = AudioAttachment()
        val audio2 = AudioAttachment()
        val audio3 = AudioAttachment(audio = Audio(3, 3, 3))
        val audio4 = AudioAttachment(audio = Audio(4, 4, 4), type = "Audio")

        // Создаем Аттачи с Video

        val video1 = VideoAttachment()
        val video2 = VideoAttachment()
        val video3 = VideoAttachment(video = Video(3, 3, 3))
        val video4 = VideoAttachment(video = Video(4, 4, 4), type = "Video")

// Создаем Аттачи с Photo

        val photo1 = PhotoAttachment()
        val photo2 = PhotoAttachment()
        val photo3 = PhotoAttachment(photo = Photo(3, 3, 3))
        val photo4 = PhotoAttachment(photo = Photo(4, 4, 4), type = "photo")

        // Создаем Аттачи с Doc

        val doc1 = DocAttachment()
        val doc2 = DocAttachment()
        val doc3 = DocAttachment(doc = Doc(3, 3, 3))
        val doc4 = DocAttachment(doc = Doc(4, 4, 4), type = "Doc")

        // Создаем Аттачи с Note

        val note1 = NoteAttachment()
        val note2 = NoteAttachment()
        val note3 = NoteAttachment(note = Note(3, 3, 3))
        val note4 = NoteAttachment(note = Note(4, 4, 4), type = "Note")






        println("Вводим данные в  мвссив Аттачментов ")

        WallServiseAttachment.addAttachmentsAllWhenPost(audio1)
        WallServiseAttachment.addAttachmentsAllWhenPost(audio2)
        WallServiseAttachment.addAttachmentsAllWhenPost(audio3)
        WallServiseAttachment.addAttachmentsAllWhenPost(audio4)

        WallServiseAttachment.addAttachmentsAllWhenPost(video1)
        WallServiseAttachment.addAttachmentsAllWhenPost(video2)
        WallServiseAttachment.addAttachmentsAllWhenPost(video3)
        WallServiseAttachment.addAttachmentsAllWhenPost(video4)

        WallServiseAttachment.addAttachmentsAllWhenPost(photo1)
        WallServiseAttachment.addAttachmentsAllWhenPost(photo2)
        WallServiseAttachment.addAttachmentsAllWhenPost(photo3)
        WallServiseAttachment.addAttachmentsAllWhenPost(photo4)

        WallServiseAttachment.addAttachmentsAllWhenPost(note1)
        WallServiseAttachment.addAttachmentsAllWhenPost(note2)
        WallServiseAttachment.addAttachmentsAllWhenPost(note3)
        WallServiseAttachment.addAttachmentsAllWhenPost(note4)

        WallServiseAttachment.addAttachmentsAllWhenPost(doc1)
        WallServiseAttachment.addAttachmentsAllWhenPost(doc2)
        WallServiseAttachment.addAttachmentsAllWhenPost(doc3)
        WallServiseAttachment.addAttachmentsAllWhenPost(doc4)


// Пачатаем массив аттачментов
        println("Пачатаем массив аттачментов")
        WallServiseAttachment.printAllAttach()

//        // Создаем Аттачи с фото
//        val photonal = Photo("11111111111111")
//        val photo1 = PhotoAttachment(0, 1, 1, 1, null)
//        val photo2 = PhotoAttachment(0, 2, 2, 2, photonal)
//        val photo3 = PhotoAttachment(0, 3, 3, 3, Photo("11--2222222--111"))
//
//        // Создаем Аттачи с Видео
//        val videonal = Video("===================")
//        val video1 = VideoAttachment(0, 1, 1, 1, null)
//        val video2 = VideoAttachment(0, 2, 2, 2, videonal)
//        val video3 = VideoAttachment(0, 3, 3, 3, Video("----------2222222"))
//
//        // Создаем Аттачи с Audio
//        val audional = Audio ("=========dfgh==========")
//        val audio1 = AudioAttachment(0, 1, 1, 1, null)
//        val audio2 = AudioAttachment(0, 2, 2, 2, audional)
//        val audio3 = AudioAttachment(0, 3, 3, 3, Audio("############2222222"))
//
//        // Создаем Аттачи с Doc
//        val docnal = Doc ("=========tghytyt====")
//        val doc1 = DocAttachment(0, 1, 1, 1, null)
//        val doc2 = DocAttachment(0, 2, 2, 2, docnal)
//        val doc3 = DocAttachment(0, 3, 3, 3, Doc("%%%%%%%%%%%%%%%2222222"))
//
//        // Создаем Аттачи с Note
//        val notenal = Note ("==3333=========")
//        val note1 = NoteAttachment(0, 1, 1, 1, null)
//        val note2 = NoteAttachment(0, 2, 2, 2, notenal)
//        val note3 = NoteAttachment(0, 3, 3, 3, Note("&&&&&&&&&&2222222"))
//
//        println("Вводим данные в  мвссив Аттачментов ")
//        // println()
//        WallServiseAttachment.addAttachmentsAllWhenPost(photo1)
//        // println("Фото Аттач = $photo1")
//        // println(photo1.infoFun())
//        WallServiseAttachment.addAttachmentsAllWhenPost(photo2)
//        // println("Фото Аттач = $photo2")
//        // println(photo2.infoFun())
//        WallServiseAttachment.addAttachmentsAllWhenPost(photo3)
//        //println("Фото Аттач = $photo3")
//        // println(photo3.infoFun())
//        //println()
//
//        WallServiseAttachment.addAttachmentsAllWhenPost(photo1)
//        // println("Фото Аттач = $photo1")
//        // println(photo1.infoFun())
//        WallServiseAttachment.addAttachmentsAllWhenPost(photo2)
//        // println("Фото Аттач = $photo2")
//        // println(photo2.infoFun())
//        WallServiseAttachment.addAttachmentsAllWhenPost(photo3)
//        // println("Фото Аттач = $photo3")
//        // println(photo3.infoFun())
//        //println()
//
//        WallServiseAttachment.addAttachmentsAllWhenPost(audio1)
//        WallServiseAttachment.addAttachmentsAllWhenPost(audio3)
//        WallServiseAttachment.addAttachmentsAllWhenPost(doc1)
//        WallServiseAttachment.addAttachmentsAllWhenPost(doc3)
//        WallServiseAttachment.addAttachmentsAllWhenPost(note1)
//        WallServiseAttachment.addAttachmentsAllWhenPost(note3)
//
//        //println("Вводим данные в Video мвссив ")
//        // println()
//        WallServiseAttachment.addAttachmentsAllWhenPost(video1)
//        // println("Video Аттач = $video1")
//        // println(photo1.infoFun())
//        WallServiseAttachment.addAttachmentsAllWhenPost(video2)
//        //println("Video Аттач = $video2")
//        //println(photo2.infoFun())
//        WallServiseAttachment.addAttachmentsAllWhenPost(video3)
//        // println("Video Аттач = $video3")
//        // println(photo3.infoFun())
//        // println()
//
//        WallServiseAttachment.addAttachmentsAllWhenPost(video1)
//        //println("Video Аттач = $video1")
//        // println(photo1.infoFun())
//        WallServiseAttachment.addAttachmentsAllWhenPost(video2)
//        //println("Video Аттач = $video2")
//        //println(photo2.infoFun())
//        WallServiseAttachment.addAttachmentsAllWhenPost(video3)
//        //println("Video Аттач = $video3")
//        // println(photo3.infoFun())
//        // println()
//        WallServiseAttachment.addAttachmentsAllWhenPost(audio2)
//        WallServiseAttachment.addAttachmentsAllWhenPost(audio3)
//        WallServiseAttachment.addAttachmentsAllWhenPost(doc1)
//        WallServiseAttachment.addAttachmentsAllWhenPost(doc2)
//        WallServiseAttachment.addAttachmentsAllWhenPost(note1)
//        WallServiseAttachment.addAttachmentsAllWhenPost(note2)
//
//        // Пачатаем массив аттачментов
//        println("Пачатаем массив аттачментов")
//        WallServiseAttachment.printAllAttach()
//        //println()
//        //println("11111111111111111111111111111111111111111111111111111111111111111111111111")

        return WallServiseAttachment.attachments // возвращаем массив атачментов

    }
}

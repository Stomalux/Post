package ru.netology

import org.junit.Assert.*
import org.junit.Test
import ru.netology.post.attachments.*
import ru.netology.post.attachments.servisAttachment.WallServiseAttachment

class WallServiseAttachmentTest {

    // Проверяем аттачмент Фото.
    @Test
    fun addAttachmentsAllWhenPostTestPhotoOk() {
        // создаём целевой сервис
        val service = WallServiseAttachment

        // Очищаем массив от предыдущих данных
        WallServiseAttachment.attachmentsClean()

        // заполняем несколькими постами
        val photonal = Photo("11111111111111")
        val photo2 = PhotoAttachment(0, 2, 2, 2, photonal)
        val photo3 = PhotoAttachment(0, 3, 3, 3, Photo("11--2222222--111"))

        service.addAttachmentsAllWhenPost(photo2)
        val addAttachmentOk = service.addAttachmentsAllWhenPost(photo3)

        // проверяем результат
        assertEquals(addAttachmentOk, true)
    }

    // Проверяем аттачмент Видео.
    @Test
    fun addAttachmentsAllWhenPostTestVideoOk() {
        // создаём целевой сервис
        val service = WallServiseAttachment

        // Очищаем массив от предыдущих данных
        WallServiseAttachment.attachmentsClean()

        // заполняем несколькими постами

        val videonal = Video("===================")
        val video2 = VideoAttachment(0, 2, 2, 2, videonal)
        val video3 = VideoAttachment(0, 3, 3, 3, Video("----------2222222"))

        service.addAttachmentsAllWhenPost(video2)
        val addAttachmentOk = service.addAttachmentsAllWhenPost(video3)

        // проверяем результат
        assertEquals(addAttachmentOk, true)
    }

    // Проверяем аттачмент Аудио.
    @Test
    fun addAttachmentsAllWhenPostTestAudioOk() {
        // создаём целевой сервис
        val service = WallServiseAttachment

        // Очищаем массив от предыдущих данных
        WallServiseAttachment.attachmentsClean()

        // заполняем несколькими постами

        val audional = Audio("=========dfgh==========")
        val audio2 = AudioAttachment(0, 2, 2, 2, audional)
        val audio3 = AudioAttachment(0, 3, 3, 3, Audio("############2222222"))

        service.addAttachmentsAllWhenPost(audio2)
        val addAttachmentOk = service.addAttachmentsAllWhenPost(audio3)

        // проверяем результат
        assertEquals(addAttachmentOk, true)
    }

    // Проверяем аттачмент Док.
    @Test
    fun addAttachmentsAllWhenPostTestDocOk() {
        // создаём целевой сервис
        val service = WallServiseAttachment

        // Очищаем массив от предыдущих данных
        WallServiseAttachment.attachmentsClean()

        // заполняем несколькими постами

        val doc1 = DocAttachment(0, 1, 1, 1, null)
        val doc3 = DocAttachment(0, 3, 3, 3, Doc("%%%%%%%%%%%%%%%2222222"))

        service.addAttachmentsAllWhenPost(doc1)
        val addAttachmentOk = service.addAttachmentsAllWhenPost(doc3)

        // проверяем результат
        assertEquals(addAttachmentOk, true)
    }

    // Проверяем аттачмент Ноте.
    @Test
    fun addAttachmentsAllWhenPostTestNoteOk() {
        // создаём целевой сервис
        val service = WallServiseAttachment

        // Очищаем массив от предыдущих данных
        WallServiseAttachment.attachmentsClean()

        // заполняем несколькими постами

        val notenal = Note("==3333=========")
        val note1 = NoteAttachment(0, 1, 1, 1, null)
        val note2 = NoteAttachment(0, 2, 2, 2, notenal)

        service.addAttachmentsAllWhenPost(note1)
        val addAttachmentOk = service.addAttachmentsAllWhenPost(note2)

        // проверяем результат
        assertEquals(addAttachmentOk, true)
    }


    // Проверяем Все аттачменты вместе.
    @Test
    fun addAttachmentsAllWhenPosTestAllOk() {
        // создаём целевой сервис
        val service = WallServiseAttachment

        // Очищаем массив от предыдущих данных
        WallServiseAttachment.attachmentsClean()

        // заполняем несколькими постами
        val photonal = Photo("11111111111111")
        val photo2 = PhotoAttachment(0, 2, 2, 2, photonal)
        val photo3 = PhotoAttachment(0, 3, 3, 3, Photo("11--2222222--111"))

        val videonal = Video("===================")
        val video2 = VideoAttachment(0, 2, 2, 2, videonal)
        val video3 = VideoAttachment(0, 3, 3, 3, Video("----------2222222"))

        val audional = Audio("=========dfgh==========")
        val audio2 = AudioAttachment(0, 2, 2, 2, audional)
        val audio3 = AudioAttachment(0, 3, 3, 3, Audio("############2222222"))


        val doc1 = DocAttachment(0, 1, 1, 1, null)
        val doc3 = DocAttachment(0, 3, 3, 3, Doc("%%%%%%%%%%%%%%%2222222"))

        val notenal = Note("==3333=========")
        val note1 = NoteAttachment(0, 1, 1, 1, null)
        val note2 = NoteAttachment(0, 2, 2, 2, notenal)

        service.addAttachmentsAllWhenPost(photo2)
        service.addAttachmentsAllWhenPost(photo3)

        service.addAttachmentsAllWhenPost(video2)
        service.addAttachmentsAllWhenPost(video3)

        service.addAttachmentsAllWhenPost(audio2)
        service.addAttachmentsAllWhenPost(audio3)

        service.addAttachmentsAllWhenPost(doc1)
        service.addAttachmentsAllWhenPost(doc3)

        service.addAttachmentsAllWhenPost(note1)
        val addAttachmentOk = service.addAttachmentsAllWhenPost(note2)

        // проверяем результат
        assertEquals(addAttachmentOk, true)
    }
}

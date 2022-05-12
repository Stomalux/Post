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

        // Создаем Аттачи с Photo
        val photo1 = PhotoAttachment()
        val photo2 = PhotoAttachment()
        val photo3 = PhotoAttachment(photo = Photo(3, 3, 3))
        val photo4 = PhotoAttachment(photo = Photo(4, 4, 4), type = "photo")

        // Добавляем в массив
        service.addAttachmentsAllWhenPost(photo1)
        service.addAttachmentsAllWhenPost(photo2)
        service.addAttachmentsAllWhenPost(photo3)
        val addAttachmentOk = service.addAttachmentsAllWhenPost(photo4)

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

        // Создаем Аттачи с Video
        val video1 = VideoAttachment()
        val video2 = VideoAttachment()
        val video3 = VideoAttachment(video = Video(3, 3, 3))
        val video4 = VideoAttachment(video = Video(4, 4, 4), type = "Video")

        // Добавляем в массив
        service.addAttachmentsAllWhenPost(video1)
        service.addAttachmentsAllWhenPost(video2)
        service.addAttachmentsAllWhenPost(video3)
        val addAttachmentOk = service.addAttachmentsAllWhenPost(video4)

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

        // Создаем Аттачи с Audio
        val audio1 = AudioAttachment()
        val audio2 = AudioAttachment()
        val audio3 = AudioAttachment(audio = Audio(3, 3, 3))
        val audio4 = AudioAttachment(audio = Audio(4, 4, 4), type = "Audio")

        // Добавляем в массив
        service.addAttachmentsAllWhenPost(audio1)
        service.addAttachmentsAllWhenPost(audio2)
        service.addAttachmentsAllWhenPost(audio3)
        val addAttachmentOk = service.addAttachmentsAllWhenPost(audio4)

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

        // Создаем Аттачи с Doc
        val doc1 = DocAttachment()
        val doc2 = DocAttachment()
        val doc3 = DocAttachment(doc = Doc(3, 3, 3))
        val doc4 = DocAttachment(doc = Doc(4, 4, 4), type = "Doc")

        // Добавляем в массив
        service.addAttachmentsAllWhenPost(doc1)
        service.addAttachmentsAllWhenPost(doc2)
        service.addAttachmentsAllWhenPost(doc3)
        val addAttachmentOk = service.addAttachmentsAllWhenPost(doc4)

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

        // Создаем Аттачи с Note
        val note1 = NoteAttachment()
        val note2 = NoteAttachment()
        val note3 = NoteAttachment(note = Note(3, 3, 3))
        val note4 = NoteAttachment(note = Note(4, 4, 4), type = "Note")

        // Добавляем в массив
        service.addAttachmentsAllWhenPost(note1)
        service.addAttachmentsAllWhenPost(note2)
        service.addAttachmentsAllWhenPost(note3)
        val addAttachmentOk = service.addAttachmentsAllWhenPost(note4)

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

        // Создаем Аттачи

        service.addAttachmentsAllWhenPost(photo1)
        service.addAttachmentsAllWhenPost(photo2)
        service.addAttachmentsAllWhenPost(photo3)
        service.addAttachmentsAllWhenPost(photo4)

        service.addAttachmentsAllWhenPost(video1)
        service.addAttachmentsAllWhenPost(video2)
        service.addAttachmentsAllWhenPost(video3)
        service.addAttachmentsAllWhenPost(video4)


        service.addAttachmentsAllWhenPost(audio1)
        service.addAttachmentsAllWhenPost(audio2)
        service.addAttachmentsAllWhenPost(audio3)
        service.addAttachmentsAllWhenPost(audio4)


        service.addAttachmentsAllWhenPost(doc1)
        service.addAttachmentsAllWhenPost(doc2)
        service.addAttachmentsAllWhenPost(doc3)
        service.addAttachmentsAllWhenPost(doc4)

        service.addAttachmentsAllWhenPost(note1)
        service.addAttachmentsAllWhenPost(note2)
        service.addAttachmentsAllWhenPost(note3)
        val addAttachmentOk = service.addAttachmentsAllWhenPost(note4)

        // проверяем результат
        assertEquals(addAttachmentOk, true)
    }
}

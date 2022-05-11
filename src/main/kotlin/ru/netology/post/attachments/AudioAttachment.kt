package ru.netology.post.attachments

data class AudioAttachment(

    override var id: Long,
    override val album_id: Long,
    override val owner_id: Long,
    override val user_id: Long,
    val type: Audio?
) : Attachments {
    override fun infoFun() = "#$id by $album_id at $owner_id --- $type"
}

class Audio(
    var realAudio: String
)
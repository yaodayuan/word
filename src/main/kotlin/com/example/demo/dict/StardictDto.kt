package com.example.demo.dict

import com.example.demo.anki.Fields
import com.example.demo.anki.Note
import java.io.Serializable
import java.util.StringJoiner

data class StardictDto(
    val word: String,
    val phonetic: String? = null,
    val definition: String? = null,
    val translation: String? = null,
    val exchange: String? = null,
    val links: ArrayList<String> = arrayListOf("https://www.vocabulary.com/dictionary/$word")
) : Serializable {

    fun toNote() = Note(
        fields = Fields(word, "$phonetic<br>$translation<br/>$definition<br/>$exchange<br>"),
    )
}

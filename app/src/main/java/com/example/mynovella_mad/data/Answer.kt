package com.example.mynovella_mad.data

import kotlinx.serialization.Serializable

@Serializable
data class Answer(
    val id: String,
    val nextSceneId: String,
    val text: String
)
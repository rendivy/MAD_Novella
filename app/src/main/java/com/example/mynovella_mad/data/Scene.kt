package com.example.mynovella_mad.data

import kotlinx.serialization.Serializable


@Serializable
data class Scene(
    val answers: List<Answer>,
    val backgroundImage: String,
    val id: String,
    val question: String
)

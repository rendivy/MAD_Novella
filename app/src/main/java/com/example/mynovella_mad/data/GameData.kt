package com.example.mynovella_mad.data
import kotlinx.serialization.Serializable

@Serializable
data class GameData(
    val scenes: List<Scene>
)
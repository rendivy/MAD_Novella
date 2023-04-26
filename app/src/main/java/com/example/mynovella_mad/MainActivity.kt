package com.example.mynovella_mad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.mynovella_mad.data.GameData
import com.example.mynovella_mad.view.FirstScreen
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val jsonString =
                applicationContext.resources.openRawResource(R.raw.game_scenario).bufferedReader()
                    .use { it.readText() }
            val gameData = Json.decodeFromString<GameData>(jsonString)
            FirstScreen(gameData)
        }
    }
}



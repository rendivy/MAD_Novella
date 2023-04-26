package com.example.mynovella_mad.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mynovella_mad.R
import com.example.mynovella_mad.data.GameData
import com.example.mynovella_mad.ui.theme.Blue200
import com.example.mynovella_mad.ui.theme.gameLabel
import com.example.mynovella_mad.ui.theme.robotoMedium
import com.example.mynovella_mad.ui.theme.startLabel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json


@Preview(showBackground = true, device = "spec:width=1080px,height=1920px,dpi=440")
@Composable
fun GreetingsScreen() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .paint(
                    painter = painterResource(id = R.drawable.start_background),
                    contentScale = ContentScale.Crop
                ),
            contentAlignment = Alignment.Center
        )
        {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = gameLabel,
                    fontSize = 36.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Blue200),
                    textAlign = TextAlign.Center
                )

                Button(
                    onClick = {}, modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(0.dp),
                    colors = ButtonDefaults.buttonColors(Color.Blue)
                )
                {
                    Text(
                        text = startLabel,
                        fontSize = 17.sp,
                        fontFamily = robotoMedium,
                        color = Color.White
                    )

                }
            }


        }
    }
}

@Preview(showBackground = true, device = "spec:width=1080px,height=1920px,dpi=440")
@Composable
fun Test() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .paint(
                    painter = painterResource(id = R.drawable.start_background),
                    contentScale = ContentScale.Crop
                ),
            contentAlignment = Alignment.Center
        )
        {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = gameLabel,
                    fontSize = 36.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Blue200),
                    textAlign = TextAlign.Center
                )

                Button(
                    onClick = {}, modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(0.dp),
                    colors = ButtonDefaults.buttonColors(Color.Blue)
                )
                {
                    Text(
                        text = startLabel,
                        fontSize = 17.sp,
                        fontFamily = robotoMedium,
                        color = Color.White
                    )

                }
            }


        }
    }
}


@Composable
fun FirstScreen(gameData: GameData) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center,
    ) {
        Column(verticalArrangement = Arrangement.SpaceBetween) {
            Text(
                text = gameData.scenes[0].answers[0].text,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = gameData.scenes[1].answers[2].text,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
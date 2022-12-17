package com.johnyalam.graphqlandroid.presentation.launch_details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.johnyalam.graphqlandroid.R

@Composable
fun LaunchDetailsItem(item: String, onItemClick: (String) -> Unit) {
    val image: Painter = painterResource(id = R.drawable.person_image)

    Column(modifier = Modifier
        .padding(all = 10.dp)
        .background(color = Color.White)
        .fillMaxWidth()) {
        //Add Padding around message
        Column(modifier = Modifier
            .padding(all = 8.dp)
            .background(color = Color.White)
            .fillMaxWidth()
            .clickable { onItemClick(item) }) {
            Image(
                painter = image,
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    .padding(all = 8.dp)
                    .clip(CircleShape)

            )
            Spacer(modifier = Modifier.width(8.dp))
            Column(
                modifier = Modifier
                    .height(100.dp)
                    .background(color = Color.White)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Hello $item!", style = TextStyle(color = Color.Black), fontSize = 24.sp)
                Text(text = "Hello $item!", style = TextStyle(color = Color.Red), fontSize = 16.sp)
            }
        }

        ClickableText(
            modifier = Modifier
                .background(color = Color.Green)
                .padding(10.dp)
                .fillMaxWidth(),
            text = AnnotatedString("Book Now") ,
            style = TextStyle(color = Color.Black, textAlign = TextAlign.Center),
            onClick = {

            })
        }



}
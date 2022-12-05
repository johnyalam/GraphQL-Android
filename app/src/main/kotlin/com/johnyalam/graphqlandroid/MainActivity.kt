package com.johnyalam.graphqlandroid


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.johnyalam.graphqlandroid.ui.JetpackComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column( modifier = Modifier.padding(10.dp)) {
        //Add Padding around message
        Row(modifier = Modifier
            .padding(all = 8.dp)
            .background(color = Color.White)
            .fillMaxWidth()){
            Image(
                painter = painterResource(R.drawable.person_image),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    .size(100.dp)
                    .padding(all = 8.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column(modifier = Modifier.height(100.dp).background(color = Color.White).fillMaxWidth()) {
                Text(text = "Hello $name!", style =  TextStyle(color = Color.Black), fontSize = 24.sp)
                Text(text = "Hello $name!", style = TextStyle(color = Color.Red), fontSize = 16.sp)
            }
        }

        Row(modifier = Modifier
            .padding(all = 8.dp)
            .background(color = Color.White)
            .fillMaxWidth()){
            Image(
                painter = painterResource(R.drawable.person_image),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    .size(100.dp)
                    .padding(all = 8.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column(modifier = Modifier.height(100.dp).background(color = Color.White)) {
                Text(text = "Hello $name!", style =  TextStyle(color = Color.Black), fontSize = 24.sp)
                Text(text = "Hello $name!", style = TextStyle(color = Color.Red), fontSize = 16.sp)
            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        Greeting("Android")
    }
}





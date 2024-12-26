package com.nagy.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nagy.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent(content = {
            ComposeTheme{
                Greeting("Android")


            }
        })
    }
}








@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier.border(width = 8.dp,Color.Red  ).padding(10.dp)
            .background(Color.Green)

         ,
        fontSize = 30.sp,
       color=MaterialTheme.colorScheme.error ,





    )
//    Button(onClick = {  }, border= BorderStroke(
//        8.dp, Brush.linearGradient(listOf(Color.Green, Color.Red, Color.Blue)))
//    , shape = RoundedCornerShape(10.dp))
//   {
//        Text(text ="Hello $name!",
//            fontSize = 30.sp,
//            color= Color.Red,
//        )


    }

@Preview(
    showBackground = true,
    showSystemUi = true,



)
@Composable
fun GreetingPreview() {

    ComposeTheme {
        Greeting("nagy")

    }
}

package com.example.codigolimpo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.codigolimpo.ui.theme.CodigoLimpoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodigoLimpoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App(){
    Column (
        Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ){
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.Gray)
                .padding(7.dp),
            Arrangement.Center
        ){
            Text(
                text = "App de Notícias",
                style = TextStyle(
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    color = Color.White,
                )
            )

        }
        Row (
            Modifier
                .padding(8.dp)
        ){

        }
        Column (
            Modifier
                .background(Color.Gray)

        ) {

            Row (
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp)

            ){
                Text(
                    text = "Título da Notícia",
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp,
                        color = Color.White,
                    )
                )
            }
            Row (
                Modifier
                    .fillMaxWidth()
            ){
                Text(
                    text = "Conteúdo Curto da Notícia",
                    color = Color.White
                )
            }
            Row (
                Modifier
                    .fillMaxWidth(),
                Arrangement.End

            ){
                Button(onClick = { /*TODO*/ }) {
                    Text(
                        text = "Leia Mais",
                        style = TextStyle(
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight.Thin,
                            fontSize = 14.sp,
                            color = Color.White,
                        )
                    )
                }

            }
        }
        Row (
            Modifier
                .padding(8.dp)
        ){
        }
        Column (
            Modifier
                .background(Color.Gray)
        ) {
            Row (
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ){
                Text(
                    text = "Título da Notícia",
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp,
                        color = Color.White,
                    )
                )
            }
            Row (
                Modifier
                    .fillMaxWidth()
            ){
                Text(
                    text = "Conteúdo Curto da Notícia",
                    color = Color.White
                )
            }
            Row (
                Modifier
                    .fillMaxWidth(),
                Arrangement.End

            ){
                Button(onClick = { /*TODO*/ }) {
                    Text(
                        text = "Leia Mais",
                        style = TextStyle(
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight.Thin,
                            fontSize = 14.sp,
                            color = Color.White,
                        )
                    )
                }

            }
        }
        Row (
            Modifier
                .padding(8.dp)
        ){
        }

        Column (
            Modifier
                .background(Color.Gray)
        ) {
            Row (
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ){
                Text(
                    text = "Título da Notícia",
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp,
                        color = Color.White,
                    )
                )
            }
            Row (
                Modifier
                    .fillMaxWidth()
            ){
                Text(
                    text = "Conteúdo Curto da Notícia",
                    color = Color.White
                )
            }
            Row (
                Modifier
                    .fillMaxWidth(),
                Arrangement.End

            ){
                Button(onClick = { /*TODO*/ }) {
                    Text(
                        text = "Leia Mais",
                        style = TextStyle(
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight.Thin,
                            fontSize = 14.sp,
                            color = Color.White,
                        )
                    )
                }

            }
        }


    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CodigoLimpoTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}
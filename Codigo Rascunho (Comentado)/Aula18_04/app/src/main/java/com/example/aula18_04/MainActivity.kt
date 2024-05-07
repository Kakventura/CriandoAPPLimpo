package com.example.aula18_04

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aula18_04.ui.theme.Aula18_04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // É O QUE CONSTROI A TELA
        setContent {

            Aula18_04Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // CHAMAR A FUNÇÃO AQUI TAMBÉM PARA EXIBIR NO APP
                    App()

                    // PORQUE NÃO TEM MAIS A FUNCAO
                    // Greeting("Android")
                }
            }
        }
    }
}
// CONSTRUÇÃO DE UMA TELA DO ZERO
//OBJETOS DE INTERFACE PRECISAM DO @COMPOSABLE


// A FUNÇÃO NÃO PRECISA ESTAR DENTRO DE UMA CLASSE
@Composable
fun App(){
    // POSICIONAR ELEMENTOS EM UMA COLUNA
    Column (
        Modifier
            .fillMaxWidth() // FAZER PEGAR TODA A TELA (COLUNA) INDEPENDENTE DO DISPOSITIVO
            .background(Color.Blue)
    ){
        Row(
            Modifier
                .fillMaxWidth() // FAZER PEGAR TODA A LINHA NA HORIZONTAL INDEPENDENTE DO DISPOSITIVO
                .background(Color.Yellow)
        ){
            Text(text = "App de Notícias")
        }
        Row (
            Modifier
                .padding(8.dp)
        ){
            // CONTEÚDO VAZIO
        }


        Column (
            //MUDOU A COR DA COLUNA TODA
            Modifier
                .background(Color.Gray)
        ) {


            // COLOCAR COISA NA PRÓXIMA LINHA
            Row (
                Modifier
                    .fillMaxWidth() // FAZER PEGAR TODA A LINHA NA HORIZONTAL INDEPENDENTE DO DISPOSITIVO
                    //.background(Color.Magenta) TIRAR O BACKGROUND
                    .padding(8.dp) // PARA DAR AUMENTAR OS ESPAÇOS DOS ELEMENTOS
            ){
                Text(text = "Título da Notícia" )
            }
            Row (
                Modifier
                    .fillMaxWidth() // FAZER PEGAR TODA A LINHA NA HORIZONTAL INDEPENDENTE DO DISPOSITIVO
                    //.background(Color.Green)

            ){
                Text(text = "Conteúdo Curto da Notícia" )
            }
            Row (
                Modifier
                    .fillMaxWidth(), // FAZER PEGAR TODA A LINHA NA HORIZONTAL INDEPENDENTE DO DISPOSITIVO
                    //.background(Color.Green),
                Arrangement.End // ALINHAMENTO DO BOTÃO NO FIM DA PÁGINA

            ){
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Leia Mais" )
                }

            }
        }
        Row (
            Modifier
                .padding(8.dp)
        ){
            // CONTEÚDO VAZIO
        }

        Column (
            //MUDOU A COR DA COLUNA TODA
            Modifier
                .background(Color.Gray)
        ) {


            // COLOCAR COISA NA PRÓXIMA LINHA
            Row (
                Modifier
                    .fillMaxWidth() // FAZER PEGAR TODA A LINHA NA HORIZONTAL INDEPENDENTE DO DISPOSITIVO
                    //.background(Color.Magenta) TIRAR O BACKGROUND
                    .padding(8.dp) // PARA DAR AUMENTAR OS ESPAÇOS DOS ELEMENTOS
            ){
                Text(text = "Título da Notícia" )
            }
            Row (
                Modifier
                    .fillMaxWidth() // FAZER PEGAR TODA A LINHA NA HORIZONTAL INDEPENDENTE DO DISPOSITIVO
                //.background(Color.Green)

            ){
                Text(text = "Conteúdo Curto da Notícia" )
            }
            Row (
                Modifier
                    .fillMaxWidth(), // FAZER PEGAR TODA A LINHA NA HORIZONTAL INDEPENDENTE DO DISPOSITIVO
                //.background(Color.Green),
                Arrangement.End // ALINHAMENTO DO BOTÃO NO FIM DA PÁGINA

            ){
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Leia Mais" )
                }

            }
        }
        Row (
            Modifier
                .padding(8.dp)
        ){
            // CONTEÚDO VAZIO
        }

        Column (
            //MUDOU A COR DA COLUNA TODA
            Modifier
                .background(Color.Gray)
        ) {


            // COLOCAR COISA NA PRÓXIMA LINHA
            Row (
                Modifier
                    .fillMaxWidth() // FAZER PEGAR TODA A LINHA NA HORIZONTAL INDEPENDENTE DO DISPOSITIVO
                    //.background(Color.Magenta) TIRAR O BACKGROUND
                    .padding(8.dp) // PARA DAR AUMENTAR OS ESPAÇOS DOS ELEMENTOS
            ){
                Text(text = "Título da Notícia" )
            }
            Row (
                Modifier
                    .fillMaxWidth() // FAZER PEGAR TODA A LINHA NA HORIZONTAL INDEPENDENTE DO DISPOSITIVO
                //.background(Color.Green)

            ){
                Text(text = "Conteúdo Curto da Notícia" )
            }
            Row (
                Modifier
                    .fillMaxWidth(), // FAZER PEGAR TODA A LINHA NA HORIZONTAL INDEPENDENTE DO DISPOSITIVO
                //.background(Color.Green),
                Arrangement.End // ALINHAMENTO DO BOTÃO NO FIM DA PÁGINA

            ){
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Leia Mais" )
                }

            }
        }



        /*
        // ROW PARA DAR UM ESPAÇO
        Row (
            Modifier
                .padding(8.dp)
        ){
            // CONTEÚDO VAZIO
        }

        // COLOCAR COISA NA PRÓXIMA LINHA
        Row (
            Modifier
                .fillMaxWidth() // FAZER PEGAR TODA A LINHA NA HORIZONTAL INDEPENDENTE DO DISPOSITIVO
                .background(Color.Magenta)
                .padding(8.dp) // PARA DAR AUMENTAR OS ESPAÇOS DOS ELEMENTOS
        ){
            Text(text = "Título da Notícia" )
        }
        Row (
            Modifier
                .fillMaxWidth() // FAZER PEGAR TODA A LINHA NA HORIZONTAL INDEPENDENTE DO DISPOSITIVO
                .background(Color.Green)

        ){
            Text(text = "Conteúdo Curto da Notícia" )
        }
        Row (
            Modifier
                .fillMaxWidth() // FAZER PEGAR TODA A LINHA NA HORIZONTAL INDEPENDENTE DO DISPOSITIVO
                .background(Color.Green),
                Arrangement.End // ALINHAMENTO DO BOTÃO NO FIM DA PÁGINA

        ){
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Leia Mais" )
            }

        }
        */
    }

}


@Composable
@Preview // PARA TER A VIZUALIZAÇÃO DOS ELEMENTOS VISUAIS
fun AppPreview(){
    Aula18_04Theme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            // CHAMAR A FUNÇÃO AQUI TAMBÉM PARA EXIBIR NO APP
            App()

            // PORQUE NÃO TEM MAIS A FUNCAO
            // Greeting("Android")
        }
    }

    //CHAMAR A FUNÇÃO NO PREVIEW PARA NÃO PRECISAR CODAR DUAS VEZES, CODA APENAS DENTRO DA FUNÇÃO PRINCIPAL, QUE AO CHAMAR O MÉTODO TAMBÉM CHAMA
    fun App(){}
}















/*

NÃO TEM A NECESSIDADE DE TER
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Aula18_04Theme {
        Greeting("Android")
    }
}*/
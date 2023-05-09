package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                    Backgroud()
            }
        }
    }
}

@Preview
@Composable
fun Backgroud(){

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White){

    Image(
        painter = painterResource(id = R.drawable.fundocalculator),
        contentDescription = null,
        contentScale = ContentScale.FillWidth
    )}

    Calculator()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Calculator(){

    var valorEntrada by remember { mutableStateOf("") }

        Column (
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
                ){

            Text(
                text = stringResource(R.string.title),
                textAlign = TextAlign.Center,
                fontSize = 60.sp,
                color = Color(255, 255, 255),
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.W900,
                modifier = Modifier
                    .padding(top = 40.dp)
            )
            
            TextField(
                value = valorEntrada,
                label = {
                    Text(text = stringResource(R.string.cost) )
                        },
                onValueChange = {valorEntrada = it},
                modifier = Modifier
                    .padding(top = 40.dp))

            Text(
                text = stringResource(R.string.result),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color(255, 255, 255),
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Normal,
                modifier = Modifier
                    .padding(top = 40.dp)
            )
        }
    }
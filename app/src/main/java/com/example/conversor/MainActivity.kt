package com.example.conversor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Home()
        }
    }
}

@Composable
fun Home(){
    var real by remember { mutableStateOf("1") }
    var satoshiBTC by remember { mutableStateOf("0,00000150") }
    var bitcoinEmReal = 664134.03
    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(
            text = "Conversor de Moeda",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF006691),
            modifier = Modifier.padding(bottom = 24.dp)
        )
        OutlinedTextField(
            value = real,
            onValueChange = {
                real = it
                val brl = it.toDoubleOrNull()

                if(brl !=null){
                    val btc = brl /bitcoinEmReal
                    satoshiBTC = String.format("%.8f", btc)
                }else{
                    satoshiBTC = ""
                }
            },
            label = {
                Text(
                    text= "Real",
                    fontWeight = FontWeight.Bold
                )
            },
            leadingIcon = {
                Image(
                    painter = painterResource(R.drawable.real),
                    contentDescription = "BRL",
                    modifier = Modifier.size(32.dp)
                )
            },
            maxLines = 1,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            ),
            modifier = Modifier.fillMaxWidth(0.7f)
                .padding(bottom = 30.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = Color(0xFF006691),
                cursorColor = Color(0xFF2196F3),
                focusedLabelColor = Color(0xFF2196F3)
            ),
            textStyle = TextStyle(
                fontSize = 24.sp
            )

        )

        OutlinedTextField(
            value = satoshiBTC,
            onValueChange = {

            },
            label = {
                Text(
                    text= "Bitcoin",
                    fontWeight = FontWeight.Bold
                    )
            },
            leadingIcon = {
                Image(
                    painter = painterResource(R.drawable.bitcoin),
                    contentDescription = "BTC",
                    modifier = Modifier.size(32.dp)
                )
            },
            maxLines = 1,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            ),
            modifier = Modifier.fillMaxWidth(0.7f),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = Color(0xFF006691),
                cursorColor = Color(0xFF2196F3),
                focusedLabelColor = Color(0xFF2196F3)
            ),
            textStyle = TextStyle(
                fontSize = 24.sp
            )

        )

        println("Você pode comprar BTC")

    }
}

@Preview
@Composable
private fun HomePreview(){
    Home()
}

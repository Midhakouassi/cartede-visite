package com.example.cartedevisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartedevisite.ui.theme.CarteDeVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteDeVisiteTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CarteDeVisite(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CarteDeVisite(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.size(180.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(R.drawable.img), contentDescription = "Description")
            Text(text="Midha Kouassi", fontWeight = FontWeight.Bold, fontSize = 26.sp, color = Color(0xFF642CA9))
            Text(text="Community Manager", fontWeight =  FontWeight.Bold)
        }
        Spacer(modifier = Modifier.size(20.dp))
        Column {
            Row {
                Icon(
                    Icons.Rounded.Call,
                    contentDescription = stringResource(id = R.string.call_content_desc),
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(text = "+225 01 41 87 79 28")
            }
            Row {
                Icon(
                    Icons.Rounded.Email,
                    contentDescription = stringResource(id = R.string.email_content_desc),
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(text = "midha@gmail.com")
            }
            Row {
                Icon(
                    Icons.Rounded.LocationOn,
                    contentDescription = stringResource(id = R.string.locationOn_content_desc),
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(text = "Riviera Faya")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CarteDeVisiteTheme {
        CarteDeVisite()
    }
}
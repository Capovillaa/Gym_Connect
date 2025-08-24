package br.com.gabriel.gymconnect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.gabriel.gymconnect.ui.theme.GymConnectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GymConnectTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Image(painter = painterResource(id=R.drawable.logogymconnect),
                contentDescription = null,
            )

            Button(
                onClick = {},
                enabled = true,
                modifier = Modifier.height(40.dp)
                    .width(250.dp)

            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ){
                    Text("Comece Agora")
                    Image(
                        painter = painterResource(id=R.drawable.arrowforward),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                            .width(50.dp)

                    )
                }

            }

            Text("Já possui uma conta?Clique aqui")


        }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GymConnectTheme {
        Greeting()
    }
}
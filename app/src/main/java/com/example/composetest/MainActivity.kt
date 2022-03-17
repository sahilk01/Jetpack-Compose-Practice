package com.example.composetest

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetest.ui.theme.ComposeTestTheme
import com.example.composetest.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
//                ActivityMain(this)
                Box(modifier = Modifier
                    .fillMaxSize()) {
                    MyCard()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyCard(
    image: Painter = painterResource(id = R.drawable.ic_launcher_foreground),
    contentDescription: String = stringResource(R.string.hi),
    title: String = stringResource(id = R.string.hi),
    modifier: Modifier = Modifier
) {

    Card(
        modifier = modifier
            .fillMaxWidth(1f)
            .height(300.dp)
            .padding(20.dp)
           ,
        elevation = 0.dp,
        shape = RoundedCornerShape(12.dp)
    ) {
        Image(painter = image, contentDescription = contentDescription,)

        Box(
            modifier = Modifier.background(
                brush = Brush.verticalGradient(
                    listOf(
                        Color.Transparent,
                        Color.Black
                    ),
                    startY = 600f
                )
            )
        ) {

        }
        Box(
            contentAlignment = Alignment.BottomStart
        ) {
            Text(text = title,
                modifier = Modifier.padding(10.dp), style = Typography.body1
            )
        }
    }

}

//@Preview(showBackground = true)
@Composable
fun ActivityMain(context: Context? = null) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.5f)
            .background(color = Color.Black)
            .padding(start = 20.dp),

        ) {
        Text(
            text = "Hello", color = Color.White,
            modifier = Modifier.padding(top = 20.dp)
        )
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            text = "Sahil",
            color = Color.White
        )
        var offsetX by remember {
            mutableStateOf(0f)
        }
        Text(
            text = "khan",
            color = Color.White,
            modifier = Modifier
                .clickable {
                    Toast
                        .makeText(context, "hi telina", Toast.LENGTH_SHORT)
                        .show()

                }

                .border(
                    1.dp,
                    Color.White,
                    shape = CircleShape
                )
                .padding(5.dp)
                .border(
                    1.dp,
                    Color.White,
                    shape = CircleShape
                )
                .padding(5.dp)
                .border(
                    1.dp,
                    Color.White,
                    shape = CircleShape
                )
                .padding(5.dp)
                .border(
                    1.dp,
                    Color.White,
                    shape = CircleShape
                )
                .padding(5.dp)

        )
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun MyText(text: String = "Sahil") {
    Text(text = text)
}

//@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestTheme {
        Column {
            Greeting("Android")
        }
    }
}


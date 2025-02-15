package acr.appcradle.kotlinjc_composetutorial_example.styles

import acr.appcradle.kotlinjc_composetutorial_example.ui.theme.Purple40
import android.R.attr.name
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun Greeting() {
    val gradient1 = listOf(Cyan, Purple40)
    val gradient2 = listOf(Color(0xFF2be4dc), Color(0xFF243484))

    val boxModifier = Modifier
        .fillMaxSize()
        .background(Brush.Companion.radialGradient(gradient2))

    val textStyle = TextStyle(
        brush = Brush.Companion.linearGradient(gradient1),
        fontSize = 24.sp,
        shadow = Shadow(
            color = Black, offset = Offset(5.0f, 10.0f), blurRadius = 3f
        ),
    )

    Box(
        modifier = boxModifier,
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello $name!",
            style = textStyle.copy(
                drawStyle = Stroke(
                    miter = 10f,
                    width = 2f,
                    join = StrokeJoin.Round
                ),
            ),
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting()
}
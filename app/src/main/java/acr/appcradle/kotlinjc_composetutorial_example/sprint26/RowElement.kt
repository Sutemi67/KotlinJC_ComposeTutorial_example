package acr.appcradle.kotlinjc_composetutorial_example.sprint26

import acr.appcradle.kotlinjc_composetutorial_example.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun RowElement(leftText: String, rightText: String) {
    val leftTextStyle = TextStyle(
        textAlign = TextAlign.End,
        fontStyle = FontStyle.Italic
    )
    Row(
        modifier = Modifier.fillMaxWidth().padding(vertical = 7.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = leftText,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 10.dp),
            style = leftTextStyle
        )
        Text(
            text = rightText,
            modifier = Modifier.weight(1f)
        )
    }
}
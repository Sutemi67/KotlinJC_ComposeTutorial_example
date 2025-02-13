package acr.appcradle.kotlinjc_composetutorial_example.sprint26

import acr.appcradle.kotlinjc_composetutorial_example.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@Composable
fun ProfileImage(contact: Contact) {
    if (contact.imageRes != null) {
        AsyncImage(
            model = contact.imageRes,
            contentDescription = "",
            modifier = Modifier
                .padding(all = 10.dp)
                .size(60.dp)
        )
    } else {
        Box(
            modifier = Modifier
                .padding(all = 10.dp)
                .size(60.dp),
            contentAlignment = Alignment.Center,
        ) {
            Image(painter = painterResource(R.drawable.circle), contentDescription = "null")
            Text(initials(contact))
        }
    }
}

private fun initials(contact: Contact): String =
    "${contact.name.take(1)}${contact.familyName.take(1)}"
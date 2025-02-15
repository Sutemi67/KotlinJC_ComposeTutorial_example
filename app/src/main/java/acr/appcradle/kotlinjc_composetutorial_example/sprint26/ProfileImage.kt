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
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import coil3.compose.AsyncImage

@Composable
fun ProfileImage(contact: Contact) {
    val modifier = Modifier
        .padding(all = dimensionResource(R.dimen.padding))
        .size(dimensionResource(R.dimen.profile_image_size))

    if (contact.imageRes != null) {
        AsyncImage(
            model = contact.imageRes,
            contentDescription = "",
            modifier = modifier
        )
    } else {
        Box(
            modifier = modifier,
            contentAlignment = Alignment.Center,
        ) {
            Image(painter = painterResource(R.drawable.circle), contentDescription = "null")
            Text(initials(contact))
        }
    }
}

private fun initials(contact: Contact): String =
    "${contact.name.take(1)}${contact.familyName.take(1)}"
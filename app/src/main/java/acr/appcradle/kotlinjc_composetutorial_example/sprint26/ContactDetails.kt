package acr.appcradle.kotlinjc_composetutorial_example.sprint26

import acr.appcradle.kotlinjc_composetutorial_example.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ContactDetails(contact: Contact) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfileImage(contact)
        Text("${contact.name}  ${contact.surname ?: ""}")
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(contact.familyName)
            if (contact.isFavorite) {
                Image(
                    painter = painterResource(android.R.drawable.star_big_on),
                    contentDescription = ""
                )
            }
        }
        Spacer(Modifier.height(10.dp))

        RowElement(leftText = stringResource(R.string.phone), rightText = contact.phone)
        RowElement(leftText = stringResource(R.string.address), rightText = contact.address)
        if (contact.email != null) {
            RowElement(leftText = stringResource(R.string.email), rightText = contact.email)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview1() {
    ContactDetails(contact = contact1)
}

@Preview(showBackground = true)
@Composable
fun Preview2() {
    ContactDetails(contact = contact2)
}
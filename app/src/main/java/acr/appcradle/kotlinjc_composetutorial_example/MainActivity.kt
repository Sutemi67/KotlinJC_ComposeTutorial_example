package acr.appcradle.kotlinjc_composetutorial_example

import acr.appcradle.kotlinjc_composetutorial_example.sprint26.ContactDetails
import acr.appcradle.kotlinjc_composetutorial_example.sprint26.contact1
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContactDetails(contact1)
        }
    }
}

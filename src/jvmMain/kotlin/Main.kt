import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import kotlinx.datetime.*


@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Days until new year!") }

    MaterialTheme {

        Button(onClick = {
            text = (daysUntilNewYear())
        }) {
            Text(text)
        }

    }
    
}

fun daysUntilNewYear(): String {
    val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
    val closestNewYear = LocalDate(today.year + 1, 1, 1)
    val daysUntilInt = today.daysUntil(closestNewYear)
    return daysUntilInt.toString()

}


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}



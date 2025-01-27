package def.naisha.componentskits

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AdsClick
import androidx.compose.material.icons.filled.CheckBox
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontStyle
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    // Azul claro para el fondo
    val backgroundColor = Color(0xFFE3F2FD) // Azul Muy Claro

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Home") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = backgroundColor // Fondo azul claro para el TopAppBar
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize() // Asegura que la columna ocupe todo el espacio disponible
                .background(backgroundColor)  // Aplica el color azul claro como fondo de la columna
        ) {
            ItemContact(
                name = "Icons",
                icon = Icons.Default.AdsClick,
                modifier = Modifier.clickable {
                    navController.navigate("icons")
                }
            )
            ItemContact(
                name = "IconsButton",
                icon = Icons.Default.PlayArrow,
                modifier = Modifier.clickable {
                    navController.navigate("button")
                }
            )
            ItemContact(
                name = "TextField",
                icon = Icons.Default.Edit,
                modifier = Modifier.clickable {
                    navController.navigate("text")
                }
            )
            ItemContact(
                name = "CheckBox",
                icon = Icons.Default.CheckBox,
                modifier = Modifier.clickable {
                    navController.navigate("checkbox")
                }
            )

            Spacer(modifier = Modifier.weight(1f)) // Empuja el contenido hacia arriba

            // Agregar el texto en la parte inferior
            Text(
                text = "Created by Cosme Guerrero & Naisha Ayoví & Jaime Cerda",
                modifier = Modifier.padding(16.dp), // Agrega un poco de padding
                fontStyle = FontStyle.Italic, // Aquí se aplica la cursiva
                color = Color.Black // Color del texto, puedes cambiarlo si quieres
            )
        }
    }
}

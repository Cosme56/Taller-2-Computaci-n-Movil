package def.naisha.componentskits.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextScreen(navController: NavController) {
    // Azul claro para el fondo
    val backgroundColor = Color(0xFFE3F2FD) // Azul Muy Claro

    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(
                        onClick = { navController.popBackStack() })
                    {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go to Back"
                        )
                    }
                },
                title = {
                    Text(text = "Text Screen")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = backgroundColor // Azul Claro para el TopAppBar
                )
            )
        }
    ) {
        // Coloca el fondo azul claro en toda la pantalla
        Column(
            modifier = Modifier
                .fillMaxSize() // Ocupa toda la pantalla
                .padding(it) // Aplica los paddingValues proporcionados por Scaffold
                .background(backgroundColor), // Aplica el color de fondo
            horizontalAlignment = Alignment.CenterHorizontally // Centra los elementos horizontalmente
        ) {
            var text by rememberSaveable {
                mutableStateOf("")
            }
            TextField(
                value = text,
                onValueChange = { newValue -> text = newValue },
                modifier = Modifier.padding(16.dp),
                singleLine = true
            )

            var text2 by remember {
                mutableStateOf("")
            }
            TextField(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(0.8f), // Ancho más reducido para centrar
                label = { Text(text = "Enter your name") },
                value = text2,
                onValueChange = { newValue -> text2 = newValue }
            )

            var text3 by remember {
                mutableStateOf("")
            }
            OutlinedTextField(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(0.8f), // Ancho más reducido para centrar
                label = { Text(text = "Enter your name") },
                value = text3,
                onValueChange = { newValue -> text3 = newValue }
            )

            var text4 by remember {
                mutableStateOf("")
            }
            OutlinedTextField(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(0.8f), // Ancho más reducido para centrar
                label = { Text(text = "Enter your name") },
                value = text4,
                onValueChange = { newValue -> text4 = newValue },
                singleLine = true,
                maxLines = 1,
                visualTransformation = PasswordVisualTransformation()
            )

            var text5 by remember {
                mutableStateOf("")
            }
            var showPassword by remember {
                mutableStateOf(false)
            }
            OutlinedTextField(
                trailingIcon = {
                    IconButton(onClick = {
                        showPassword = !showPassword
                    }) {
                        Icon(
                            imageVector = Icons.Default.Visibility,
                            contentDescription = "Visibility of the password"
                        )
                    }
                },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(0.8f), // Ancho más reducido para centrar
                label = { Text(text = "Enter your name") },
                value = text5,
                onValueChange = { newValue -> text5 = newValue },
                singleLine = true,
                maxLines = 1,
                visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation()
            )
        }
    }
}

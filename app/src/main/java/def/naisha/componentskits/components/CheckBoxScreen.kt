package def.naisha.componentskits.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckBoxScreen(navController: NavController) {
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
                    Text(text = "CheckBox Screen")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = backgroundColor // Azul Claro para el TopAppBar
                )
            )
        }
    ) { paddingValues ->
        // Aplicar el color de fondo a toda la pantalla
        Column(
            modifier = Modifier
                .fillMaxSize() // Esto hace que ocupe toda la pantalla
                .padding(paddingValues)
                .background(backgroundColor) // Aquí se aplica el color de fondo
        ) {
            var checkedValue by remember {
                mutableStateOf(false)
            }
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp).clickable {
                    checkedValue = !checkedValue
                }
            ) {
                Checkbox(
                    checked = checkedValue,
                    onCheckedChange = {
                        checkedValue = it
                    }
                )
                Text(text = "Opcion 1")
            }
            HorizontalDivider()
            var checkedValue2 by remember {
                mutableStateOf(false)
            }
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp).clickable {
                    checkedValue = !checkedValue
                }
            ) {
                Checkbox(
                    checked = checkedValue2,
                    onCheckedChange = {
                        // checkedValue2 = it
                    }
                )
                Text(text = "Opcion 2")
            }
        }
    }
}

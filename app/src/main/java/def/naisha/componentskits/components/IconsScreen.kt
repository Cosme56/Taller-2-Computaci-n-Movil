package def.naisha.componentskits.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Bathtub
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.sharp.Call
import androidx.compose.material.icons.twotone.Image
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IconsScreen(navController: NavHostController) {
    // Azul muy claro para el fondo
    val backgroundColor = Color(0xFFE3F2FD) // Azul Muy Claro

    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go to back"
                        )
                    }
                },
                title = {
                    Text(text = "Icons Screen")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = backgroundColor // Fondo azul claro para el TopAppBar
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize() // Asegura que ocupe toda la pantalla
                .padding(paddingValues)
                .verticalScroll(state = rememberScrollState())
                .background(backgroundColor)  // Aplica el color azul claro como fondo de la columna
        ) {
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Edit",
                tint = Color.Green,
                modifier = Modifier
                    .padding(16.dp)
                    .size(100.dp)
            )
            Icon(
                imageVector = Icons.Default.Face, contentDescription = "", modifier = Modifier
                    .padding(16.dp)
                    .size(100.dp)
            )

            Icon(
                imageVector = Icons.Filled.Edit, contentDescription = "", modifier = Modifier
                    .padding(16.dp)
                    .size(100.dp)
            )

            Icon(
                imageVector = Icons.Outlined.Edit, contentDescription = "", modifier = Modifier
                    .padding(16.dp)
                    .size(100.dp)
            )
            Icon(
                imageVector = Icons.Default.Bathtub, contentDescription = "", modifier = Modifier
                    .padding(16.dp)
                    .size(100.dp)
            )

            Icon(
                imageVector = Icons.TwoTone.Image, contentDescription = "", modifier = Modifier
                    .padding(16.dp)
                    .size(100.dp)
            )
            Icon(
                imageVector = Icons.Sharp.Call, contentDescription = "", modifier = Modifier
                    .padding(16.dp)
                    .size(100.dp)
            )

            Icon(
                imageVector = Icons.AutoMirrored.Default.ArrowBack, contentDescription = "", modifier = Modifier
                    .padding(16.dp)
                    .size(100.dp)
            )

            Icon(
                imageVector = Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "", modifier = Modifier
                    .padding(16.dp)
                    .size(100.dp)
            )
        }
    }
}

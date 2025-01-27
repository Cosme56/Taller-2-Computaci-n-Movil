package def.naisha.componentskits.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Airplay
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.CloseFullscreen
import androidx.compose.material.icons.filled.Egg
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Emergency
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Girl
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Tty
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ButtonsScreen(navController: NavController) {
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
                    Text(text = "Buttons Screen")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = backgroundColor // Azul Claro para el TopAppBar
                )
            )
        }
    ) { paddingValues ->
        Row(
            Modifier
                .padding(paddingValues)
                .verticalScroll(
                    state = rememberScrollState())
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.background(backgroundColor) // Aplica el color de fondo al contenido
            ) {
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el primer icono")
                    }
                )
                {
                    Icon(
                        imageVector = Icons.Default.Face,
                        contentDescription = "Icon CheckCircle",
                        tint = Color.Black,
                        modifier = Modifier.size(150.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el primer icono")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = "Icon CheckCircle",
                        tint = Color.Green,
                        modifier = Modifier.size(150.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el primer icono")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Icon CheckCircle",
                        tint = Color.Red,
                        modifier = Modifier.size(150.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el primer icono")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Icon CheckCircle",
                        tint = Color.Magenta,
                        modifier = Modifier.size(150.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el primer icono")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.Emergency,
                        contentDescription = "Icon CheckCircle",
                        tint = Color.Blue,
                        modifier = Modifier.size(150.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el primer icono")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.Airplay,
                        contentDescription = "Icon CheckCircle",
                        tint = Color.LightGray,
                        modifier = Modifier.size(150.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el primer icono")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.Egg,
                        contentDescription = "Icon CheckCircle",
                        tint = Color.Cyan,
                        modifier = Modifier.size(150.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el primer icono")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.Tty,
                        contentDescription = "Icon CheckCircle",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(150.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el primer icono")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.Girl,
                        contentDescription = "Icon CheckCircle",
                        tint = Color.Gray,
                        modifier = Modifier.size(150.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el primer icono")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Icon CheckCircle",
                        tint = Color.Yellow,
                        modifier = Modifier.size(150.dp)
                    )
                }
                ElevatedButton(
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Red
                    ),
                    modifier = Modifier.padding(50.dp).width(300.dp),
                    onClick = { println("soy un elevated button")} ){
                    Text(text = "Elevated Button")
                }
                OutlinedButton(
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.Magenta
                    ),
                    onClick = { println("soy un outlined button") } ) {
                    Text(text = "Soy in outlined button")
                }
                FilledIconButton(onClick = {/*Todo*/}) {
                    Icon(imageVector = Icons.Default.CloseFullscreen, contentDescription = "Close")
                }
                ElevatedButton(
                    enabled = false,
                    onClick = { }) {
                    Text(text = "Soy un boton")
                }
            }
        }
    }
}

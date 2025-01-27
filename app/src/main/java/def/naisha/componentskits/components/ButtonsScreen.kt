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
import androidx.compose.material.icons.filled.*
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
                // Los tres primeros iconos permanecen iguales
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

                // Los siguientes iconos han sido cambiados con colores personalizados
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el icono de carrito")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.AddShoppingCart,
                        contentDescription = "Icon Add Shopping Cart",
                        tint = Color(0xFF3E64FF), // Color azul
                        modifier = Modifier.size(150.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el icono de like")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.ThumbUp,
                        contentDescription = "Icon ThumbUp",
                        tint = Color(0xFFFF4081), // Color rosa
                        modifier = Modifier.size(150.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el icono de alarma")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.Alarm,
                        contentDescription = "Icon Alarm",
                        tint = Color(0xFFFFEB3B), // Color amarillo
                        modifier = Modifier.size(150.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el icono de búsqueda")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Icon Search",
                        tint = Color(0xFF4CAF50), // Color verde
                        modifier = Modifier.size(150.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el icono de música")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.MusicNote,
                        contentDescription = "Icon MusicNote",
                        tint = Color(0xFF03A9F4), // Color azul claro
                        modifier = Modifier.size(150.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el icono de historia")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.History,
                        contentDescription = "Icon History",
                        tint = Color(0xFF9C27B0), // Color morado
                        modifier = Modifier.size(150.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el icono de casa")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = "Icon Home",
                        tint = Color(0xFFFFC107), // Color ámbar
                        modifier = Modifier.size(150.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = {
                        println("Soy el icono de configuración")
                    }
                ){
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "Icon Settings",
                        tint = Color(0xFF8BC34A), // Color verde
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

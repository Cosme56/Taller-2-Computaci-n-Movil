package def.naisha.componentskits

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextOverflow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemContact(name: String, icon: ImageVector, modifier: Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)  // Aumenta la altura de la fila para evitar que el texto se corte
            .padding(16.dp)
            .background(
                Brush.linearGradient(
                    colors = listOf(Color(0xFF81C784), Color(0xFF81D4FA)) // Verde Claro a Azul Claro
                )
                ,
                shape = RoundedCornerShape(12.dp) // Bordes redondeados
            )
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Ícono en la mitad izquierda, centrado sin fondo adicional
        Icon(
            imageVector = icon,
            contentDescription = "Icon",
            modifier = Modifier.size(64.dp), // Tamaño del ícono
            tint = Color.White
        )

        // Nombre en la mitad derecha, ajustando el tamaño y el texto para evitar que se corte
        Text(
            text = name,
            style = TextStyle(
                fontSize = 20.sp,  // Tamaño de la fuente
                fontWeight = FontWeight.Bold
            ),
            color = Color.White,
            modifier = Modifier.weight(1f), // Esto asegura que el texto ocupe el espacio restante
            maxLines = 1,  // Asegura que el texto no se divida en varias líneas
            overflow = TextOverflow.Ellipsis // Esto agrega '...' si el texto es demasiado largo
        )

        // Ícono de flecha a la derecha
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "Go to see the component",
                modifier = Modifier.size(24.dp),
                tint = Color.White
            )
        }
    }
}

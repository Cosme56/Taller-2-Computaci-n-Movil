package def.naisha.componentskits

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import def.naisha.componentskits.components.ButtonsScreen
import def.naisha.componentskits.components.CheckBoxScreen
import def.naisha.componentskits.components.IconsScreen
import def.naisha.componentskits.components.TextScreen


@Composable
fun NavHostController(){
    val navController= rememberNavController()
    NavHost(navController= navController, startDestination= "home"){
        composable(route="home"){ HomeScreen(navController) }
        composable(route="text"){ TextScreen(navController) }
        composable(route="icons"){ IconsScreen(navController) }
        composable(route="button"){ ButtonsScreen(navController) }
        composable(route="checkbox"){ CheckBoxScreen(navController) }
    }
}
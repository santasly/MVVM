package com.example.mvvm.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvm.ui.theme.screens.home.HomeScreen
import com.example.mvvm.ui.theme.screens.login.LoginScreen
import com.example.mvvm.ui.theme.screens.register.RegisterScreen

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_LOGIN
) {

    NavHost(navController=navController,modifier=Modifier,startDestination=startDestination){
        composable(ROUT_HOME){
            HomeScreen(navController)
        }
        composable(ROUT_HOME){
            LoginScreen(navController)
        }
        composable(ROUT_HOME){
            RegisterScreen(navController)
        }
        
    }

}

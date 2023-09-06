package com.example.mvvm.ui.theme.screens.register

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mvvm.navigation.AppNavHost
import com.example.mvvm.navigation.ROUT_LOGIN
import com.example.mvvm.navigation.ROUT_REGISTER
import com.example.mvvm.ui.theme.MvvmTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navController: NavHostController) {
    var fullname by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Register Here",
            color = Color.Cyan,
            fontFamily = FontFamily.Cursive,
            fontSize = 28.sp


        )
        OutlinedTextField(value = fullname, onValueChange ={fullname=it},
            label ={ Text(text = "Fullname")})

        OutlinedTextField(value = email, onValueChange ={email=it})
        OutlinedTextField(value = pass, onValueChange ={pass=it})


        Button(onClick = {
            navController.navigate(ROUT_LOGIN)
        },
            colors= ButtonDefaults.buttonColors(Color.Red),
            shape= CircleShape
        ) {
            Text(text = "Register",
                fontSize = 28.sp,
                fontFamily = FontFamily.Serif)

        }

        Button(onClick = {
            navController.navigate(ROUT_REGISTER)
        }, colors = ButtonDefaults.buttonColors(Color.Red),
            shape = CircleShape ) {
            Text(text = "Have account? Login here",
                fontSize = 28.sp,
                fontFamily = FontFamily.Serif)

        }

    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MvvmTheme {
      AppNavHost()
    }
}
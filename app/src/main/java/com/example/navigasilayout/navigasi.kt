package com.example.navigasilayout

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasilayout.view.FormIsian
import com.example.navigasilayout.view.TampilData
import com.example.navigasilayout.view.Home


enum class Navigasi{
    Formulir,
    Detail,
    Home
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
){
    Scaffold {
            isiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Home.name,
            modifier = modifier.padding(isiRuang)){

            composable(route = Navigasi.Home.name) {
                Home(
                    onSubmitClick = {
                        navController.navigate(Navigasi.Formulir.name)
                    }
                )
            }

            composable(route = Navigasi.Formulir.name){
                FormIsian(
                    OnSubmitBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name){
                TampilData(
                    OnBackBtnClick = { cancelAndBackToFormulir(navController) },
                    onBackToHomeClick = { navController.navigate(Navigasi.Home.name) }
                )

            }
        }
    }
}

private fun cancelAndBackToFormulir(
    navController: NavHostController
){
    navController.popBackStack(Navigasi.Home.name, inclusive = false)
}
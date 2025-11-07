package com.example.navigasi

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasi.view.FormIsian
import com.example.navigasi.view.TampilData

enum class Navigasi{
    Formulir,
    Detail
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
            startDestination = Navigasi.Formulir.name,
            modifier = modifier.padding(isiRuang)){

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
                    onBackToHomeClick = { cancelAndBackToFormulir(navController) }
                )
            }
        }
    }
}

private fun cancelAndBackToFormulir(
    navController: NavHostController
){
    navController.popBackStack(Navigasi.Formulir.name, inclusive = false)
}
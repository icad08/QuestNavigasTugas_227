package com.example.navigasilayout

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

enum class Navigasi{
    Formulir,
    Detail
}

@composable
fun DataApp (
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
){
    Scaffold{
            isiRuang->
        NavHost(
            navController = navController,
            startDestination = com.example.navigasi.view.Navigasi.Formulir.name,
            modifier = modifier.padding(isiRuang)){

            composable(route = com.example.navigasi.view.Navigasi.Formulir.name){
                FormIsian(
                    OnSubmitBtnClick = {
                        navController.navigate(com.example.navigasi.view.Navigasi.Detail.name)
                    }
                )
            }
            composable(route = com.example.navigasi.view.Navigasi.Detail.name){
                TampilData(
                    onBackBtnClick = {cancelAndBackToFormulir(navController)}
                )
            }
        }
    }
}

private fun cancelAndBackToFormulir(
    navController: NavHostController
){
    navController.popBackStack(com.example.navigasi.view.Navigasi.Formulir.name, inclusive = false)
}

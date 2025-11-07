package com.example.navigasilayout

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.NavHost

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
            modifier = modifier.padding(isiRuang))
    }
}
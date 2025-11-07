package com.example.navigasilayout.view

import android.R
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import java.lang.reflect.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun HomePage(
    onNavigateToFormIsian: () -> Unit,
    modifier: Modifier = Modifier
){
    Scaffold (
        topBar = {
            TopAppBar(
                title = {Text(text = "Home", color = Color.White)},
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ){

    }
}
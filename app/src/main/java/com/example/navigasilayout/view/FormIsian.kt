package com.example.navigasilayout.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun FormIsian(
    modifier: Modifier = Modifier,
    OnSubmitBtnClick: () -> Unit
){
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }

    val listJenisKelamin: List<String> = listOf("Laki-laki", "Perempuan")
    val listStatus: List<String> = listOf("Janda", "Lajang", "Duda")
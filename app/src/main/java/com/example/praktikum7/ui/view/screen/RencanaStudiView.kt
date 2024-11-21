package com.example.praktikum7.ui.view.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.praktikum7.model.Mahasiswa

@Composable
fun RencanaStudyView(
    mahasiswa: Mahasiswa,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
) {
    var chosenDropdown by remember { mutableStateOf("") }
    var checked by remember { mutableStateOf(false) }
    var pilihanKelas by remember { mutableStateOf("") }

    val listData: MutableList<String> = mutableListOf(chosenDropdown, pilihanKelas)
}


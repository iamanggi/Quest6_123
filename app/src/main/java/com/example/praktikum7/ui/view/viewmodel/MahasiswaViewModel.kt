package com.example.praktikum7.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.praktikum7.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {
    //Request
    private val _statusUI = MutableStateFlow(Mahasiswa())

    // Respons
    val statusUI: StateFlow<Mahasiswa> = _statusUI.asStateFlow()

    fun saveDataSiswa(ls: MutableList<String>) {
        _statusUI.update { statusSaatIni ->                 // statusaatini isinya sebuah model, isinya datasiswa
            statusSaatIni.copy(
                nim = ls[0],           //yang kita inputakan itu ada di ui
                nama = ls[1],
                email = ls[2],

                )
        }
    }
}

package com.example.praktikum7.ui.view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum7.R
import com.example.praktikum7.model.Mahasiswa
import com.example.praktikum7.model.RencanaStudi

@Composable
fun TampilDataView(
    uiState: Mahasiswa,
    krsStateUi: RencanaStudi,
    onBackButtonClicked: () -> Unit = {},
    onResetButtonClicked: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.primary)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(80.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.LightGray, shape = RoundedCornerShape(15.dp))
                    .padding(16.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.Start
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(
                                text = "Nim:",
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp
                            )
                            Text(
                                text = uiState.nim,
                                fontSize = 16.sp
                            )
                            Spacer(modifier = Modifier.padding(top = 8.dp))
                            Text(
                                text = "Nama:",
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp
                            )
                            Text(
                                text = uiState.nama,
                                fontSize = 16.sp
                            )
                        }
                        Column {
                            Text(
                                text = uiState.email,
                                fontWeight = FontWeight.Bold,
                                fontSize = 17.sp
                            )
                        }
                    }
                    Spacer(modifier = Modifier.padding(12.dp))
                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Matakuliah yang diambil:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                        Text(
                            text = krsStateUi.namaMk,
                            fontSize = 16.sp
                        )

                        Spacer(modifier = Modifier.padding(top = 8.dp))

                        Text(
                            text = "Kelas: ",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                        Text(
                            text = krsStateUi.kelas,
                            fontSize = 16.sp
                        )
                    }
                }
            }

        }
    }
}



package com.example.praktikum7.ui.view.screen

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
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
                .background(color = colorResource(id = R.color.primary))
                ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Spacer(modifier = Modifier.padding(24.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(
                    id = R.drawable.logo_umy
                ),
                contentDescription = "", modifier = Modifier.size(60.dp),
            )

            Spacer(modifier = Modifier.padding(start = 16.dp))
            Column {
                Text(
                    text = "Universitas Muhammadiyah Yogyakarta",
                    color = Color.Red, fontSize = 16.sp, fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Unggul dan Islami",
                    color = Color.Red
                )
            }
        }
            Spacer(modifier = Modifier.height(30.dp))
            Box(
                modifier = Modifier
                    .background(
                        color = Color.White, shape = RoundedCornerShape(
                            topEnd = 15.dp,
                            topStart = 15.dp
                        )
                    )
                    .fillMaxSize()
            ) {
                Column(

                    horizontalAlignment = Alignment.Start
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(18.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(modifier = Modifier.padding(top = 20.dp)) {
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
                        Column(modifier = Modifier.padding(top = 20.dp))  {
                            Text(
                                text = uiState.email,
                                fontWeight = FontWeight.Bold,
                                fontSize = 17.sp
                            )
                        }
                    }
                    Spacer(modifier = Modifier.padding(12.dp))
                    Column(
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 18.dp)
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
                    Spacer(modifier = Modifier.padding(16.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Button(onClick = { onBackButtonClicked() }) {
                            Text(
                                text = "Kembali", fontSize = 16.sp,
                                fontWeight = FontWeight.Medium,
                            )
                        }
                        Button(onClick = { onResetButtonClicked() }) {
                            Text(
                                text = "Reset", fontSize = 16.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }
            }
        }
    }


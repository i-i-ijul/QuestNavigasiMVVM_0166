package com.example.p6.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import com.example.p6.R
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun nampilindata(
    onBackBtnClick:()->Unit
){
    val items = listOf(
        Pair(stringResource(R.string.namalengkap),"Contoh Nama: "),
        Pair(stringResource(R.string.jenisKelamin),"Lainnya"),
        Pair(stringResource(R.string.alamat),"Yogyakarta"),
    )
    Scaffold(modifier = Modifier,
        {
           TopAppBar(
               title = { Text(text = stringResource(R.string.tampil), color = Color.White)},
               colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(R.color.teal_700))
           )
        })
    }
}
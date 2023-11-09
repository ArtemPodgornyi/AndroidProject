package com.example.myapplication.body

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.content.Description
import com.example.myapplication.content.Review

@Composable
fun Main() {
    Column(modifier = Modifier.padding(start = 20.dp, top = 30.dp)) {
        Description()
        Review()
    }
}
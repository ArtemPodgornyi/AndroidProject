package com.example.myapplication.content

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import com.example.myapplication.style.Star

@Composable
fun ScoreStars() {
    Row {
        Star()
        Star()
        Star()
        Star()
        Star()
    }
}
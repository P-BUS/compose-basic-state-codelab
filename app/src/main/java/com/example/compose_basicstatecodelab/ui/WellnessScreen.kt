package com.example.compose_basicstatecodelab.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.compose_basicstatecodelab.R

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    WaterCounter(
        text = R.string.count_glasses,
        modifier = modifier
    )
}
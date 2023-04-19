package com.example.compose_basicstatecodelab.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(
    text: Int,
    modifier: Modifier = Modifier
) {
    val count = 0
    Text(
        text = stringResource(text, count),
        modifier = modifier.padding(16.dp)
    )
}
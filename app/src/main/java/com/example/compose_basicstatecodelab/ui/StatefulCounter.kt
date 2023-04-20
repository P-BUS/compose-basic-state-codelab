package com.example.compose_basicstatecodelab.ui

import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.compose_basicstatecodelab.R

@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
    var waterCount by remember { mutableStateOf(0) }

    StatelessCounter(
        text = R.string.count_glasses,
        count = waterCount,
        onIncrement = { waterCount++ },
    )
}
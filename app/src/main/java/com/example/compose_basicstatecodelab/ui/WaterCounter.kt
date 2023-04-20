package com.example.compose_basicstatecodelab.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(
    text: Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(16.dp)
    ) {
        // Changes to count are now tracked by Compose
        var count by remember { mutableStateOf(0) }

        // This text is present if the button has been clicked
        // at least once; absent otherwise
        if (count > 0) {
            var showTask by remember { mutableStateOf(true) }
            if (showTask) {
                WellnessTaskItem(
                    taskName = "Have you taken your 15 minute walk today?",
                    onClose = { showTask = false }
                )
            }
            Text(text = stringResource(text, count))
        }
        Row(
            modifier = Modifier.padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                onClick = { count++ },
                enabled = count < 10
            ) {
                Text("Add one")
            }
            Button(
                onClick = { count = 0 },
                modifier = Modifier.padding(start = 8.dp),
            ) {
                Text("Clear water count")
            }
        }
    }
}
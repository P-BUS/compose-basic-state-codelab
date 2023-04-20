package com.example.compose_basicstatecodelab.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun StatelessCounter(
    text: Int,
    count: Int,
    onIncrement: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(16.dp)
    ) {
        // This text is present if the button has been clicked
        // at least once; absent otherwise
        if (count > 0) {
           /* var showTask by rememberSaveable { mutableStateOf(true) }
            if (showTask) {
                WellnessTaskItem(
                    taskName = "Have you taken your 15 minute walk today?",
                    onClose = { showTask = false }
                )
            }*/
            Text(text = stringResource(text, count))
        }
        Row(
            modifier = Modifier.padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                onClick = onIncrement,
                enabled = count < 10
            ) {
                Text("Add one")
            }
          /*  Button(
                onClick = { count = 0 },
                modifier = Modifier.padding(start = 8.dp),
            ) {
                Text("Clear water count")
            }*/
        }
    }
}
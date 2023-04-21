package com.example.compose_basicstatecodelab.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.compose_basicstatecodelab.data.WellnessTask

@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> = remember { getWellnessTasks() }
) {
    LazyColumn(modifier = modifier) {
        items(list) {task ->
            WellnessTaskItem(taskName = task.label)
        }
    }
}

private fun getWellnessTasks() = List(30) { i ->
    WellnessTask(i, "Task # $i")
}
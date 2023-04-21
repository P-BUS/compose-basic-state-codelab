package com.example.compose_basicstatecodelab.ui

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.compose_basicstatecodelab.data.WellnessTask

class WellnessViewModel : ViewModel() {

    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask> = _tasks

    fun removeTask(task: WellnessTask) {
        _tasks.remove(task)
    }

    private fun getWellnessTasks() = List(30) { i ->
        WellnessTask(i, "Task # $i")
    }

}
package com.proyect.act_sem7.ui

import android.R.attr.onClick
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.proyect.act_sem7.viewmodel.CounterViewModel

@Composable
fun CounterScreen(
    modifier: Modifier = Modifier,
    viewModel: CounterViewModel = viewModel()
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "${viewModel.count}",
            fontSize = 48.sp
        )
        Button(
            onClick = { viewModel.increment() },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(text = "Incrementar")
        }
        Button(
            onClick = { viewModel.reset() },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(text = "Resetear")
        }
    }
}

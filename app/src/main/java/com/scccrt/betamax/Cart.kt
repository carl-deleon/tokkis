package com.scccrt.betamax

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun CartScreen(count: Int) {
    LazyColumn {
        items(count) { index ->
            Text(text = "Sample Cart: $index")
        }
    }
}
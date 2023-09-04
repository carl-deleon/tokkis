package com.scccrt.betamax

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.scccrt.betamax.ui.font.Montserrat
import com.scccrt.betamax.ui.theme.BetamaxTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BetamaxTheme {
                NewJeans(count = 20)
            }
        }
    }

    @Composable
    fun NewJeans(count: Int) {
        LazyColumn(
            contentPadding = PaddingValues(16.dp)
        ) {
            items(count) { index ->
                ListItem(index)
            }
        }
    }

    @Composable
    fun ListItem(index: Int) {
        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 2.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant
            ),
            modifier = Modifier
                .padding(
                    vertical = 8.dp
                )
                .clickable { }
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Max)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icon),
                    contentDescription = "New Jeans HypeBoy",
                    modifier = Modifier.width(72.dp)
                )

                Box(
                    contentAlignment = Alignment.CenterStart,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFF018786))
                        .padding(16.dp)
                ) {
                    Column {
                        Text(
                            text = "Hello, World! Current Index: $index",
                            color = Color.Black,
                            fontSize = 14.sp,
                            fontFamily = Montserrat.fontFamily,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = "New Jeans - Super Shy!",
                            color = Color.Black,
                            fontSize = 12.sp,
                            fontFamily = Montserrat.fontFamily,
                            fontWeight = FontWeight.Light
                        )
                    }
                }
            }
        }
    }
}
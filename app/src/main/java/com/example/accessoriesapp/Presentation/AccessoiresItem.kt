package com.example.accessoriesapp.Presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.accessoriesapp.data.data.FakeData.AccessoiresModel


@Composable
fun AccessoiresItem(
    accessoiresModel: AccessoiresModel,
) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clip(RoundedCornerShape(22.dp))
            .fillMaxWidth()
            .background(Color.Black),
    ) {
        AsyncImage(
            model = accessoiresModel.AccessoiresImeg,
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
                .background(Color.Black),
            contentScale = ContentScale.Crop,
            contentDescription = null,
        )
    }
}

@Composable
fun StoreAcs(
    accessoiresModel: AccessoiresModel,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Row {

            Column(
                modifier = Modifier.background(Color.White)
            ) {
                AsyncImage(
                    modifier = Modifier
                        .size(120.dp)
                        .clip(RoundedCornerShape(10.dp)),
                    model = accessoiresModel.AccessoiresImeg,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                )
                Text(
                    modifier = Modifier.padding(start = 8.dp),
                    text = accessoiresModel.AccessoiresName,
                    fontSize = 18.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    modifier = Modifier.padding(start = 8.dp),
                    text = accessoiresModel.AccessoiresModel,
                    fontSize = 14.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Normal
                )
                Text(
                    modifier = Modifier.padding(start = 8.dp),
                    text = accessoiresModel.AccessoiresPrise.toString(),
                    fontSize = 14.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}

@Composable
fun CarItem(
    accessoiresModel: AccessoiresModel,
) {
    Card(
        colors = CardDefaults.cardColors(Color.White),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {

        Row(
            modifier = Modifier
        ) {
            AsyncImage(
                modifier = Modifier
                    .size(120.dp)
                    .clip(RoundedCornerShape(10.dp)),
                model = accessoiresModel.AccessoiresImeg,
                contentDescription = null,
                alignment = Alignment.CenterEnd,
                contentScale = ContentScale.Crop,
            )
            Column(
                modifier = Modifier
                    .padding(10.dp)
            ) {
                Text(
                    text = accessoiresModel.AccessoiresName,
                    fontSize = 18.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = accessoiresModel.AccessoiresModel,
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = accessoiresModel.AccessoiresPrise.toString(),
                    fontSize = 14.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}


package com.example.accessoriesapp.Presentation

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aademiyalessons.data.AccessFakeDates
import com.example.aademiyalessons.data.AccessoiresDates
import com.example.aademiyalessons.data.AccessoiresFakeDates
import com.example.accessoriesapp.R

@RequiresApi(Build.VERSION_CODES.Q)
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    Scaffold(
        topBar = {
            TopAppBar(modifier = Modifier.padding(top = 20.dp),
                title = {
                    Column(
                        modifier = Modifier.background(Color.White)
                    ) {

                        Text(
                            text = stringResource(R.string.Hello_Compose),
                            fontSize = 14.sp,
                            color = Color.Gray,
                            modifier = Modifier.padding(start = 8.dp)
                        )

                        Text(
                            text = stringResource(R.string.Hari_Prasad),
                            fontSize = 20.sp,
                            modifier = Modifier.padding(start = 8.dp)

                        )
                    }

                }, actions = {
                    IconButton(modifier = Modifier.padding(top = 10.dp), onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = null,
                        )
                    }
                })
        },

        content = { innerPadding ->
            LazyColumn(
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(12.dp)
            ) {
                item {
                    Column {
                        LazyRow {
                            items(AccessoiresFakeDates()) { item ->
                                AccessoiresItem(accessoiresModel = item)
                            }
                        }
                        Text(
                            modifier = Modifier.padding(8.dp),
                            text = "Featured", style = TextStyle(
                                fontSize = 22.sp,
                                fontWeight = FontWeight(500),
                                color = MaterialTheme.colorScheme.onBackground
                            )
                        )
                    }
                }
                item {
                    Column {
                        LazyRow {
                            items(AccessoiresDates()) { item ->
                                StoreAcs(accessoiresModel = item)
                            }
                        }
                        Text(
                            modifier = Modifier.padding(8.dp), text = "ALL", style = TextStyle(
                                fontSize = 22.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onBackground

                            )
                        )
                    }
                }
                items(AccessFakeDates()) { item ->
                    CarItem(accessoiresModel = item)
                }
            }
        },

        bottomBar = {
            NavigationBar(
                contentColor = Color.White,
                containerColor = Color.White,
                modifier = Modifier
                    .background(Color.White)
                    .clip(

                        RoundedCornerShape(
                            topEnd = 22.dp, topStart = 22.dp
                        )
                    ),
            ) {
                NavigationBarItem(
                    selected = false,
                    onClick = {},
                    alwaysShowLabel = false,
                    label = {},
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Home,
                            contentDescription = null,
                        )
                    })
                NavigationBarItem(selected = false,
                    onClick = {},
                    alwaysShowLabel = false,
                    label = {},
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null,
                        )
                    })
                NavigationBarItem(selected = false,
                    onClick = {},
                    alwaysShowLabel = false,
                    label = {},
                    icon = {
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = null,
                        )
                    })
                NavigationBarItem(
                    selected = false,
                    onClick = {},
                    alwaysShowLabel = false,
                    label = {},
                    icon = {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = null,
                        )
                    },
                )
            }
        },
    )
}


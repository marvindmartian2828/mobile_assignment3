package com.example.chicchronicles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chicchronicles.data.Datasource
import com.example.chicchronicles.data.FashionBrand
import com.example.chicchronicles.ui.theme.ChicChroniclesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChicChroniclesTheme {
                Scaffold { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        Spacer(modifier = Modifier.height(8.dp))
                        AppTitle()
                        Spacer(modifier = Modifier.height(16.dp))
                        ChicChroniclesApp()
                    }
                }
            }
        }
    }
}

@Composable
fun AppTitle() {
    Text(
        text = "30 Days Of Chic Luxury",
        style = MaterialTheme.typography.headlineMedium.copy(fontFamily = FontFamily.Serif),
        color = Color(0xFF5D4037),
        modifier = Modifier.padding(start = 16.dp, top = 10.dp)
    )
}

@Composable
fun ChicChroniclesApp(modifier: Modifier = Modifier) {
    FashionBrandList(brandList = Datasource().loadFashionBrands())
}

@Composable
fun FashionBrandList(brandList: List<FashionBrand>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(brandList) { brand ->
            val index = remember { brandList.indexOf(brand) }
            FashionBrandCard(
                brand = brand,
                index = index
            )
        }
    }
}

@Composable
fun FashionBrandCard(
    brand: FashionBrand,
    index: Int,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(if (expanded) 8.dp else 4.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF5E1DA)),
        shape = MaterialTheme.shapes.medium
    ) {
        Column(
            modifier = Modifier
                .clickable { expanded = !expanded }
                .padding(16.dp)
        ) {
            DayLabel(index)
            BrandTitle(brand)
            BrandImage(brand)
            BrandDescription(expanded, brand)
        }
    }
}

@Composable
fun DayLabel(index: Int) {
    Text(
        text = "Day ${index + 1}",
        color = Color(0xFFD7A9A3),
        style = MaterialTheme.typography.labelLarge.copy(
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
        )
    )
    Spacer(modifier = Modifier.height(8.dp))
}

@Composable
fun BrandTitle(brand: FashionBrand) {
    Text(
        text = stringResource(brand.name),
        style = MaterialTheme.typography.headlineSmall.copy(fontFamily = FontFamily.Serif),
        color = Color(0xFF333333)
    )
    Spacer(modifier = Modifier.height(8.dp))
}

@Composable
fun BrandImage(brand: FashionBrand) {
    Image(
        painter = painterResource(brand.imageResourceId),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .clip(MaterialTheme.shapes.medium),
        contentScale = ContentScale.Crop
    )
    Spacer(modifier = Modifier.height(8.dp))
}

@Composable
fun BrandDescription(expanded: Boolean, brand: FashionBrand) {
    AnimatedVisibility(
        visible = expanded,
        enter = androidx.compose.animation.fadeIn(animationSpec = tween(500))
    ) {
        Text(
            text = stringResource(brand.description),
            style = MaterialTheme.typography.bodyMedium.copy(fontFamily = FontFamily.SansSerif),
            color = Color(0xFF333333)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ChicChroniclesPreview() {
    ChicChroniclesTheme {
        ChicChroniclesApp()
    }
}

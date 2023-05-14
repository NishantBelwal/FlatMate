package com.example.presentation.commoncomposables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.graphics.Shape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun ImageIcon(
    modifier: Modifier = Modifier,
    imageUrl: String,
    size: Dp = 50.dp,
    shape: Shape = MaterialTheme.shapes.medium
){
    GlideImage(
        model = imageUrl,
        modifier = modifier
            .size(size)
            .clip(shape = shape),
        contentDescription = null
    )
}

@Preview(showBackground = true)
@Composable
private fun ImagePreview(){
    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        ImageIcon(imageUrl = "https://picsum.photos/200")
    }
}


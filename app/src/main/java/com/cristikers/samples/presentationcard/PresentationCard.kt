package com.cristikers.samples.presentationcard

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cristikers.samples.presentationcard.ui.theme.ComposePresentationCardTheme

@Composable
fun PresentationCard(modifier: Modifier = Modifier, name: String, title: String) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var roundedShape = RoundedCornerShape(24.dp)
        Image(
            painter = painterResource(R.drawable.batman),
            contentDescription = stringResource(R.string.foto_desc),
            modifier = Modifier
                .size(200.dp)
                .clip(roundedShape)
                .border(BorderStroke(1.dp, Color.Black), roundedShape)
        )

        Text(
            modifier = Modifier.padding(top = 16.dp),
            text = name,
            style = MaterialTheme.typography.displayMedium
        )

        Text(
            text = title,
            style = MaterialTheme.typography.headlineMedium
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PresentationCardPreview() {
    ComposePresentationCardTheme {
        PresentationCard(name = "Batman", title = "Justiciero")
    }
}
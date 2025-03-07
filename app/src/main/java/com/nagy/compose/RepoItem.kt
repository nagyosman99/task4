package com.nagy.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RepoItem3(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth()
            .padding(horizontal = 8.dp)
            .padding(top = 8.dp).padding(bottom = 8.dp)
            .background(
                color= Color.Gray,
                shape = RoundedCornerShape(15.dp)
            )
            .clickable {

            }
    ) {
        Image(
            modifier = Modifier.size(50.dp)
                .padding(top = 8.dp, start = 8.dp)
                .clip(shape = RoundedCornerShape(50)),
            painter = painterResource(id = R.drawable.issue),
            contentDescription = null
        )
        Column(
            Modifier.padding(8.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    modifier = Modifier.weight(1f),
                    text = "Bump pyarrow from 7 "
                )
                Text("Open")


            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "None"
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
            text = "Created At : 12/12/2023, 12:00 AM",
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
        }
}

@Preview(showBackground = true)
@Composable
fun PreviewRepoItem3() {

        RepoItem3()

}

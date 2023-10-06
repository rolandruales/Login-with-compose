package com.example.loginwithcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RegisterScreen(

) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp)
            .background(MaterialTheme.colors.background),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier
                .wrapContentHeight()
        ) {
            // FIRST NAME
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth(),
                maxLines = 1,
                singleLine = true,
                label = { Text(text = "First name") }
            )
            Spacer(modifier = Modifier.height(10.dp))
            // LAST NAME
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth(),
                maxLines = 1,
                singleLine = true,
                label = { Text(text = "Last name") }
            )
            Spacer(modifier = Modifier.height(10.dp))
            // EMAIL
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth(),
                maxLines = 1,
                singleLine = true,
                label = { Text(text = "Email") }
            )
            Spacer(modifier = Modifier.height(10.dp))
            // USERNAME
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth(),
                maxLines = 1,
                singleLine = true,
                label = { Text(text = "Username") }
            )
            Spacer(modifier = Modifier.height(10.dp))
            // PASSWORD
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth(),
                maxLines = 1,
                singleLine = true,
                label = { Text(text = "Password") }
            )
            Spacer(modifier = Modifier.height(20.dp))
            // REGISTER BUTTON
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clip(RoundedCornerShape(50.dp, 50.dp, 50.dp, 50.dp))
            ) {
                Text(
                    text = "Register",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            }
        }

    }
}

@Composable
@Preview
fun RegisterPreview() {
    RegisterScreen()
}
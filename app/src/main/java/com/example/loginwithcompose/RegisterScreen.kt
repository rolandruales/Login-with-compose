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
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun RegisterScreen(
    navController: NavHostController
) {

    var firstName by remember {
        mutableStateOf("")
    }
    var lastName by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var userName by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    val focusManager = LocalFocusManager.current    // focus manager

    Scaffold(
        // TOP BAR AND ICONS
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "")
                },
                navigationIcon = {
                    // POP BACKSTACK TO LOGIN SCREEN
                    IconButton(onClick = {
                        navController.navigate(Screen.Login.route){
                            popUpTo(Screen.Login.route) {
                                inclusive = true
                            }
                        }
                    }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Back")
                    }
                }
            )
        }
    ) { values ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(values)
                .background(MaterialTheme.colors.background),
            contentAlignment = Alignment.Center
        ){
            Column(
                modifier = Modifier
                    .wrapContentHeight()
                    .padding(horizontal = 25.dp)
            ) {
                // FIRST NAME
                OutlinedTextField(
                    value = firstName,
                    onValueChange = {
                        if (it.length <= 15)
                            firstName = it
                        if (it.isEmpty())
                            focusManager.clearFocus()
                    },
                    modifier = Modifier
                        .fillMaxWidth(),
                    maxLines = 1,
                    singleLine = true,
                    label = { Text(text = "First name") }
                )
                Spacer(modifier = Modifier.height(10.dp))
                // LAST NAME
                OutlinedTextField(
                    value = lastName,
                    onValueChange = {
                        if (it.length <= 15)
                            lastName = it
                        if (it.isEmpty())
                            focusManager.clearFocus()
                    },
                    modifier = Modifier
                        .fillMaxWidth(),
                    maxLines = 1,
                    singleLine = true,
                    label = { Text(text = "Last name") }
                )
                Spacer(modifier = Modifier.height(10.dp))
                // EMAIL
                OutlinedTextField(
                    value = email,
                    onValueChange = {
                        if (it.length <= 15)
                            email = it
                        if (it.isEmpty())
                            focusManager.clearFocus()
                    },
                    modifier = Modifier
                        .fillMaxWidth(),
                    maxLines = 1,
                    singleLine = true,
                    label = { Text(text = "Email") }
                )
                Spacer(modifier = Modifier.height(10.dp))
                // USERNAME
                OutlinedTextField(
                    value = userName,
                    onValueChange = {
                        if (it.length <= 15)
                            userName = it
                        if (it.isEmpty())
                            focusManager.clearFocus()
                    },
                    modifier = Modifier
                        .fillMaxWidth(),
                    maxLines = 1,
                    singleLine = true,
                    label = { Text(text = "Username") }
                )
                Spacer(modifier = Modifier.height(10.dp))
                // PASSWORD
                OutlinedTextField(
                    value = password,
                    onValueChange = {
                        if (it.length <= 15)
                            password = it
                        if (it.isEmpty())
                            focusManager.clearFocus()
                    },
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
}


@Composable
@Preview
fun RegisterPreview() {
    RegisterScreen(rememberNavController())
}
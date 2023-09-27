package com.example.loginwithcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginwithcompose.ui.theme.LoginWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginWithComposeTheme {
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Column (modifier = Modifier
                        .weight(2f),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally){
                        LoginInterface()
                        ForgetPassword()
                    }
                    Column (modifier = Modifier
                        .weight(.1f)){
                        SignUp()
                    }

                }
            }
        }
    }
}

@Composable
fun LoginInterface() {
    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    val context = LocalContext.current  // context must be inside composable function
    val focusManager = LocalFocusManager.current    // focus manager

    Row (
        modifier = Modifier
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ){
        Column (
            modifier = Modifier
                .fillMaxWidth(0.9f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            Image(painter = painterResource(id = R.drawable.friends1),
                contentDescription = stringResource(id = R.string.friends),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(180.dp))

            //USERNAME TEXT FIELD
            OutlinedTextField(
                value = username,
                onValueChange = {
                    if (it.length <= 15)
                        username = it
                    if (it.isEmpty())
                        focusManager.clearFocus()
                },
                label = { Text(text = "Username")},
                modifier = Modifier
                    .fillMaxWidth(),
                maxLines = 1,
                singleLine = true,
            )

            //PASSWORD TEXT FIELD
            OutlinedTextField(
                value = password,
                onValueChange = {
                    if (it.length <= 15)
                        password = it
                    if (it.isEmpty())
                        focusManager.clearFocus()
                },
                label = { Text(text = "Password")},
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(10.dp))

            //LOGIN BUTTON
            Button(
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(50.dp, 50.dp, 50.dp, 50.dp)),
                onClick = {
                    if (username == "Bokz" && password == "Bokz") {
                        Toast.makeText(context,"Login successful!", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(context,"Login failed!", Toast.LENGTH_SHORT).show()
                    }
                }) {
                Text(
                    text = "Login",
                    fontSize = 20.sp
                )
            }
        }


    }
}

@Composable
fun ForgetPassword() {
    Row (
    ){
        TextButton(
            onClick = { /*TODO*/ }) {
            Text(text = "Forgot password?")
        }
    }
}

@Composable
fun SignUp() {
    Row (
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(text = "Don't have an account?")
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Sign Up")
        }
    }
}



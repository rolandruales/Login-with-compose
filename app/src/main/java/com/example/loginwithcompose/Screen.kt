package com.example.loginwithcompose

sealed class Screen(val route: String) {
    object Login: Screen(route = "login_screen")
    object Register: Screen(route = "register_screen")
    object ForgotPassword: Screen(route = "forgot_password_screen")
}

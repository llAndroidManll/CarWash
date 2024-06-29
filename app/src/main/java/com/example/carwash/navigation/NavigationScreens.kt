package com.example.carwash.navigation

sealed class NavigationScreens(
    val route: String
) {

    data object SignIn: NavigationScreens(
        route = "sign_in"
    )

    data object Home: NavigationScreens(
        route = "home"
    )

}
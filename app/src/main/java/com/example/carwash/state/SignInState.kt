package com.example.carwash.state

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)

package com.example.carwash.utils

import com.example.carwash.data.model.UserData

data class SignInResult(
    val data: UserData?,
    val errorMessage: String?
)
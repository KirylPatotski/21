package com.omisoft.myapplication.mvvm

class MvvmAuthModel {
    fun onLoginClicked(name: String, email: String, password: String, confirm: String): Boolean {
        val isEmailValid = email.isNotBlank() && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
        val passwordValid = password.isNotBlank() && password.length > 5
        val confirmPasswordMatch =  confirm.isNotBlank() && confirm == password
        val nameValid = name.isNotBlank() && name.length > 2

        return isEmailValid && passwordValid && confirmPasswordMatch && nameValid
    }
}
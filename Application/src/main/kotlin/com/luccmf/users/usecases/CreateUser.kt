package com.luccmf.users.usecases

import com.luccmf.repositories.UserRepository
import com.luccmf.users.models.User
import jakarta.inject.Singleton

@Singleton
class CreateUser(
    private  val userRepository: UserRepository
) {

    suspend fun saveUser(user: User) =
        userRepository.save(user)

}
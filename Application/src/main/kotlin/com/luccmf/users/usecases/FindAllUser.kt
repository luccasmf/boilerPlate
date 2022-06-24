package com.luccmf.users.usecases

import com.luccmf.repositories.UserRepository
import jakarta.inject.Singleton

@Singleton
class FindAllUser (private  val userRepository: UserRepository){
    fun getAllUsers() =
        userRepository.findAll();
}
package com.luccmf.users.usecases

import com.luccmf.repositories.UserRepository
import jakarta.inject.Singleton
import java.util.*

@Singleton
class FindUser(
    private  val userRepository: UserRepository
) {
    suspend fun getUser(id: UUID) =
        userRepository.findById(id)
}
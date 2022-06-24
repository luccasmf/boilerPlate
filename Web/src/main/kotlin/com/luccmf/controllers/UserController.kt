package com.luccmf.controllers

import com.luccmf.users.models.User
import com.luccmf.users.usecases.*
import io.micronaut.http.HttpStatus
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import kotlinx.coroutines.flow.Flow
import java.util.*

@Controller("v1/users")
class UserController(
    private val createUser: CreateUser,
    private val findUser: FindUser,
    private val findAllUser: FindAllUser
) {

    @Status(HttpStatus.CREATED)
    @Post(consumes = [MediaType.APPLICATION_JSON])
    suspend fun createUser(@Body user : User): User
    {
        return createUser.saveUser(user)
    }

    @Get("/{id}")
    suspend fun getUser(@PathVariable id: UUID): User?
    {
        return findUser.getUser(id)
    }

    @Get
    fun getAllUsers(): Flow<User>
    {
        return findAllUser.getAllUsers()
    }
}
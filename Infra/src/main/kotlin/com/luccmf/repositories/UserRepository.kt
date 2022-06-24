package com.luccmf.repositories

import com.luccmf.users.handler.model.User
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import java.util.*

@JdbcRepository(dialect = Dialect.H2)
interface UserRepository : CoroutineCrudRepository<User, UUID> {
    suspend fun findByName(name : String) : User

}
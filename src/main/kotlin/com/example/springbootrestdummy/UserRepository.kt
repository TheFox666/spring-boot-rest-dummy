package com.example.springbootrestdummy

import org.springframework.stereotype.Component

@Component
class UserRepository {

    fun getUser(id: Int): String {
        // search in the table for the user with id
        return "Found User with id $id"
    }

}

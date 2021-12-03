package com.example.springbootrestdummy

import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository) {

    // Controller >> Service >> Repository (DB / Tabellen)
    fun getUser(id: Int): String {
        return userRepository.getUser(id)
    }
}
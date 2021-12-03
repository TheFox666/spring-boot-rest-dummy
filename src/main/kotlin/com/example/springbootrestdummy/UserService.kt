package com.example.springbootrestdummy

import org.springframework.stereotype.Service

@Service
class UserService(val helloRepository: UserRepository) {

    // Controller >> Service >> Repository (DB / Tabellen)
    fun getUser(id: Int): String {
        return helloRepository.getUser(id)
    }
}
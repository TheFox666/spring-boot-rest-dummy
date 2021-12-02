package com.example.springbootrestdummy

import org.springframework.stereotype.Service

@Service
class HelloService() {
    fun hello(): String {
        return "Hello World!"
    }
    fun getUser(id: Int): String {
        return "Hugo Egon $id"
    }
}
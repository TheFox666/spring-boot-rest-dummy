package com.example.springbootrestdummy.hello

import org.springframework.stereotype.Service

@Service
class HelloService() {

    // Controller >> Service >> Repository (DB / Tabellen)

    fun hello(): String {
        return "Hello World!"
    }
}
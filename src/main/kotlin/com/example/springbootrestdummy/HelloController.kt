package com.example.springbootrestdummy

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(val helloService: HelloService) {

    @GetMapping("/helloWorld")
    fun getHelloWorld (): String {
        return helloService.hello()
    }

    @GetMapping("/user/{id}")
    fun getHelloWorld (@PathVariable("id") id: Int): String {
        return helloService.getUser(id)
    }

}
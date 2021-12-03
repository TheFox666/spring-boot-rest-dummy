package com.example.springbootrestdummy.hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(val helloService: HelloService) {

    @GetMapping("/helloWorld")
    fun getHelloWorld(): String {
        return helloService.hello()
    }

}
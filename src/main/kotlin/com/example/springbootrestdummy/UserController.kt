package com.example.springbootrestdummy

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(val userService: UserService) {

    @GetMapping("/user/{id}")
    fun getUser(@PathVariable("id") id: Int): String {
        return userService.getUser(id)
    }

}
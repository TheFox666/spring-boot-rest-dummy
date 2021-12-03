package com.example.springbootrestdummy

import org.hamcrest.Matchers
import org.hamcrest.Matchers.containsString
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean

import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers


@WebMvcTest(UserController::class)
internal class UserControllerWebMVCTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @MockBean
    lateinit var userService: UserService


    // GET /user/123
    @Test
    fun getUser() {
        //given - test szenrio vorbereiten
        Mockito.`when`(userService.getUser(123)).thenReturn("Found User with id 123")

        //when - die Ausführung
        //then - verifikation
        this.mockMvc.perform(MockMvcRequestBuilders.get("/user/123"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Found User with id 123")))
    }
}
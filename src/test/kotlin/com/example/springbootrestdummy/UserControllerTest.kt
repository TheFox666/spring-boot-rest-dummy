package com.example.springbootrestdummy

import org.hamcrest.Matchers
import org.hamcrest.Matchers.containsString
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest

import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers



@SpringBootTest
@AutoConfigureMockMvc
internal class UserControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    // GET /user/123
    @Test
    fun getUser() {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/user/123"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Found User with id 123")))
    }
}
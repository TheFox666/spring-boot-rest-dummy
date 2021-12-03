package com.example.springbootrestdummy

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
internal class UserServiceTest {

    @Mock
    lateinit var userRepository: UserRepository

    @InjectMocks
    lateinit var userService: UserService

    @Test
    fun getUser_OK() {
        // given
        Mockito.`when`(userRepository.getUser(123)).thenReturn("Found User with id 123")

        // when
        val actual = userService.getUser(123)

        // then
        Assertions.assertEquals(actual, "Found User with id 123")
    }
}
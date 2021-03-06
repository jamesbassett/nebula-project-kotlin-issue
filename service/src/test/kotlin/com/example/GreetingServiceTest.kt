package com.example

import org.junit.Before
import org.junit.Test

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat

class GreetingServiceTest {

    private lateinit var service: GreetingService

    @Before
    fun setUp() {
        service = GreetingService()
    }

    @Test
    fun testGreeting() {
        assertThat<String>(service.greet(jim()), equalTo<String>("Hello Jim"))
    }
}

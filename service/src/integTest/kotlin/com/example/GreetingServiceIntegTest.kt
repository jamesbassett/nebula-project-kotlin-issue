package com.example

import org.junit.Before
import org.junit.Test

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat

class GreetingServiceIntegTest {

    private lateinit var service: GreetingService

    @Before
    fun setUp() {
        service = GreetingService()
    }

    @Test
    fun testGreeting() {
        // Cannot access class 'com.example.Person'. Check your module classpath for missing or conflicting dependencies
        assertThat<String>(service.greet(jim()), equalTo<String>("Hello Jim"))
    }
}

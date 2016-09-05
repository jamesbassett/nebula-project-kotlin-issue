package com.example;

import org.junit.Before;
import org.junit.Test;

import static com.example.PersonFixture.jim;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GreetingServiceTest {

    private GreetingService service;

    @Before
    public void setUp(){
        service = new GreetingService();
    }

    @Test
    public void testGreeting(){
        assertThat(service.greet(jim()), equalTo("Hello Jim"));
    }
}

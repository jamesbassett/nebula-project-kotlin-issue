package com.example

class GreetingService {

    fun greet(person: Person): String {
        return "Hello " + person.name
    }
}

package com.example.petshop

class Happy(date: String, name: String): Mood(date, name) {

    override fun emotion(): String {
        return "Hello, I'm feeling happy today"
    }

}
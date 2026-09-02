package com.example.petshop

class Happy(date: String, name: String): Mood(date, name) {

    override fun emotion(): String {
        return "Hello, I'm $name and I'm feeling happy at $date"
    }

}
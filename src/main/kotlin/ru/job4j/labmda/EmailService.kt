package ru.job4j.labmda

class EmailService {
    fun emailTo(message: Message) = with(StringBuilder()) {
            append("Subject : ").append(message.email)
            append("Body : ").append("Hello, ").append(message.email).append(" ")
            append("You win!")
            toString()
    }
}
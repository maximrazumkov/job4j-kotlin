package ru.job4j.labmda

/**
 * Service for sending letters
 * @author m.razumkov
 * @since 1.8
 * @version 1.0.0
 */
class EmailService {
    /**
     * to create message
     * @param message
     * @return string with message
     */
    fun emailTo(message: Message) = with(StringBuilder()) {
            append("Subject : ").append(message.email)
            append("Body : ").append("Hello, ").append(message.email).append(" ")
            append("You win!")
            toString()
    }
}
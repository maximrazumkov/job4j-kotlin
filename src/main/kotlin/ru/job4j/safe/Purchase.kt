package ru.job4j.safe

import java.lang.StringBuilder
import java.util.*

data class Purchase (var name : String, var created : Date, var address : Address?)

fun createHtml(purchases: List<Purchase>) = with(StringBuilder()) {
    append("<table><thead><tr></th>Имя</th></th>Дата</th></th>Адрес</th></tr></thead><tbody>")
    purchases.forEach {
        with(it) {
            val address = String.format("%s %s %s", address?.home ?: "", address?.street ?: "", address?.zip ?: "")
            append(String.format("<tr><td>%s</td><td>%s</td><td>%s</td><tr>", name, created, address))
        }
    }
    append("</tbody></table>")
    toString()
}
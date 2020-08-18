package ru.job4j.labmda

class HtmlTable {
    fun table(row: Int, cell: Int) = StringBuilder().apply {
            append("<table>")
            for (i in 1 .. row) {
                append("<tr>")
                for (j in 1 .. cell) {
                    append("<td></td>")
                }
                append("</tr>")
            }
            append("</table>")
            toString()
        }
}
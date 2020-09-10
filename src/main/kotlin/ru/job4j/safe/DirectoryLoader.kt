package ru.job4j.safe

class DirectoryLoader {
    val cities: List<String> by lazy { loadCities() }

    private fun loadCities() : List<String> = listOf("Moscow", "London", "Tokio", "New Your")
}
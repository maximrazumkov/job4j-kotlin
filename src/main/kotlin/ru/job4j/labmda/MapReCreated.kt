package ru.job4j.labmda

import java.util.*
import kotlin.collections.ArrayList

fun reCreate(campaings: List<Campaing>) : List<String> = campaings.map {it.toString()}
package ru.maxmvaas.domain.model.remote.enumeration

enum class DishTag(private val value: String) {
    ALL("Все меню"),

    RICE("С рисоv"),

    SALAD("Салаты"),

    FISH("С рыбой");

    override fun toString(): String = value
}
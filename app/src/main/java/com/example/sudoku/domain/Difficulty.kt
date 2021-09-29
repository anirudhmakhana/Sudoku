package com.example.sudoku.domain

//enum classes are useful for creating useful set of values.

//sealed classes are useful for creating useful set of types
enum class Difficulty(val modifier: Double) {
    EASY(0.50),
    MEDIUM(0.44),
    HARD(0.38)
}
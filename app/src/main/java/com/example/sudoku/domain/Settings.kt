package com.example.sudoku.domain

/**
 * the data keyword ahead of class keyword adds or generate a couple of helper methods such
 * as  equal, hash code, or copy.
 */
data class Settings(
    val difficulty: Difficulty,
    val boundary: Int
)

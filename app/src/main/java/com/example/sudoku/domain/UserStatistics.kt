package com.example.sudoku.domain

/**
 * Purpose of this class is to represent the shortest time taken by a user to
 * solve the sudoku problem.
 *
 * Long is used because we will use time in ms to store the value.
 */
data class UserStatistics(
    val fourEasy: Long = 0,
    val fourMedium: Long = 0,
    val fourHard: Long = 0,
    val nineEasy: Long = 0,
    val nineMedium: Long = 0,
    val nineHard: Long = 0
)

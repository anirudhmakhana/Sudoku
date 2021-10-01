package com.example.sudoku.common

import kotlinx.coroutines.Job

/**
 * Abstract class allows you to define the functions in an abstract manner
 * however, an interface will only allow you to declare a function and implement
 * it later.
 */

//<EVENT> represents generic type
abstract class BaseLogic<EVENT> {
    protected lateinit var jobTracker: Job
    abstract fun onEvent(event: EVENT)
}
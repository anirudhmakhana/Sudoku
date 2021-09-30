package com.example.sudoku.domain

import java.lang.Exception

/**
 * Naming convention - I stands for interface.
 * Think of fucntions in repository as use-cases
 * e.g. saveGame(), updateGame() etc
 * used for writing abstract fuctions
 */

/**
 * suspend keyword is there because the fucntion will be called from coroutine scopes.
 * which exists in the logic class, they will reference this interface.
 */
interface IGameRepository {
    suspend fun saveGame(
        elapsedTime: Long,
        onSuccess: (Unit) -> Unit,
        onError: (Exception) -> Unit
    )

    suspend fun updateGame(
        game: SudokuPuzzle,
        onSuccess: (Unit) -> Unit,
        onError: (Exception) -> Unit
    )

    suspend fun updateNode(
        x: Int,
        y: Int,
        color: Int,
        elapsedTime: Long,
        // The function below must be called with some kind of boolean value
        onSuccess: (isComplete : Boolean) -> Unit,
        onError: (Exception) -> Unit
    )

    suspend fun getCurrentGame(
        onSuccess: (currentGame : SudokuPuzzle, isComplete : Boolean) -> Unit,
        onError: (Exception) -> Unit
    )

    suspend fun getSettings(
        onSuccess: (Settings) -> Unit,
        onError: (Exception) -> Unit
    )

    suspend fun updateSettings(
        settings: Settings,
        onSuccess: (Unit) -> Unit,
        onError: (Exception) -> Unit
    )
}
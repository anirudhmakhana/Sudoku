package com.example.sudoku.domain

import java.lang.Exception

interface IGameDataStorage {
    suspend fun getSettings(game: SudokuPuzzle): GameStorageResult
    suspend fun updateSettings(x: Int, y: Int, color: Int, elapsedTime: Long): GameStorageResult
    suspend fun getCurrentGame(): GameStorageResult
}

sealed class GameStorageResult {
    data class OnSuccess(val settings: Settings) : SettingsStorageResult()
    data class OnError(val exception: Exception) : SettingsStorageResult()
}

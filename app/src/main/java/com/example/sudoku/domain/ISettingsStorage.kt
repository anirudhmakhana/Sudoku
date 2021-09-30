package com.example.sudoku.domain

import java.lang.Exception

interface ISettingsStorage {
    suspend fun getSettings(): SettingsStorageResult
    suspend fun updateSettings(settings: Settings): SettingsStorageResult
}


sealed class SettingsStorageResult{
    data class onSuccess(val currentGame: SudokuPuzzle) : GameStorageResult()
    data class onError(val exception: Exception) : GameStorageResult()
}
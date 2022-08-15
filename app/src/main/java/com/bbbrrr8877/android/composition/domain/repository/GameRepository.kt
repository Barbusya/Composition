package com.bbbrrr8877.android.composition.domain.repository

import com.bbbrrr8877.android.composition.domain.entity.GameSettings
import com.bbbrrr8877.android.composition.domain.entity.Level
import com.bbbrrr8877.android.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ) : Question

    fun getGameSettings(level: Level): GameSettings
}
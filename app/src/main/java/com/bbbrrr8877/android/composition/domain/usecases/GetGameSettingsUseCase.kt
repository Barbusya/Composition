package com.bbbrrr8877.android.composition.domain.usecases

import com.bbbrrr8877.android.composition.domain.entity.GameSettings
import com.bbbrrr8877.android.composition.domain.entity.Level
import com.bbbrrr8877.android.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}
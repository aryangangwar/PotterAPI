package com.example.potterapi.repo

import com.example.potterapi.data.api.model.CharacterApi
import javax.inject.Inject
import com.example.potterapi.data.api.model.Character

class CharacterRepo @Inject constructor(
    private val characterApi: CharacterApi
) {

    suspend fun getCharacters() : List<Character>{
        return characterApi.getCharacters()
    }

}
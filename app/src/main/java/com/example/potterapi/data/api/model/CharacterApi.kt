package com.example.potterapi.data.api.model

import retrofit2.http.GET
import  com.example.potterapi.data.api.model.Character

interface CharacterApi {

    @GET(ApiConstants.END_POINTS)
    suspend fun getCharacters() : List<Character>
}
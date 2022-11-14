package com.example.potterapi.ui.theme

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.potterapi.data.api.model.Character
import com.example.potterapi.repo.CharacterRepo
import javax.inject.Inject
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val characterRepo: CharacterRepo
) : ViewModel() {

    private val _state = MutableStateFlow(emptyList<Character>())
    val state : StateFlow<List<Character>>
        get() = _state

    init {
        viewModelScope.launch {
            val characters = characterRepo.getCharacters()
            _state.value = characters
        }
    }
}
package dev.theimpulson.fireforxda

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.theimpulson.fireforxda.network.XenforoRepository
import dev.theimpulson.fireforxda.network.data.Me
import dev.theimpulson.fireforxda.network.data.User
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val xenforoRepository: XenforoRepository
) : ViewModel() {
    val user: MutableLiveData<Me> = MutableLiveData()

    fun getCurrentUser() {
        viewModelScope.launch {
            user.postValue(xenforoRepository.getCurrentUser())
        }
    }
}
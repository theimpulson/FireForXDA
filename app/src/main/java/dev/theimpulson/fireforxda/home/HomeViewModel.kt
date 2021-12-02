package dev.theimpulson.fireforxda.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.theimpulson.fireforxda.network.XenforoRepository
import dev.theimpulson.fireforxda.network.data.alert.Alerts
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val xenforoRepository: XenforoRepository
) : ViewModel() {
    val testResult: MutableLiveData<Alerts> = MutableLiveData()

    fun testFunction() {
        viewModelScope.launch {
            testResult.postValue(xenforoRepository.getAlerts())
        }
    }
}
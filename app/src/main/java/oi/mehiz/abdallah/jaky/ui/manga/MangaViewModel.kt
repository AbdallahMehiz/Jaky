package oi.mehiz.abdallah.jaky.ui.manga

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MangaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Manga Fragment"
    }
    val text: LiveData<String> = _text
}
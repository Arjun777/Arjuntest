package com.android.presentation.media

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.domain.model.Content
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MediaViewModel @Inject constructor(private val getMediaListUseCase: com.android.domain.usecase.GetMediaUseCase) :
    ViewModel() {

    val contentReceivedLiveData = MutableLiveData<List<Content>>()
    val isLoad = MutableLiveData<Boolean>()
    val ContentData = MutableLiveData<Content>()

    init {
        isLoad.value = false
    }


    val content: com.android.domain.model.Content? get() = ContentData.value

    fun set(content: com.android.domain.model.Content) = run { ContentData.value = content }

    fun loadContent() {

            getMediaListUseCase.execute(
                onSuccess = {
                    isLoad.value = true
                    contentReceivedLiveData.value = it
                },
                onError = {
                    it.printStackTrace()
                }
            )
        }

}

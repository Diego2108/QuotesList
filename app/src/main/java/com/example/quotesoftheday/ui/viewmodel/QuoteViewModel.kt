package com.example.quotesoftheday.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quotesoftheday.data.model.QuoteModel
import com.example.quotesoftheday.data.model.QuoteProvider
import com.example.quotesoftheday.domain.GetQuotesUseCase
import com.example.quotesoftheday.domain.GetRandomQuoteUseCase
import kotlinx.coroutines.launch

class QuoteViewModel: ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>()

    val getQuotesUseCase = GetQuotesUseCase()
    val getRandomQuoteUseCase = GetRandomQuoteUseCase()

    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getQuotesUseCase()

            if (!result.isNullOrEmpty()) {
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    fun randomQuote(){
        isLoading.postValue(true)
        val quote = getRandomQuoteUseCase()
        if (quote != null) {
            quoteModel.postValue(quote)
        }
        isLoading.postValue(false)
    }
}
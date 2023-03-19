package com.example.quotesoftheday.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.quotesoftheday.model.QuoteModel
import com.example.quotesoftheday.model.QuoteProvider

class QuoteViewModel: ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote:QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}
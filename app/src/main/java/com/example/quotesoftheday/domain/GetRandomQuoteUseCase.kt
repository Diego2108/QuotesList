package com.example.quotesoftheday.domain

import com.example.quotesoftheday.data.model.QuoteModel
import com.example.quotesoftheday.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    operator fun invoke():QuoteModel? {
        val quotes = QuoteProvider.quotes
        if (!quotes.isNullOrEmpty()) {
            //val randomNumber = (0..quotes.size - 1).random()
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}
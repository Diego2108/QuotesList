package com.example.quotesoftheday.domain

import com.example.quotesoftheday.data.QuoteRepository
import com.example.quotesoftheday.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()
}
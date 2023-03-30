package com.example.quotesoftheday.data

import com.example.quotesoftheday.data.model.QuoteModel
import com.example.quotesoftheday.data.model.QuoteProvider
import com.example.quotesoftheday.data.network.QuoteService

class QuoteRepository {
    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}
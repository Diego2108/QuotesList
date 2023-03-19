package com.example.quotesoftheday.model

class QuoteProvider {
    companion object {

        fun random() :QuoteModel {
            val position = (0..10).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "Eres grande mi buen",
                author = "Diego"
            ),
            QuoteModel(
                quote = "Echale ganas brother tu puedes",
                author = "El gody"
            ),
            QuoteModel(
                quote = "Oy ese we",
                author = "El tiburon"
            ),
            QuoteModel(
                quote = "Provecho",
                author = "El mamadito"
            ),
            QuoteModel(
                quote = "Ahora si sacaste boleto",
                author = "Majote"
            ),
            QuoteModel(
                quote = "hazte para alla",
                author = "Coconut"
            ),
            QuoteModel(
                quote = "No de memelox",
                author = "Jhony"
            ),
            QuoteModel(
                quote = "Puro cartel de santa a la verga compa",
                author = "Babo"
            ),
            QuoteModel(
                quote = "Que es el hip hop, cuando todo acaba",
                author = "Dharius"
            ),
            QuoteModel(
                quote = "Que es lo real cuando ya no hay nada",
                author = "Dharius bo dharius"
            ),
            QuoteModel(
                quote = "Ey nosotros somos la ley, en la cancha quemando maryjay",
                author = "Santa Fe Klan"
            )
        )
    }
}
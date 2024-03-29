package com.bme.aut.cocktaildatabase.interactor.events

import com.bme.aut.cocktaildatabase.model.Cocktail

data class GetCocktailsEvent(
    var cocktails: List<Cocktail>? = null,
    var throwable: Throwable? = null
)
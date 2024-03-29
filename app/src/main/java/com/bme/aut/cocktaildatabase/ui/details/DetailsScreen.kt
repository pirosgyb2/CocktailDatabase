package com.bme.aut.cocktaildatabase.ui.details

import com.bme.aut.cocktaildatabase.model.Cocktail
import com.bme.aut.cocktaildatabase.ui.Screen

interface DetailsScreen : Screen {

    fun showDetails(cocktail: Cocktail)

    fun navigateToCocktails()

    fun navigateToFavourites()

    fun navigateBack()

}
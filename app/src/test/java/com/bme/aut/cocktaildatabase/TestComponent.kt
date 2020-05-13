package com.bme.aut.cocktaildatabase

import com.bme.aut.cocktaildatabase.di.components.AppComponent
import com.bme.aut.cocktaildatabase.di.modules.InteractorModule
import com.bme.aut.cocktaildatabase.mock.MockNetworkModule
import com.bme.aut.cocktaildatabase.test.CocktailsTest
import com.bme.aut.cocktaildatabase.test.DetailsTest
import com.bme.aut.cocktaildatabase.test.FavouritesTest
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MockNetworkModule::class, TestModule::class, InteractorModule::class])
interface TestComponent : AppComponent {
    fun inject(cocktailsTest: CocktailsTest)
    fun inject(detailsTest: DetailsTest)
    fun inject(favouritesTest: FavouritesTest)
}
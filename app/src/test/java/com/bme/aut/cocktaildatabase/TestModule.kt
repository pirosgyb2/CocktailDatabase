package com.bme.aut.cocktaildatabase

import android.content.Context
import com.bme.aut.cocktaildatabase.interactor.CocktailsInteractor
import com.bme.aut.cocktaildatabase.ui.cocktails.CocktailsPresenter
import com.bme.aut.cocktaildatabase.ui.details.DetailsPresenter
import com.bme.aut.cocktaildatabase.ui.favourites.FavouritesPresenter
import com.bme.aut.cocktaildatabase.utils.UiExecutor
import dagger.Module
import dagger.Provides
import java.util.concurrent.Executor
import javax.inject.Singleton

@Module
class TestModule(private val context: Context) {

    @Provides
    fun provideContext() = context

    @Provides
    @Singleton
    fun provideCocktailPresenter(executor: Executor, cocktailsInteractor: CocktailsInteractor) =
        CocktailsPresenter(executor, cocktailsInteractor)

    @Provides
    @Singleton
    fun provideDetailsPresenter(executor: Executor, cocktailsInteractor: CocktailsInteractor) =
        DetailsPresenter(executor, cocktailsInteractor)

    @Provides
    @Singleton
    fun provideFavouritesPresenter(executor: Executor, cocktailsInteractor: CocktailsInteractor) =
        FavouritesPresenter(executor, cocktailsInteractor)

    @Provides
    @Singleton
    fun provideNetworkExecutor(): Executor = UiExecutor()
}

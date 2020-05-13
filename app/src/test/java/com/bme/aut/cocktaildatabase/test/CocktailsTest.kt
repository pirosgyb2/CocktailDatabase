package com.bme.aut.cocktaildatabase.test

import com.bme.aut.cocktaildatabase.model.Cocktail
import com.bme.aut.cocktaildatabase.testInjector
import com.bme.aut.cocktaildatabase.ui.cocktails.CocktailsPresenter
import com.bme.aut.cocktaildatabase.ui.cocktails.CocktailsScreen
import com.bme.aut.cocktaildatabase.utils.argumentCaptor
import com.bme.aut.cocktaildatabase.utils.mock
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.robolectric.RobolectricTestRunner
import javax.inject.Inject

@RunWith(RobolectricTestRunner::class)
class CocktailsTest {

    @Inject
    lateinit var presenter: CocktailsPresenter
    private lateinit var screen: CocktailsScreen

    @Throws(Exception::class)
    @Before
    fun setup() {
        testInjector.inject(this)
        screen = mock()
        presenter.attachScreen(screen)
    }

    @Test
    fun `Load cocktails`() {
        presenter.showCocktails()
        val cocktails = argumentCaptor<List<Cocktail>>()
        val favourites = argumentCaptor<ArrayList<Cocktail>>()
        Mockito.verify(screen).showCocktails(cocktails.capture(), favourites.capture())
        assert(cocktails.value.isNotEmpty())
    }

//    @Test
//    fun testArtists() {
//        val query = "AC/DC"
//        artistsPresenter.refreshArtists(query)
//
//        val list = argumentCaptor<MutableList<Item>>()
//        Mockito.verify(artistsScreen).showArtists(list.capture())
//        assert(list.value.size > 0)
//    }


    @After
    fun tearDown() {
        presenter.detachScreen()
    }

}
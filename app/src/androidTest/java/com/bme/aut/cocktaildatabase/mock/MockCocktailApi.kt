package com.bme.aut.cocktaildatabase.mock

import com.bme.aut.cocktaildatabase.model.Cocktail
import com.bme.aut.cocktaildatabase.model.DrinksResponse
import com.bme.aut.cocktaildatabase.network.CocktailApi
import okhttp3.Request
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

class MockCocktailApi : CocktailApi {

    override fun getCocktailDetails(cocktailId: Int?): Call<DrinksResponse?>? {
        val cocktailsResponse = DrinksResponse(
            drinks = arrayListOf(
                Cocktail(
                    databaseId = cocktailId ?: 0,
                    idDrink = "$cocktailId",
                    strDrink = "$cocktailId"
                )
            )
        )

        return object : Call<DrinksResponse> {
            @Throws(IOException::class)
            override fun execute(): Response<DrinksResponse> {
                return Response.success(cocktailsResponse)
            }

            override fun enqueue(callback: Callback<DrinksResponse>) {

            }

            override fun isExecuted(): Boolean {
                return false
            }

            override fun cancel() {

            }

            override fun isCanceled(): Boolean {
                return false
            }

            override fun clone(): Call<DrinksResponse> {
                return this
            }

            override fun request(): Request? {
                return null
            }
        } as Call<DrinksResponse?>?
    }

    override fun getCocktailsByLetter(letter: String?): Call<DrinksResponse?>? {
        val cocktailsResponse = DrinksResponse(
            drinks = arrayListOf(
                Cocktail(
                    databaseId = 0,
                    idDrink = "0",
                    strDrink = "${letter}0"
                ),
                Cocktail(
                    databaseId = 1,
                    idDrink = "1",
                    strDrink = "${letter}1"
                ),
                Cocktail(
                    databaseId = 2,
                    idDrink = "2",
                    strDrink = "${letter}2"
                )
            )
        )

        return object : Call<DrinksResponse> {
            @Throws(IOException::class)
            override fun execute(): Response<DrinksResponse> {
                return Response.success(cocktailsResponse)
            }

            override fun enqueue(callback: Callback<DrinksResponse>) {

            }

            override fun isExecuted(): Boolean {
                return false
            }

            override fun cancel() {

            }

            override fun isCanceled(): Boolean {
                return false
            }

            override fun clone(): Call<DrinksResponse> {
                return this
            }

            override fun request(): Request? {
                return null
            }
        } as Call<DrinksResponse?>?
    }

    override fun getCocktailsBySearchTerm(searchTerm: String?): Call<DrinksResponse?>? {
        val cocktailsResponse = DrinksResponse(
            drinks = arrayListOf(
                Cocktail(
                    databaseId = 0,
                    idDrink = "0",
                    strDrink = "${searchTerm}123"
                )
            )
        )

        return object : Call<DrinksResponse> {
            @Throws(IOException::class)
            override fun execute(): Response<DrinksResponse> {
                return Response.success(cocktailsResponse)
            }

            override fun enqueue(callback: Callback<DrinksResponse>) {

            }

            override fun isExecuted(): Boolean {
                return false
            }

            override fun cancel() {

            }

            override fun isCanceled(): Boolean {
                return false
            }

            override fun clone(): Call<DrinksResponse> {
                return this
            }

            override fun request(): Request? {
                return null
            }
        } as Call<DrinksResponse?>?
    }


}
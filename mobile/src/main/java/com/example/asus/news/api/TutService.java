package com.example.asus.news.api;

import com.example.asus.news.models.Rss;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TutService {

    @GET("rss/economics.rss")
    Call<Rss> getEconomicsNews();

    @GET("rss/society.rss")
    Call<Rss> getSocietyNews();

    @GET("rss/world.rss")
    Call <Rss> getWorldNews();

    @GET("rss/culture.rss")
    Call <Rss> getCultureNews();

    @GET("rss/accidents.rss")
    Call<Rss> getAccidentsNews();
}
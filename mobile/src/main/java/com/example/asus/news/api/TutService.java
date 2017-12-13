package com.example.asus.news.api;

import com.example.asus.news.models.Rss;


import retrofit2.Call;
import retrofit2.http.GET;

public interface TutService {

    @GET("rss/economics.rss")
    Call<Rss> getEconomicsNews();

//    @GET("rss/society.rss")
//    List<TutNews> getSocietyNews();
//
//    @GET("rss/world.rss")
//    List <TutNews> getWorldNews();
//
//    @GET("rss/culture.rss")
//    List <TutNews> getCultureNews();
//
//    @GET("rss/accidents.rss")
//    List<TutNews> getAccidentsNews();
}
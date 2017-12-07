package com.example.asus.news.api;

import com.example.asus.news.models.TutNews;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.POST;

public interface TutService {

    @GET("rss/economics.rss")
    List<TutNews> getNews();

    @GET("rss/society.rss")
    List<TutNews> getEconomicsNews();

    @GET("rss/world.rss")
    List <TutNews> getWorldNews();

    @GET("rss/culture.rss")
    List <TutNews> getCultureNews();

    @GET("rss/accidents.rss")
    List<TutNews> getAccidentsNews();
}
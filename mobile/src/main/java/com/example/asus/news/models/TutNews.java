package com.example.asus.news.models;

import org.simpleframework.xml.Element;

import org.simpleframework.xml.Root;


@Root(name = "item", strict = false)
public class TutNews {

    @Element(name = "title")

    private String title;

    @Element(name = "link")

    private String link;

    @Element(name = "pubDate")

    private String pubDate; //Пока что String


    public TutNews(String mTitle, String mLink, String mPubDate) {
        title = mTitle;

        link = mLink;

        pubDate = mPubDate;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

}

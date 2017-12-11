package com.example.asus.news.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Root(name = "item")
public class TutNews {

    @Element(name = "title")
    private String title;


//    private static final int NO_IMAGE_PROVIDED = -1;
//    @Element(name = "description")
//    private int description=NO_IMAGE_PROVIDED;

    @Element(name = "link")
    private String link;

    @Element(name="pubDate")
    private String pubDate;
//,int mDescription,

    public TutNews (String mTitle,String mLink,String mPubDate) {
        title=mTitle;
//        description=mDescription;
        link=mLink;
        pubDate=mPubDate;
    }





    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public int getDescription() {
//        return description;
//    }
//
//    public void setDescription(int description) {
//        this.description = description;
//    }

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
        this.pubDate=pubDate;
    }
//    public boolean hasImage() {
//        return description != NO_IMAGE_PROVIDED;
//    }

}

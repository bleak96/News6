package com.example.asus.news.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "channel", strict = false)
public class TutChannel {

    @Element(name = "title")
    private String title;

//    @Element(name = "link")
//    private String link;

    @Element(name = "description")
    private String description;

    @Element(name = "language")
    private String language;

    @Element(name = "pubDate")
    private String pubDate;

    @Element(name = "lastBuildDate")
    private String lastBuildDate;

    @Element(name = "ttl")
    private int ttl;

    @ElementList(inline = true, name = "item")
    private List<TutItem> items;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public String getLink() {
//        return link;
//    }
//
//    public void setLink(String link) {
//        this.link = link;
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getLastBuildDate() {
        return lastBuildDate;
    }

    public void setLastBuildDate(String lastBuildDate) {
        this.lastBuildDate = lastBuildDate;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

//    public List<TutItem> getItems() {
//        return items;
//    }
//
//    public void setItems(List<TutItem> items) {
//        this.items = items;
//    }

    @Override
    public String toString() {
        return "TutChannel{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                ", pubDate='" + pubDate + '\'' +
                ", lastBuildDate='" + lastBuildDate + '\'' +
                ", ttl=" + ttl +
                '}';
    }
}

package com.example.asus.news.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(strict = false, name = "channel")
public class TutChannel {

    @Element(name = "title")
    private String title;

    @Element(name = "link")
    @Path("channel/link")
    private String link;

    @Element(name = "description")
    private String description;

    @Element(name = "language")
    private String language;

    @Element(name = "image")
    private Image image;

    @Element(name = "pubDate")
    private String pubDate;

    @Element(name = "lastBuildDate")
    private String lastBuildDate;

    @Element(name = "ttl")
    private int ttl;

    @ElementList(name = "item", inline = true)
    private List<TutItem> item;

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

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
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

    public List<TutItem> getItems() {
        return item;
    }

    public void setItems(List<TutItem> items) {
        this.item = items;
    }

    @Override
    public String toString() {
        return "TutChannel{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                ", image=" + image +
                ", pubDate='" + pubDate + '\'' +
                ", lastBuildDate='" + lastBuildDate + '\'' +
                ", ttl=" + ttl +
                '}';
    }
}

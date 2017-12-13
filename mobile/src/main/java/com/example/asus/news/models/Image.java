package com.example.asus.news.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "image")
public class Image {

    @Element(name = "url")
    private String url;
    @Element(name = "title")
    private String title;
    @Element(name = "link")
    private String link;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    @Override
    public String toString() {
        return "Image{" +
                "url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}

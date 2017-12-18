package com.example.asus.news.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "item", strict = false)
public class TutItem {

    @Element(name = "title")
    private String title;
    @Element(name = "link")
    private String link;
    @Element(name = "description")
    private String description;
    @Element(name = "pubDate")
    private String pubDate;

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

    public String getImageUrl() {
        int begin = getDescription().indexOf("https");
        int end = getDescription().indexOf(".jpg") + 3;
        String result
                = "";
        for (int i = begin; i < end + 1; i++) {
            result += getDescription().charAt(i);
        }


        return result;
//        int begin = getDescription().indexOf("\"https");
//        int end = getDescription().indexOf(".jpg") + 5;
//        String item = getDescription();
//        String result =item.substring(begin,end);
//        return result;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    @Override
    public String toString() {
        return "TutItem{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", pubDate='" + pubDate + '\'' +
                '}';
    }
}
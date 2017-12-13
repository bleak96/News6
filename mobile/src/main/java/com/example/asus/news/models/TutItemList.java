package com.example.asus.news.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

@Element(name = "item")
public class TutItemList {

    @ElementList(inline = true, name = "item")
    private List<TutItem> items;

}

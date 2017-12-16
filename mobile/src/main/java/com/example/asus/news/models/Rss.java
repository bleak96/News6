package com.example.asus.news.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "rss", strict = false)
public class Rss {

    @Element(name = "channel")
    private TutChannel channel;

    public TutChannel getChannel() {
        return channel;
    }

    public void setChannel(TutChannel channel) {
        this.channel = channel;
    }
}


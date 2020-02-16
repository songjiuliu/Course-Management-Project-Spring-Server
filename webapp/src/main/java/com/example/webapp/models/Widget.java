package com.example.webapp.models;

public class Widget {
    private String id;//
    private String title;//
    private String type = "HEADING";//
    private String topicId;//
    private int size = 1;//


    private int order =1;



    private String text;
    private String src;


    private int width = 0;
    private int height = 0;

    private String cssClass;

    private String style;
    private String value;


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public Widget(String id, String title, String type, String text) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.text = text;
    }

    public Widget() {
    }
}

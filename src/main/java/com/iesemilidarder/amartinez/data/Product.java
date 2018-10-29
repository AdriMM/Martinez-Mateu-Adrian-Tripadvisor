package com.iesemilidarder.amartinez.data;

import java.util.Date;

public abstract class Product {

    private String name;
    private Double price;
    private String description;
    private String punctuation;
    private Date date;
    private String star;
    private String zone;

    public Date getDate() {
        return date;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public Date getDate(String s) {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPunctuation() {
        return punctuation;
    }

    public void setPunctuation(String punctuation) {
        this.punctuation = punctuation;
    }


    protected void doLog (String message) {
        System.out.println(message);
    }


}

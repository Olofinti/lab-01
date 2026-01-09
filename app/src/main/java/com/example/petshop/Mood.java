package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    // Attribute
    private Date date;


    public Mood() {
        this.date = new Date();
    }


    public Mood(Date date) {
        this.date = date;
    }

    // Abstract method to get mood string
    public abstract String getMood();

    // Getter
    public Date getDate() {
        return date;
    }

    // Setter
    public void setDate(Date date) {
        this.date = date;
    }
}

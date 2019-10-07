package com.example.enrollege.Classes;


public class posts {

    private String textViewName;
    private String textViewTime;
    private String textViewDate;


    public String getTextViewName() {
        return textViewName;
    }

    public void setTextViewName(String textViewName) {
        this.textViewName = textViewName;
    }


    public String getTextViewTime() {
        return textViewTime;
    }

    public void setTextViewTime(String textViewTime) {
        this.textViewTime = textViewTime;
    }

    public String getTextViewDate() {
        return textViewDate;
    }

    public void setTextViewDate(String textViewDate) {
        this.textViewDate = textViewDate;
    }


    public posts(String textViewDate, String textViewTime, String textViewName) {

        this.textViewDate = textViewDate;
        this.textViewTime = textViewTime;
        this.textViewName = textViewName;
    }
}

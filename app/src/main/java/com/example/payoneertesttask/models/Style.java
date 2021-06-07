package com.example.payoneertesttask.models;

import com.google.gson.annotations.SerializedName;

public class Style {

    @SerializedName("language")
    private String mLanguage;

    public String getLanguage() {
        return mLanguage;
    }

    public void setLanguage(String language) {
        mLanguage = language;
    }

}

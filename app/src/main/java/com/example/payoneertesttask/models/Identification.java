package com.example.payoneertesttask.models;

import com.google.gson.annotations.SerializedName;

public class Identification {

    @SerializedName("longId")
    private String mLongId;
    @SerializedName("shortId")
    private String mShortId;
    @SerializedName("transactionId")
    private String mTransactionId;

    public String getLongId() {
        return mLongId;
    }

    public void setLongId(String longId) {
        mLongId = longId;
    }

    public String getShortId() {
        return mShortId;
    }

    public void setShortId(String shortId) {
        mShortId = shortId;
    }

    public String getTransactionId() {
        return mTransactionId;
    }

    public void setTransactionId(String transactionId) {
        mTransactionId = transactionId;
    }

}

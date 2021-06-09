package com.example.payoneerpaymentapitask.models;

import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("lang")
    private String mLang;
    @SerializedName("logo")
    private String mLogo;
    @SerializedName("operation")
    private String mOperation;
    @SerializedName("self")
    private String mSelf;
    @SerializedName("validation")
    private String mValidation;

    public String getLang() {
        return mLang;
    }

    public void setLang(String lang) {
        mLang = lang;
    }

    public String getLogo() {
        return mLogo;
    }

    public void setLogo(String logo) {
        mLogo = logo;
    }

    public String getOperation() {
        return mOperation;
    }

    public void setOperation(String operation) {
        mOperation = operation;
    }

    public String getSelf() {
        return mSelf;
    }

    public void setSelf(String self) {
        mSelf = self;
    }

    public String getValidation() {
        return mValidation;
    }

    public void setValidation(String validation) {
        mValidation = validation;
    }

}


package com.example.payoneerpaymentapitask.models;

import com.google.gson.annotations.SerializedName;

public class ReturnCode {

    @SerializedName("name")
    private String mName;
    @SerializedName("source")
    private String mSource;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getSource() {
        return mSource;
    }

    public void setSource(String source) {
        mSource = source;
    }

}

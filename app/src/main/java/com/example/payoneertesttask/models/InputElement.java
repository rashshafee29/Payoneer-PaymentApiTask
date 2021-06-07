
package com.example.payoneertesttask.models;
import com.google.gson.annotations.SerializedName;

public class InputElement {

    @SerializedName("name")
    private String mName;
    @SerializedName("type")
    private String mType;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}

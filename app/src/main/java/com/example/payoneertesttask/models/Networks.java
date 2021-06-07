
package com.example.payoneertesttask.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Networks {

    @SerializedName("applicable")
    private List<Applicable> mApplicable;

    public List<Applicable> getApplicable() {
        return mApplicable;
    }

    public void setApplicable(List<Applicable> applicable) {
        mApplicable = applicable;
    }

}

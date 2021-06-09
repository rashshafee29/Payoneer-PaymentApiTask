
package com.example.payoneerpaymentapitask.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Applicable {

    @SerializedName("code")
    private String mCode;
    @SerializedName("grouping")
    private String mGrouping;
    @SerializedName("inputElements")
    private List<InputElement> mInputElements;
    @SerializedName("label")
    private String mLabel;
    @SerializedName("links")
    private Links mLinks;
    @SerializedName("method")
    private String mMethod;
    @SerializedName("operationType")
    private String mOperationType;
    @SerializedName("recurrence")
    private String mRecurrence;
    @SerializedName("redirect")
    private Boolean mRedirect;
    @SerializedName("registration")
    private String mRegistration;
    @SerializedName("selected")
    private Boolean mSelected;

    public String getCode() {
        return mCode;
    }

    public void setCode(String code) {
        mCode = code;
    }

    public String getGrouping() {
        return mGrouping;
    }

    public void setGrouping(String grouping) {
        mGrouping = grouping;
    }

    public List<InputElement> getInputElements() {
        return mInputElements;
    }

    public void setInputElements(List<InputElement> inputElements) {
        mInputElements = inputElements;
    }

    public String getLabel() {
        return mLabel;
    }

    public void setLabel(String label) {
        mLabel = label;
    }

    public Links getLinks() {
        return mLinks;
    }

    public void setLinks(Links links) {
        mLinks = links;
    }

    public String getMethod() {
        return mMethod;
    }

    public void setMethod(String method) {
        mMethod = method;
    }

    public String getOperationType() {
        return mOperationType;
    }

    public void setOperationType(String operationType) {
        mOperationType = operationType;
    }

    public String getRecurrence() {
        return mRecurrence;
    }

    public void setRecurrence(String recurrence) {
        mRecurrence = recurrence;
    }

    public Boolean getRedirect() {
        return mRedirect;
    }

    public void setRedirect(Boolean redirect) {
        mRedirect = redirect;
    }

    public String getRegistration() {
        return mRegistration;
    }

    public void setRegistration(String registration) {
        mRegistration = registration;
    }

    public Boolean getSelected() {
        return mSelected;
    }

    public void setSelected(Boolean selected) {
        mSelected = selected;
    }

}

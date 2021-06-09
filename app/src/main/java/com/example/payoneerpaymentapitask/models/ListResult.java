package com.example.payoneerpaymentapitask.models;

import com.google.gson.annotations.SerializedName;

public class ListResult {

    @SerializedName("identification")
    private Identification mIdentification;
    @SerializedName("integrationType")
    private String mIntegrationType;
    @SerializedName("interaction")
    private Interaction mInteraction;
    @SerializedName("links")
    private Links mLinks;
    @SerializedName("networks")
    private Networks mNetworks;
    @SerializedName("operation")
    private String mOperation;
    @SerializedName("operationType")
    private String mOperationType;
    @SerializedName("payment")
    private Payment mPayment;
    @SerializedName("resultCode")
    private String mResultCode;
    @SerializedName("resultInfo")
    private String mResultInfo;
    @SerializedName("returnCode")
    private ReturnCode mReturnCode;
    @SerializedName("status")
    private Status mStatus;
    @SerializedName("style")
    private Style mStyle;
    @SerializedName("timestamp")
    private String mTimestamp;

    public Identification getIdentification() {
        return mIdentification;
    }

    public void setIdentification(Identification identification) {
        mIdentification = identification;
    }

    public String getIntegrationType() {
        return mIntegrationType;
    }

    public void setIntegrationType(String integrationType) {
        mIntegrationType = integrationType;
    }

    public Interaction getInteraction() {
        return mInteraction;
    }

    public void setInteraction(Interaction interaction) {
        mInteraction = interaction;
    }

    public Links getLinks() {
        return mLinks;
    }

    public void setLinks(Links links) {
        mLinks = links;
    }

    public Networks getNetworks() {
        return mNetworks;
    }

    public void setNetworks(Networks networks) {
        mNetworks = networks;
    }

    public String getOperation() {
        return mOperation;
    }

    public void setOperation(String operation) {
        mOperation = operation;
    }

    public String getOperationType() {
        return mOperationType;
    }

    public void setOperationType(String operationType) {
        mOperationType = operationType;
    }

    public Payment getPayment() {
        return mPayment;
    }

    public void setPayment(Payment payment) {
        mPayment = payment;
    }

    public String getResultCode() {
        return mResultCode;
    }

    public void setResultCode(String resultCode) {
        mResultCode = resultCode;
    }

    public String getResultInfo() {
        return mResultInfo;
    }

    public void setResultInfo(String resultInfo) {
        mResultInfo = resultInfo;
    }

    public ReturnCode getReturnCode() {
        return mReturnCode;
    }

    public void setReturnCode(ReturnCode returnCode) {
        mReturnCode = returnCode;
    }

    public Status getStatus() {
        return mStatus;
    }

    public void setStatus(Status status) {
        mStatus = status;
    }

    public Style getStyle() {
        return mStyle;
    }

    public void setStyle(Style style) {
        mStyle = style;
    }

    public String getTimestamp() {
        return mTimestamp;
    }

    public void setTimestamp(String timestamp) {
        mTimestamp = timestamp;
    }

}

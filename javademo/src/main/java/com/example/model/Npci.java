package com.example.model;

import java.util.Objects;

public class Npci {
    private String txId;
    private String transactionType;
    private String col2Filler;
    private String tranSrlNo;
    private String responseCode;
    private String tranDate;
    private String tranTime;
    private String tranAmount;
    private String col3Filler;
    private String col4Filler;
    private String purposeCode;
    private String col7Filler;
    private String col8Filler;
    private String payerVpa;
    private String col9Filler;
    private String col10Filler;
    private String payeeVpa;
    private String participantId;
    private String remIfscCode;
    private String col11Filler;
    private String remAccountNo;
    private String col12Filler;
    private String col13Filler;
    private String col14Filler;
    private String col15Filler;
    private String institutionCode;
    private String countryCode;
    private String currencyCode;
    private String tranAmtIntCur;
    private String markupRebate;
    public Npci() {
    }
    public Npci(String txId, String transactionType, String col2Filler, String tranSrlNo, String responseCode, String tranDate, String tranTime, String tranAmount, String col3Filler, String col4Filler, String purposeCode, String col7Filler, String col8Filler, String payerVpa, String col9Filler, String col10Filler, String payeeVpa, String participantId, String remIfscCode, String col11Filler, String remAccountNo, String col12Filler, String col13Filler, String col14Filler, String col15Filler, String institutionCode, String countryCode, String currencyCode, String tranAmtIntCur, String markupRebate) {
        this.txId = txId;
        this.transactionType = transactionType;
        this.col2Filler = col2Filler;
        this.tranSrlNo = tranSrlNo;
        this.responseCode = responseCode;
        this.tranDate = tranDate;
        this.tranTime = tranTime;
        this.tranAmount = tranAmount;
        this.col3Filler = col3Filler;
        this.col4Filler = col4Filler;
        this.purposeCode = purposeCode;
        this.col7Filler = col7Filler;
        this.col8Filler = col8Filler;
        this.payerVpa = payerVpa;
        this.col9Filler = col9Filler;
        this.col10Filler = col10Filler;
        this.payeeVpa = payeeVpa;
        this.participantId = participantId;
        this.remIfscCode = remIfscCode;
        this.col11Filler = col11Filler;
        this.remAccountNo = remAccountNo;
        this.col12Filler = col12Filler;
        this.col13Filler = col13Filler;
        this.col14Filler = col14Filler;
        this.col15Filler = col15Filler;
        this.institutionCode = institutionCode;
        this.countryCode = countryCode;
        this.currencyCode = currencyCode;
        this.tranAmtIntCur = tranAmtIntCur;
        this.markupRebate = markupRebate;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Npci npci = (Npci) o;
        return Objects.equals(getTxId(), npci.getTxId()) && Objects.equals(getTranDate(), npci.getTranDate());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getTxId(), getTranDate());
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getCol2Filler() {
        return col2Filler;
    }

    public void setCol2Filler(String col2Filler) {
        this.col2Filler = col2Filler;
    }

    public String getTranSrlNo() {
        return tranSrlNo;
    }

    public void setTranSrlNo(String tranSrlNo) {
        this.tranSrlNo = tranSrlNo;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranTime() {
        return tranTime;
    }

    public void setTranTime(String tranTime) {
        this.tranTime = tranTime;
    }

    public String getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(String tranAmount) {
        this.tranAmount = tranAmount;
    }

    public String getCol3Filler() {
        return col3Filler;
    }

    public void setCol3Filler(String col3Filler) {
        this.col3Filler = col3Filler;
    }

    public String getCol4Filler() {
        return col4Filler;
    }

    public void setCol4Filler(String col4Filler) {
        this.col4Filler = col4Filler;
    }

    public String getPurposeCode() {
        return purposeCode;
    }

    public void setPurposeCode(String purposeCode) {
        this.purposeCode = purposeCode;
    }

    public String getCol7Filler() {
        return col7Filler;
    }

    public void setCol7Filler(String col7Filler) {
        this.col7Filler = col7Filler;
    }

    public String getCol8Filler() {
        return col8Filler;
    }

    public void setCol8Filler(String col8Filler) {
        this.col8Filler = col8Filler;
    }

    public String getPayerVpa() {
        return payerVpa;
    }

    public void setPayerVpa(String payerVpa) {
        this.payerVpa = payerVpa;
    }

    public String getCol9Filler() {
        return col9Filler;
    }

    public void setCol9Filler(String col9Filler) {
        this.col9Filler = col9Filler;
    }

    public String getCol10Filler() {
        return col10Filler;
    }

    public void setCol10Filler(String col10Filler) {
        this.col10Filler = col10Filler;
    }

    public String getPayeeVpa() {
        return payeeVpa;
    }

    public void setPayeeVpa(String payeeVpa) {
        this.payeeVpa = payeeVpa;
    }

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public String getRemIfscCode() {
        return remIfscCode;
    }

    public void setRemIfscCode(String remIfscCode) {
        this.remIfscCode = remIfscCode;
    }

    public String getCol11Filler() {
        return col11Filler;
    }

    public void setCol11Filler(String col11Filler) {
        this.col11Filler = col11Filler;
    }

    public String getRemAccountNo() {
        return remAccountNo;
    }

    public void setRemAccountNo(String remAccountNo) {
        this.remAccountNo = remAccountNo;
    }

    public String getCol12Filler() {
        return col12Filler;
    }

    public void setCol12Filler(String col12Filler) {
        this.col12Filler = col12Filler;
    }

    public String getCol13Filler() {
        return col13Filler;
    }

    public void setCol13Filler(String col13Filler) {
        this.col13Filler = col13Filler;
    }

    public String getCol14Filler() {
        return col14Filler;
    }

    public void setCol14Filler(String col14Filler) {
        this.col14Filler = col14Filler;
    }

    public String getCol15Filler() {
        return col15Filler;
    }

    public void setCol15Filler(String col15Filler) {
        this.col15Filler = col15Filler;
    }

    public String getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getTranAmtIntCur() {
        return tranAmtIntCur;
    }

    public void setTranAmtIntCur(String tranAmtIntCur) {
        this.tranAmtIntCur = tranAmtIntCur;
    }

    public String getMarkupRebate() {
        return markupRebate;
    }

    public void setMarkupRebate(String markupRebate) {
        this.markupRebate = markupRebate;
    }

    @Override
    public String toString() {
        return "Npci{" +
                "txId='" + txId + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", col2Filler='" + col2Filler + '\'' +
                ", tranSrlNo='" + tranSrlNo + '\'' +
                ", responseCode='" + responseCode + '\'' +
                ", tranDate='" + tranDate + '\'' +
                ", tranTime='" + tranTime + '\'' +
                ", tranAmount='" + tranAmount + '\'' +
                ", col3Filler='" + col3Filler + '\'' +
                ", col4Filler='" + col4Filler + '\'' +
                ", purposeCode='" + purposeCode + '\'' +
                ", col7Filler='" + col7Filler + '\'' +
                ", col8Filler='" + col8Filler + '\'' +
                ", payerVpa='" + payerVpa + '\'' +
                ", col9Filler='" + col9Filler + '\'' +
                ", col10Filler='" + col10Filler + '\'' +
                ", payeeVpa='" + payeeVpa + '\'' +
                ", participantId='" + participantId + '\'' +
                ", remIfscCode='" + remIfscCode + '\'' +
                ", col11Filler='" + col11Filler + '\'' +
                ", remAccountNo='" + remAccountNo + '\'' +
                ", col12Filler='" + col12Filler + '\'' +
                ", col13Filler='" + col13Filler + '\'' +
                ", col14Filler='" + col14Filler + '\'' +
                ", col15Filler='" + col15Filler + '\'' +
                ", institutionCode='" + institutionCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", tranAmtIntCur='" + tranAmtIntCur + '\'' +
                ", markupRebate='" + markupRebate + '\'' +
                '}';
    }
}


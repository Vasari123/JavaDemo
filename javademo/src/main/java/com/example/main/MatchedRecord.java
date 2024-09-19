package com.example.main;


import java.util.Objects;

public class MatchedRecord {
    private String tranId;
    private String tranDate;
    private String tranAmount;
    public MatchedRecord() {
    }
    public MatchedRecord(String tranId, String tranDate, String tranAmount) {
        this.tranId = tranId;
        this.tranDate = tranDate;
        this.tranAmount = tranAmount;
    }

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranAmount() {
        return tranAmount;
    }
    public void setTranAmount(String tranAmount) {
        this.tranAmount = tranAmount;
    }
    public String getTranId() {
        return tranId;
    }
    public void setTranId(String tranId) {
        this.tranId = tranId;
    }
    @Override
    public String toString() {
        return "MatchedRecord{" +
                "txnId='" + tranId + '\'' +
                ", tranDate='" + tranDate + '\'' +
                ", tranAmount='" + tranAmount + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchedRecord that = (MatchedRecord) o;
        return Objects.equals(tranId, that.tranId) && Objects.equals(tranDate, that.tranDate) && Objects.equals(tranAmount, that.tranAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tranId, tranDate, tranAmount);
    }
}


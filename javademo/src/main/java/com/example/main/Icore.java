package com.example.main;


import java.util.Objects;

public class Icore {
    private String poolAccNo;
    private String valueDate;
    private String tranDate;
    private String tranId;
    private String remarks;
    private String narration;
    private String dummyCol1Filler;
    private String dummyCol2Filler;
    private String remAccNo;
    private String tranAmount;
    private String drcr;
    public Icore() {

    }
    public Icore(String poolAccNo, String valueDate, String tranDate, String tranId, String remarks, String narration, String dummyCol1Filler, String dummyCol2Filler, String remAccNo, String tranAmount, String drcr) {
        this.poolAccNo = poolAccNo;
        this.valueDate = valueDate;
        this.tranDate = tranDate;
        this.tranId = tranId;
        this.remarks = remarks;
        this.narration = narration;
        this.dummyCol1Filler = dummyCol1Filler;
        this.dummyCol2Filler = dummyCol2Filler;
        this.remAccNo = remAccNo;
        this.tranAmount = tranAmount;
        this.drcr = drcr;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Icore icore = (Icore) o;
        return Objects.equals(getTranDate(), icore.getTranDate()) && Objects.equals(getTranId(), icore.getTranId());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getTranDate(), getTranId());
    }
    public String getPoolAccNo() {
        return poolAccNo;
    }
    public void setPoolAccNo(String poolAccNo) {
        this.poolAccNo = poolAccNo;
    }
    public String getValueDate() {
        return valueDate;
    }
    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }
    public String getTranDate() {
        return tranDate;
    }
    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }
    public String getTranId() {
        return tranId;
    }
    public void setTranId(String tranId) {
        this.tranId = tranId;
    }
    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public String getNarration() {
        return narration;
    }
    public void setNarration(String narration) {
        this.narration = narration;
    }
    public String getDummyCol1Filler() {
        return dummyCol1Filler;
    }
    public void setDummyCol1Filler(String dummyCol1Filler) {
        this.dummyCol1Filler = dummyCol1Filler;
    }
    public String getDummyCol2Filler() {
        return dummyCol2Filler;
    }
    public void setDummyCol2Filler(String dummyCol2Filler) {
        this.dummyCol2Filler = dummyCol2Filler;
    }
    public String getRemAccNo() {
        return remAccNo;
    }
    public void setRemAccNo(String remAccNo) {
        this.remAccNo = remAccNo;
    }
    public String getTranAmount() {
        return tranAmount;
    }
    public void setTranAmount(String tranAmount) {
        this.tranAmount = tranAmount;
    }
    public String getDrcr() {
        return drcr;
    }
    public void setDrcr(String drcr) {
        this.drcr = drcr;
    }
    @Override
    public String toString() {
        return "Icore{" +
                "poolAccNo='" + poolAccNo + '\'' +
                ", valueDate='" + valueDate + '\'' +
                ", tranDate='" + tranDate + '\'' +
                ", tranId='" + tranId + '\'' +
                ", remarks='" + remarks + '\'' +
                ", narration='" + narration + '\'' +
                ", dummyCol1Filler='" + dummyCol1Filler + '\'' +
                ", dummyCol2Filler='" + dummyCol2Filler + '\'' +
                ", remAccNo='" + remAccNo + '\'' +
                ", tranAmount='" + tranAmount + '\'' +
                ", drcr='" + drcr + '\'' +
                '}';
    }
}


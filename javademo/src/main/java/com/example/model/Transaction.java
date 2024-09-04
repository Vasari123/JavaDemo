package com.example.model;


import java.util.Objects;

public class Transaction {
    private String txnId;
    private String txnDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(getTxnId(), that.getTxnId()) && Objects.equals(getTxnDate(), that.getTxnDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTxnId(), getTxnDate());
    }

    public Transaction(String txnId, String txnDate) {
        this.txnId = txnId;
        this.txnDate = txnDate;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(String txnDate) {
        this.txnDate = txnDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "txnId='" + txnId + '\'' +
                ", txnDate='" + txnDate + '\'' +
                '}';
    }
}


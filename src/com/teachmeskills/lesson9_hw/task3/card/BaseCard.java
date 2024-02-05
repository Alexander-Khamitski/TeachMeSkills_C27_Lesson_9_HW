package com.teachmeskills.lesson9_hw.task3.card;

public abstract sealed class BaseCard permits BelCard, MasterCard, Visa {

    private String cardNumber;
    private int cvcCvv;
    private double balance;
    private int cardId;
    private String currency;
    private double transferLimit;

    public BaseCard(String cardNumber, int cvcCvv, double balance, int cardId, String currency, double transferLimit) {
        this.cardNumber = cardNumber;
        this.cvcCvv = cvcCvv;
        this.balance = balance;
        this.cardId = cardId;
        this.currency = currency;
        this.transferLimit = transferLimit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCardId() {
        return cardId;
    }

    public String getCurrency() {
        return currency;
    }

    public double getTransferLimit() {
        return transferLimit;
    }

    @Override
    public String toString() {
        return "BaseCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cvcCvv=" + cvcCvv +
                ", balance=" + balance +
                ", cardId=" + cardId +
                ", currency='" + currency + '\'' +
                ", transferLimit=" + transferLimit +
                '}';
    }
}

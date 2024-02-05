package com.teachmeskills.lesson9_hw.task3.client;

import com.teachmeskills.lesson9_hw.task3.card.BaseCard;

import java.util.Arrays;

public class Client {

    String firstname;
    String lastname;
    String passportNumber;
    String birthday;
    String[] address;
    BaseCard[] baseCards;

    public Client(String firstname, String lastname, String passportNumber, String birthday, String[] address, BaseCard[] baseCards) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.passportNumber = passportNumber;
        this.birthday = birthday;
        this.address = address;
        this.baseCards = baseCards;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public BaseCard[] getBaseCards() {
        return baseCards;
    }

    public String getClientCardsInfo() {
        return "Client cards info: " + Arrays.deepToString(baseCards);
    }
}

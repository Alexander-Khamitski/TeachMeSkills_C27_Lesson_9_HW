package com.teachmeskills.lesson9_hw.task3.factory.client;

import com.teachmeskills.lesson9_hw.task3.card.BaseCard;
import com.teachmeskills.lesson9_hw.task3.client.Client;
import com.teachmeskills.lesson9_hw.task3.factory.card.CardFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClientFactory {

    public static Client generateClient() {
        String birthday = getBirthdayByClientAge(29);
        String[] address = {"211203", "Republic of Belarus", "Minsk", "Green Street", "25"};
        BaseCard[] baseCards = CardFactory.generateBaseCards();
        return new Client(
                "Roman",
                "Petrov",
                "KB3456197",
                birthday,
                address,
                baseCards);
    }

    private static String getBirthdayByClientAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Client age is not valid: " + age);
        }
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int birthYear = currentYear - age;
        calendar.set(Calendar.YEAR, birthYear);
        Date birthDate = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return dateFormat.format(birthDate);
    }

}

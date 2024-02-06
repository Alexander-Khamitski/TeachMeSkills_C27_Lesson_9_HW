package com.teachmeskills.lesson9_hw.task3.helper.transfer;

import com.teachmeskills.lesson9_hw.task3.card.BaseCard;
import com.teachmeskills.lesson9_hw.task3.client.Client;
import com.teachmeskills.lesson9_hw.task3.helper.fee.impl.FeeHelper;
import com.teachmeskills.lesson9_hw.task3.util.constants.conversion.impl.Conversion;

import static com.teachmeskills.lesson9_hw.task3.util.constants.transferInfo.TransferInfo.*;

public class TransferHelper {

    public static void transfer(BaseCard cardFrom, BaseCard cardTo, double amount) {
        BALANCE_FROM_CARD_BEFORE_TRANSFER = cardFrom.getBalance();
        String cardFromCurrency = cardFrom.getCurrency();
        FEE = amount * FeeHelper.getFee(cardTo.getCurrency()) / 100;
        BALANCE_FROM_CARD_AFTER_TRANSFER = BALANCE_FROM_CARD_BEFORE_TRANSFER - amount - FEE;
        cardFrom.setBalance(BALANCE_FROM_CARD_BEFORE_TRANSFER);

        BALANCE_TO_CARD_BEFORE_TRANSFER = cardTo.getBalance();
        String cardToCurrency = cardTo.getCurrency();
        double conversionRate = Conversion.getConversionRate(cardFromCurrency, cardToCurrency);
        BALANCE_TO_CARD_AFTER_TRANSFER = BALANCE_TO_CARD_BEFORE_TRANSFER + amount * conversionRate;
        cardTo.setBalance(BALANCE_TO_CARD_AFTER_TRANSFER);
    }

    public static void getInfoAfterTransfer(Client client, int cardIdFrom, int cardIdTo) {
        System.out.println("Client: " + client.getFirstname() + " " + client.getLastname());
        System.out.println("Client cards number: " + client.getBaseCards().length);
        System.out.println(String.format(
                "Card with id '%d': balance BEFORE transfer: '%f'",
                cardIdFrom,
                BALANCE_FROM_CARD_BEFORE_TRANSFER));
        System.out.println(String.format(
                "Card with id '%d': balance AFTER transfer: '%f'",
                cardIdFrom,
                BALANCE_FROM_CARD_AFTER_TRANSFER));
        System.out.println(String.format(
                "Card with id '%d': balance BEFORE transfer: '%f'",
                cardIdTo,
                BALANCE_TO_CARD_BEFORE_TRANSFER));
        System.out.println(String.format(
                "Card with id '%d': balance AFTER transfer: '%f'",
                cardIdTo,
                BALANCE_TO_CARD_AFTER_TRANSFER));
        System.out.println("Fee: " + FEE);
        System.out.println("Successful!");
    }

}

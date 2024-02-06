package com.teachmeskills.lesson9_hw.task3.util.constants.conversion.impl;

import com.teachmeskills.lesson9_hw.task3.util.constants.conversion.IConversionRate;

public class Conversion implements IConversionRate {

    public static double getConversionRate(String currencyFrom, String currencyTo) {
        if (currencyFrom.equals("BYN") && currencyTo.equals("EUR")) {
            return BYN_TO_EUR;
        } else if (currencyFrom.equals("BYN") && currencyTo.equals("USD")) {
            return BYN_TO_USD;
        } else if (currencyFrom.equals("EUR") && currencyTo.equals("BYN")) {
            return EUR_TO_BYN;
        } else if (currencyFrom.equals("EUR") && currencyTo.equals("USD")) {
            return EUR_TO_USD;
        } else if (currencyFrom.equals("USD") && currencyTo.equals("BYN")) {
            return USD_TO_BYN;
        } else if (currencyFrom.equals("USD") && currencyTo.equals("EUR")) {
            return USD_TO_EUR;
        } else {
            return 1;
        }
    }

}

package com.teachmeskills.lesson9_hw.task3.util.conversion.impl;

import com.teachmeskills.lesson9_hw.task3.util.conversion.IConversionRate;

public class Conversion implements IConversionRate {

    public static double getConversionRate(String currencyFrom, String currencyTo) {
        if (currencyFrom.equals("BYN") && currencyTo.equals("EUR")) {
            return IConversionRate.BYN_TO_EUR;
        } else if (currencyFrom.equals("BYN") && currencyTo.equals("USD")) {
            return IConversionRate.BYN_TO_USD;
        } else if (currencyFrom.equals("EUR") && currencyTo.equals("BYN")) {
            return IConversionRate.EUR_TO_BYN;
        } else if (currencyFrom.equals("EUR") && currencyTo.equals("USD")) {
            return IConversionRate.EUR_TO_USD;
        } else if (currencyFrom.equals("USD") && currencyTo.equals("BYN")) {
            return IConversionRate.USD_TO_BYN;
        } else if (currencyFrom.equals("USD") && currencyTo.equals("EUR")) {
            return IConversionRate.USD_TO_EUR;
        } else {
            return 1;
        }
    }

}

package com.teachmeskills.lesson9_hw.task3.helper.fee.impl;

import com.teachmeskills.lesson9_hw.task3.helper.fee.IFee;

public class FeeHelper implements IFee {

    public static double getFee(String currencyTo) {
        if (currencyTo.equals("BYN")) {
            return BYN_FEE;
        } else if (currencyTo.equals("EUR")) {
            return EUR_FEE;
        } else {
            return USD_FEE;
        }
    }

}

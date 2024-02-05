package com.teachmeskills.lesson9_hw.task3.helper.fee.impl;

import com.teachmeskills.lesson9_hw.task3.helper.fee.IFee;

public class FeeHelper {

    public static double getFee(String currencyTo) {
        if (currencyTo.equals("BYN")) {
            return IFee.BYN_FEE;
        } else if (currencyTo.equals("EUR")) {
            return IFee.EUR_FEE;
        } else {
            return IFee.USD_FEE;
        }
    }

}

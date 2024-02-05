package com.teachmeskills.lesson9_hw.task3.factory.card;

import com.teachmeskills.lesson9_hw.task3.card.BaseCard;
import com.teachmeskills.lesson9_hw.task3.card.BelCard;
import com.teachmeskills.lesson9_hw.task3.card.MasterCard;
import com.teachmeskills.lesson9_hw.task3.card.Visa;

public class CardFactory {

    public static BaseCard[] generateBaseCards() {
        BaseCard belcard1 = new BelCard(
                "4402-4577-8721-9905", 345, 2345.56, 1, "BYN", 1000);
        BaseCard belcard2 = new BelCard(
                "3456-1234-5566-7766", 275, 3350.67, 2, "BYN", 1000);
        BaseCard masterCard = new MasterCard(
                "1256-6677-8256-9911", 456, 3789.06, 3, "EUR", 500);
        BaseCard visa = new Visa(
                "3345-6578-4212-7899", 567, 4550.06, 4, "USD", 600);
        return new BaseCard[] {belcard1, belcard2, masterCard, visa};
    }

}

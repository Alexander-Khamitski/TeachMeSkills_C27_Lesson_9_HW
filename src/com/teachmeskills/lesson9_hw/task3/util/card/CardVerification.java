package com.teachmeskills.lesson9_hw.task3.util.card;

import com.teachmeskills.lesson9_hw.task3.card.BaseCard;
import com.teachmeskills.lesson9_hw.task3.client.Client;
import com.teachmeskills.lesson9_hw.task3.helper.card.CardHelper;

public class CardVerification {

    public static boolean isCardExist(Client client, int cardId) {
        if (CardHelper.getAllClientCardIds(client).contains(cardId)) {
            return true;
        } else {
            throw new IllegalArgumentException("Unexpected card ID: " + cardId);
        }
    }

    public static boolean isCardExistAfterChoosingCardForTransferFrom(Client client, int cardIdFrom, int cardIdTo) {
        if (CardHelper.getAllClientCardIdsAfterChoosingCardForTransferFrom(client, cardIdFrom).contains(cardIdTo)) {
            return true;
        } else {
            throw new IllegalArgumentException("Unexpected card ID: " + cardIdTo);
        }
    }

    public static boolean doTransferVerification(BaseCard baseCard, double sum) {
        return isTransferAmountWithinLimit(baseCard, sum) && isTransferAmountWithinBalance(baseCard, sum);
    }

    private static boolean isTransferAmountWithinLimit(BaseCard baseCard, double sum) {
        if (baseCard.getTransferLimit() >= sum) {
            return true;
        } else {
            throw new IllegalArgumentException("Unexpected transfer amount: " + sum);
        }
    }

    private static boolean isTransferAmountWithinBalance(BaseCard baseCard, double sum) {
        if (baseCard.getBalance() >= sum) {
            return true;
        } else {
            throw new IllegalArgumentException("Unexpected transfer amount: " + sum);
        }
    }

}

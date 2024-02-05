package com.teachmeskills.lesson9_hw.task3.helper.card;

import com.teachmeskills.lesson9_hw.task3.card.BaseCard;
import com.teachmeskills.lesson9_hw.task3.client.Client;

import java.util.ArrayList;
import java.util.List;

public class CardHelper {

    public static List<Integer> getAllClientCardIds(Client client) {
        BaseCard[] baseCards = client.getBaseCards();
        List<Integer> cardIds = new ArrayList<>();
        for (BaseCard baseCard : baseCards) {
            cardIds.add(baseCard.getCardId());
        }
        return cardIds;
    }

    public static List<Integer> getAllClientCardIdsAfterChoosingCardForTransferFrom(Client client, int cartIdForDeleting) {
        List<Integer> cardIds = getAllClientCardIds(client);
        cardIds.remove(cardIds.indexOf(cartIdForDeleting));
        return cardIds;
    }

    public static BaseCard getClientCardById(Client client, int cardId) {
        for (BaseCard card : client.getBaseCards()) {
            if (card.getCardId() == cardId) {
                return card;
            }
        }
        throw new IllegalArgumentException("Unexpected card ID: " + cardId);
    }
}

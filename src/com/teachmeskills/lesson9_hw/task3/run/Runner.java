package com.teachmeskills.lesson9_hw.task3.run;

import com.teachmeskills.lesson9_hw.task3.card.BaseCard;
import com.teachmeskills.lesson9_hw.task3.client.Client;
import com.teachmeskills.lesson9_hw.task3.helper.card.CardHelper;
import com.teachmeskills.lesson9_hw.task3.util.card.CardVerification;
import java.util.Scanner;

import static com.teachmeskills.lesson9_hw.task3.factory.client.ClientFactory.generateClient;
import static com.teachmeskills.lesson9_hw.task3.helper.transfer.TransferHelper.getInfoAfterTransfer;
import static com.teachmeskills.lesson9_hw.task3.helper.transfer.TransferHelper.transfer;

public class Runner {

    public static void main(String[] args) {
        Client client = getClient();

        Scanner scanner = new Scanner(System.in);

        int cardIdFrom = getCardIdFrom(scanner, client);
        BaseCard cardFrom = CardHelper.getClientCardById(client, cardIdFrom);

        int cardIdTo = getCardIdTo(scanner, client, cardIdFrom);
        BaseCard cardTo = CardHelper.getClientCardById(client, cardIdTo);

        doTransfer(scanner, cardFrom, cardTo);
        getInfoAfterTransfer(client, cardIdFrom, cardIdTo);
    }

    private static Client getClient() {
        Client client = generateClient();
        System.out.println(client.getClientCardsInfo());
        return client;
    }

    private static int getCardIdFrom(Scanner scanner, Client client) {
        System.out.println("Enter card id for transfer from: " + CardHelper.getAllClientCardIds(client));
        int cardIdFrom = scanner.nextInt();
        CardVerification.isCardExist(client, cardIdFrom);
        return cardIdFrom;
    }

    private static int getCardIdTo(Scanner scanner, Client client, int cardIdFrom) {
        System.out.println("Enter card id for transfer to: " +
                CardHelper.getAllClientCardIdsAfterChoosingCardForTransferFrom(client, cardIdFrom));
        int cardIdTo = scanner.nextInt();
        CardVerification.isCardExistAfterChoosingCardForTransferFrom(client, cardIdFrom, cardIdTo);
        return cardIdTo;
    }

    private static void doTransfer(Scanner scanner, BaseCard cardFrom, BaseCard cardTo) {
        double sum = getSumForTransfer(scanner);
        CardVerification.doTransferVerification(cardFrom, sum);
        transfer(cardFrom, cardTo, sum);
    }

    private static double getSumForTransfer(Scanner scanner) {
        System.out.println("Enter sum for transfer: ");
        double sum = scanner.nextDouble();
        scanner.close();
        if (sum > 0) {
            return sum;
        } else {
            throw new IllegalArgumentException("Unexpected sum for transfer: " + sum);
        }
    }

}

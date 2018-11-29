package com.premiumTravelService;

import java.util.Scanner;

public class PaymentCard extends Payment {
    int _cardNumber;
    int _expirationDate;
    PaymentCard(TripContext context) {
        super(context);
    }

    public int getCardNumber() {
        return _cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this._cardNumber = cardNumber;
    }

    public int getExpirationDate() {
        return _expirationDate;
    }

    public void setExpirationDate(int _expirationDate) {
        this._expirationDate = _expirationDate;
    }

    @Override
    public void collect(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter credit card number: (greater then 100000000 or 9 digit or more)");
        int cardNum = scanner.nextInt();

        System.out.println("Enter expiration date: (greater then 1000)");
        int expirDate = scanner.nextInt();

        if (cardNum > 1000000000 || expirDate > 1000){
            System.out.println("Card Number "+ cardNum + " expire date " + expirDate + " accepted");
            _cardNumber = cardNum;
            _expirationDate = expirDate;
        }
        else {
            System.out.println("ERROR: Try again.");
        }
    }
    @Override
    public String toString(){
        return super.toString() + " card number: " + _cardNumber + " expire date: " + _expirationDate;
    }
}

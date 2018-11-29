package com.premiumTravelService;

import java.util.Scanner;

public class PaymentCheck extends Payment{
    int _checkNumber;
    PaymentCheck(TripContext context) {
        super(context);
    }

    public int getCheckNumber() {
        return _checkNumber;
    }

    public void setCheckNumber(int _checkNumber) {
        this._checkNumber = _checkNumber;
    }

    @Override
    public void collect(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter check number: (greater than 100)");
        int checkNum = scanner.nextInt();

        if(checkNum > 100){
            System.out.println("Check" + checkNum + " accepted.");
            _checkNumber = checkNum;

        }
        else {
            System.out.println("ERROR: Check number must be greater than 100. Try again.");
        }

    }
    @Override
    public String toString(){
        return super.toString() + " check Number "+ _checkNumber;
    }
}

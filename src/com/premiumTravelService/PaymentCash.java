package com.premiumTravelService;

public class PaymentCash extends Payment {
    PaymentCash(TripContext context) {
        super(context);
    }
    @Override
    public String toString(){
        return super.toString() + " cash";
    }
}

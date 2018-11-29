package com.premiumTravelService;

import java.util.Scanner;

public class TripStatePayCash extends TripState {
    private TripContext tripContext;
    protected TripStatePayCash(TripContext tripContext) {
        super(tripContext, Status.PayCash);
    }

    @Override
    public TripStateLoop.Status execute() {
        PaymentCash paymentCash = new PaymentCash(getTripContext());
        paymentCash.collect();

        getTripContext().changeState(new TripStateAddThankYou(getTripContext()));
        return TripStateLoop.Status.Continue;
    }
}

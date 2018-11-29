package com.premiumTravelService;

public class TripStatePayCheck extends TripState{
    protected TripStatePayCheck(TripContext tripContext) {
        super(tripContext, Status.PayCheck);
    }

    @Override
    public TripStateLoop.Status execute() {
        PaymentCheck paymentCheck = new PaymentCheck(getTripContext());
        paymentCheck.collect();
        getTripContext().changeState(new TripStateAddThankYou(getTripContext()));
        return TripStateLoop.Status.Continue;
    }
}

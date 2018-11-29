package com.premiumTravelService;

public class TripStatePayCard extends TripState{
    protected TripStatePayCard(TripContext tripContext) {
        super(tripContext, Status.PayCard);
    }

    @Override
    public TripStateLoop.Status execute() {
        PaymentCard paymentCard = new PaymentCard(getTripContext());
        paymentCard.collect();

        getTripContext().changeState(new TripStateAddThankYou(getTripContext()));
        return TripStateLoop.Status.Continue;
    }
}

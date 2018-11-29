package com.premiumTravelService;

public class TripStateAgent extends TripState {
    protected TripStateAgent(TripContext tripContext, Status tripStateStatus) {
        super(tripContext, tripStateStatus);
    }

    @Override
    public TripStateLoop.Status execute() {

        return null;
    }
}

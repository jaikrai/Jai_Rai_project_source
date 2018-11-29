package com.premiumTravelService;

public class TripStateComplete extends TripState{
    protected TripStateComplete(TripContext tripContext) {
        super(tripContext, Status.Complete);
    }

    @Override
    public TripStateLoop.Status execute() {
        System.out.println(System.lineSeparator());
        System.out.println("***** COMPLETE - ITINERARY AVAILABLE *****");
//        System.out.println(Status.ShowItinerary);
//        getTripContext().changeState(new TripStateShowItinerary(getTripContext()));
        return TripStateLoop.Status.Stop;
    }
}

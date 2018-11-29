package com.premiumTravelService;

import java.util.Date;
import java.util.Random;

public class TripStateCreate extends TripState{
    protected TripStateCreate(TripContext tripContext) {
        super(tripContext, Status.Create);
        Trip trip = new Trip();

        trip.setBookedOn(new Date());
        trip.setOrderId(new Random().nextInt(10000));
        trip.setTripStateStatus(Status.Create);

        getTripContext().setTrip(trip);
    }

    @Override
    public TripStateLoop.Status execute() {

        System.out.println();
        System.out.println("****** NEW TRIP CREATED *************");
        System.out.println();
        getTripContext().getTrip().getContactPerson();
        getTripContext().changeState(new TripStateContactPerson(getTripContext()));
        return TripStateLoop.Status.Continue;
    }
}

package com.premiumTravelService;

public class TripStateShowItinerary  extends TripState{
    protected TripStateShowItinerary(TripContext tripContext) {
        super(tripContext, Status.ShowItinerary);
    }

    @Override
    public TripStateLoop.Status execute() {
        Trip trip = new Trip();
        IItineraryComponent decorator = new Itinerary(trip);
        decorator  = new ItineraryAppendSeparator(decorator);
        decorator = new ItineraryAppendBookingDetails(decorator);
        decorator = new ItineraryAppendSeparator(decorator);
        decorator = new ItineraryAppendAddPackages(decorator);
        decorator  = new ItineraryAppendSeparator(decorator);
        decorator = new ItineraryAppendThankYou(decorator);
        decorator = new ItineraryAppendSeparator(decorator);
        decorator.output();

        return TripStateLoop.Status.Stop;
    }
}

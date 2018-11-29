package com.premiumTravelService;

public class TripContextStateFactory {
    public static TripState get(TripContext context) throws Exception
    {
        assert context != null;
        assert context.getTrip() != null;

        TripState.Status tripStateStatus = context.getTrip().getTripStateStatus();

        switch (tripStateStatus)
        {
            case Create:
                return new TripStateCreate(context);

            case AddDestinations:
                return new TripStateAddDestinations(context);

            case AddPackages:
                return new TripStateAddPackages(context);

            case addCustomer:
                return new TripStateContactPerson(context);

            case AddTravellers:
                return new TripStateAddTraveller(context);

            case ChoosePaymentType:
                return new TripStateChoosePaymentType(context);

            case AddThankYou:
                return new TripStateAddThankYou(context);

            case Complete:
                return new TripStateComplete(context);

            default:
                throw new Exception(tripStateStatus + " is an invalid state");
        }
    }
}

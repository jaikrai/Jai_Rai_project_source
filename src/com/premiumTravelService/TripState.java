package com.premiumTravelService;

public abstract class TripState {
    private TripContext _tripContext;

    protected TripState(TripContext tripContext, Status tripStateStatus){
        _tripContext = tripContext;

        if(_tripContext.getTrip() != null)
            tripContext.getTrip().setTripStateStatus(tripStateStatus);
    }
    public TripContext getTripContext() {
        return _tripContext;
    }
    public void setTripContext(TripContext tripContext){
        _tripContext = tripContext;
    }

    public abstract TripStateLoop.Status execute();


    ///     Return later helper... used in a few places,
    ///     so moved to base class to eliminate redundant code
    protected boolean returnLater(String answer){
        boolean returnLater = answer.toLowerCase().equals("later");

        if(returnLater){
            System.out.println();
            System.out.println("*** RETURN LATER TO FINISH ***");
        }

        return returnLater;
    }

    /// <summary>
    ///     states a trip can be in.
    ///     create = first state
    ///     complete = last state
    /// </summary>
   public enum Status{
        Create,
        AddDestinations,
        AddPackages,
        AddTravellers,
        addCustomer,
        ChoosePaymentType,
        PayCash,
        PayCard,
        PayCheck,
        AddThankYou,
        ShowItinerary,
        Complete
    }
}

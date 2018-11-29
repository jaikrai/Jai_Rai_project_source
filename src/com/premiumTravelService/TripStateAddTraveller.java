package com.premiumTravelService;

import java.util.Scanner;

public class TripStateAddTraveller extends TripState {
    protected TripStateAddTraveller(TripContext tripContext) {
        super(tripContext, Status.AddTravellers);
    }

    private boolean isTravellerListValid(){
        if(!getTripContext().getTrip().getTravellers().isEmpty())
            return true;

        System.out.println("ERROR: At least ONE travellers is required.");
        return false;
    }

    private boolean isTravellerValid(String newDestination){
        if(newDestination.isEmpty()){
            System.out.println("ERROR: Blank travellers are prohibited!");
            return false;
        }

        boolean isDuplicate = getTripContext().getTrip().getTravellers().contains(newDestination);
        if(isDuplicate)
            System.out.println("ERROR: Unique travellers only!");

        return !isDuplicate;
    }

    private boolean continueEnteringTravellers(String newTraveller){
        boolean done = newTraveller.toLowerCase().equals("done");

        if(done && !getTripContext().getTrip().getTravellers().isEmpty()){
            System.out.println();
            System.out.println("*** TRAVELLERS ADDED: " + getTripContext().getTrip().getTravellers().size() + " entered ***");
        }

        return !done;
    }

    private void showCurrentTravellers(){
        if(!getTripContext().getTrip().getTravellers().isEmpty()){

            System.out.println("- Currently " + getTripContext().getTrip().getTravellers().size() + " in trip");

            for(int dest = 0; dest < getTripContext().getTrip().getTravellers().size(); dest++)
                System.out.println((dest + 1) + ". " + getTripContext().getTrip().getTravellers().get(dest));

            System.out.println();
        }
    }

    @Override
    public TripStateLoop.Status execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("*** ADD TRAVELLERS ***");
        System.out.println();
        showCurrentTravellers();
        System.out.println(
                "- COMMAND: [later] to return later, [done] to finish destinations, or add travellers");
//        String traveller = scanner.nextLine();

        Boolean getTravellers = true;
        while (getTravellers)
        {
            String newTraveller = scanner.nextLine().trim();

            //come back later?
            if (returnLater(newTraveller)) return TripStateLoop.Status.Stop;

            //check unique and continue entering
            if (continueEnteringTravellers(newTraveller))
            {
                if (isTravellerValid(newTraveller))
                {
                    getTripContext().getTrip().getTravellers().add(newTraveller);
                    System.out.println("- Added Travellers [" + newTraveller + "]");
                }
            }
            else
            {
                // stop if we can change state
                getTravellers = !isTravellerListValid();
            }
        }
        getTripContext().changeState(new TripStateChoosePaymentType(getTripContext()));
        return TripStateLoop.Status.Continue;
    }
}

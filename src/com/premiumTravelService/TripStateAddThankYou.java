package com.premiumTravelService;

import java.util.Scanner;

public class TripStateAddThankYou extends TripState {
    protected TripStateAddThankYou(TripContext tripContext) {
        super(tripContext, Status.AddThankYou);
    }

    private boolean IsThankYouValid(String thankYou) {
        if (thankYou.isEmpty()){
            System.out.println("- ERROR: Thank You cannot be empty");
            return false;
        }

        if (thankYou.length() < 5) {
            System.out.println("- ERROR: Thank you must be at least 5 characters");
            return false;
        }

        return true;
    }

    @Override
    public TripStateLoop.Status execute() {
        System.out.println();
//        System.out.println("- COMMAND: [later] to return later or write thank you note (5 chars min)");

//        String thankYou

//        System.out.println("THANK YOU FOR YOU BUSINESS. HAVE WONDERFUL JOURNEY!!!!!");
        Scanner scanner = new Scanner(System.in);
        boolean getThankYou = true;
        String thankYou = "THANK YOU FOR YOU BUSINESS. HAVE WONDERFUL JOURNEY!!!!!";



        while (getThankYou) {
            thankYou.equals(thankYou);

            //come back later?
            if (returnLater(thankYou)) return TripStateLoop.Status.Stop;

            //stop if we can change state
            getThankYou = !IsThankYouValid(thankYou);

        }
        getTripContext().getTrip().setThankYou(thankYou);
        getTripContext().changeState(new TripStateComplete(getTripContext()));
        return TripStateLoop.Status.Continue;
    }
}

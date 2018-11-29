package com.premiumTravelService;

import java.util.Scanner;

public class TripStateAddPackages extends TripState{

    protected TripStateAddPackages(TripContext tripContext) {
        super(tripContext, Status.AddPackages);
    }

    @Override
    public TripStateLoop.Status execute() {

        Scanner scanner = new Scanner(System.in);

        TripPackagePremium premium = new TripPackagePremium("PREMIUM", 35000.00, "PRIVATE JET","YACHT");
        TripPackageGold gold = new TripPackageGold("GOLD", 25000.00,"HELICOPTER","LIMOUSINE");
        TripPackageBronze bronze = new TripPackageBronze("BRONZE", 15000.00,"VANITY BUS","LIMOUSINE");
        TripPackageSilver silver = new TripPackageSilver("SILVER", 8000.00,"FIRST CLASS", "LIMOUSINE");
        System.out.println();
        System.out.println("**** LIST OF PACKAGES ****");
        System.out.println();
        System.out.println("1. Premium ");
        System.out.println("2. Gold ");
        System.out.println("3. Bronze ");
        System.out.println("4. Silver ");
        System.out.println();
        System.out.println("*******ADD PACKAGES******");
        System.out.println();
        System.out.println("Enter list number [1] or [2] or [3] or [4] to add Package in your trip");
        String string = scanner.nextLine();
        System.out.println();
        if (string.equals("1")){

            System.out.println("You added \n"+ premium);
            getTripContext().getTrip().getPackages().add(premium);

        }
        else if (string.equals("2")){

            System.out.println("You Added \n"+ gold);
            getTripContext().getTrip().getPackages().add(gold);
        }
        else if (string.equals("3")){

            System.out.println("You Added \n"+ bronze);
            getTripContext().getTrip().getPackages().add(bronze);
        }
        else if (string.equals("4")){

            System.out.println("You Added \n"+ silver);
            getTripContext().getTrip().getPackages().add(silver);
        }

        getTripContext().changeState(new TripStateAddTraveller(getTripContext()));
        return TripStateLoop.Status.Continue;
    }
}

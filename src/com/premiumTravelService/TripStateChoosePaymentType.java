package com.premiumTravelService;

import java.util.Scanner;

public class TripStateChoosePaymentType extends TripState {
    protected TripStateChoosePaymentType(TripContext tripContext) {
        super(tripContext, Status.ChoosePaymentType);
    }

    @Override
    public TripStateLoop.Status execute() {
        System.out.println(System.lineSeparator());
        System.out.println("**** CHOOSE PAYMENT TYPE ****");
        System.out.println();
        System.out.println("- COMMAND: [later] to return later, Pay with [cash] or [check] or [card]");

        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            String paymentType = new String();

            if(scanner.hasNext())
                paymentType = scanner.next().trim();

            if (returnLater(paymentType)) return TripStateLoop.Status.Stop; //exit loop and method

            //empty entry does nothing
            if (paymentType.isEmpty()) continue;

            if (paymentType.equals("cash"))
            {
                getTripContext().changeState(new TripStatePayCash(getTripContext()));
                return TripStateLoop.Status.Continue;
            }

            if (paymentType.equals("card"))
            {
//                getTripContext().getTrip().getTripPackagePremium()
                getTripContext().changeState(new TripStatePayCard(getTripContext()));
                return TripStateLoop.Status.Continue;
            }

            if (paymentType.equals("check"))
            {
                getTripContext().changeState(new TripStatePayCheck(getTripContext()));
                return TripStateLoop.Status.Continue;
            }
            else {
                System.out.println("- ERROR: [later], [cash], or [check] or [card] try again" );

            }


        }

    }
}

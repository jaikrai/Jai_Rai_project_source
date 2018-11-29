package com.premiumTravelService;

import java.util.Scanner;

public class TripStateContactPerson extends TripState {
    protected TripStateContactPerson(TripContext tripContext) {
        super(tripContext, Status.addCustomer);
    }

    @Override
    public TripStateLoop.Status execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*********ADD CUSTOMER******");

        System.out.println("Add customer name: ");
        String contact = scanner.nextLine();

        System.out.println("Phone number: ");
        String phNumber = scanner.nextLine();

        Person person = new Person(contact, phNumber);
        getTripContext().getTrip().getContactPerson().add(person);
        getTripContext().changeState(new TripStateAddDestinations(getTripContext()));
        return TripStateLoop.Status.Continue;

    }
}

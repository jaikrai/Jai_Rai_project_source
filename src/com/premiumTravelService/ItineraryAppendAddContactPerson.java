package com.premiumTravelService;

public class ItineraryAppendAddContactPerson extends ItineraryDecorator{
    public ItineraryAppendAddContactPerson(IItineraryComponent componentToDecorate) {
        super(componentToDecorate);
    }
    @Override
    public String output() {
        StringBuilder toOutput = new StringBuilder(super.output());

        toOutput.append("CUSTOMER INFORMATION");

        toOutput.append(System.lineSeparator());
        toOutput.append(getTrip().getContactPerson());
        toOutput.append(System.lineSeparator());

        return toOutput.toString();
    }
}

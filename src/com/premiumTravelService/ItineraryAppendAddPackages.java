package com.premiumTravelService;

public class ItineraryAppendAddPackages extends ItineraryDecorator{
    public ItineraryAppendAddPackages(IItineraryComponent componentToDecorate) {
        super(componentToDecorate);
    }

    @Override
    public String output() {
        StringBuilder toOutput = new StringBuilder(super.output());

        toOutput.append("PACKAGES");

        toOutput.append(System.lineSeparator());
        toOutput.append(System.lineSeparator());

        for(int destination = 0; destination < getTrip().getPackages().size(); destination++){
            toOutput.append(destination + 1);
            toOutput.append(". ");
            toOutput.append(getTrip().getPackages().get(destination));
            toOutput.append(System.lineSeparator());
        }

        return toOutput.toString();
    }
}

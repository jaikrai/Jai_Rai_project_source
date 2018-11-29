package com.premiumTravelService;

public class ItineraryAppendThankYou extends ItineraryDecorator {
    public ItineraryAppendThankYou(IItineraryComponent componentToDecorate) {
        super(componentToDecorate);
    }
    @Override
    public String output(){
        StringBuilder toOutput = new StringBuilder(super.output());

        toOutput.append(getTrip().getThankYou());

        toOutput.append(System.lineSeparator());

        return toOutput.toString();
    }
}
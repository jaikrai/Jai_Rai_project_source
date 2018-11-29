package com.premiumTravelService;

public class ItineraryAppendAddDestinations extends ItineraryDecorator {

    public ItineraryAppendAddDestinations(IItineraryComponent componentToDecorate){
        super(componentToDecorate);
    }

    @Override
    public String output() {
        StringBuilder toOutput = new StringBuilder(super.output());

        toOutput.append("DESTINATIONS");

        toOutput.append(System.lineSeparator());
        toOutput.append(System.lineSeparator());

        for(int destination = 0; destination < getTrip().getDestinations().size(); destination++){
            toOutput.append(destination + 1);
            toOutput.append(". ");
            toOutput.append(getTrip().getDestinations().get(destination));
            toOutput.append(System.lineSeparator());
        }

        return toOutput.toString();
    }
}



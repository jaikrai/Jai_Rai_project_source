package com.premiumTravelService;

public class ItineraryAppendAddTravellers extends ItineraryDecorator {
    public ItineraryAppendAddTravellers(IItineraryComponent componentToDecorate) {
        super(componentToDecorate);
    }

    @Override
    public String output() {
        StringBuilder toOutput = new StringBuilder(super.output());

        toOutput.append("TRAVELLERS");

        toOutput.append(System.lineSeparator());
        toOutput.append(System.lineSeparator());

        for(int travellers= 0; travellers < getTrip().getTravellers().size(); travellers++){
            toOutput.append(travellers + 1);
            toOutput.append(". ");
            toOutput.append(getTrip().getTravellers().get(travellers));
            toOutput.append(System.lineSeparator());
        }

        return toOutput.toString();
    }
}

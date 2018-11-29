package com.premiumTravelService;

public class ItineraryAppendAgent extends ItineraryDecorator  {
    public ItineraryAppendAgent(IItineraryComponent componentToDecorate) {
        super(componentToDecorate);
    }
    @Override
    public String output() {
        StringBuilder toOutput = new StringBuilder(super.output());

        toOutput.append("******AGENT*****");
        toOutput.append(System.lineSeparator());
        toOutput.append("Allen Smith");


        return toOutput.toString();
    }
}

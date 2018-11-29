package com.premiumTravelService;

public class ItineraryAppendBookingDetails extends ItineraryDecorator {
    public ItineraryAppendBookingDetails(IItineraryComponent componentToDecorate) {
        super(componentToDecorate);
    }
    @Override
    public String output() {
        String toOutput = super.output();

        toOutput += "Agent: "+" John Ray" + System.lineSeparator();
        toOutput += "Order # : " + getTrip().getOrderId() + System.lineSeparator();
        toOutput += "Booked : " + getTrip().getBookedOn() + System.lineSeparator();
        toOutput += "Payment: $" + getTrip().GrandTotal() + System.lineSeparator();

        return toOutput;
    }
}

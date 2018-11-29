package com.premiumTravelService;

public class ItineraryDecorator implements IItineraryComponent {
    private final IItineraryComponent _componentToDecorate;

    public ItineraryDecorator(IItineraryComponent componentToDecorate) {
        _componentToDecorate = componentToDecorate;
    }

    @Override
    public Trip getTrip() {
        return _componentToDecorate.getTrip();
    }

    @Override
    public String output() {
        return _componentToDecorate.output();
    }
}

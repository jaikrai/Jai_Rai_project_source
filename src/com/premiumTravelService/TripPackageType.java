package com.premiumTravelService;

public class TripPackageType {
    String start;
    String destination;
    double price;
    int hoursOfTravel;

    TripPackageType(String strt, String des, double pr, int hrsOfTravel){
        start = strt;
        destination = des;
        price = pr;
        hoursOfTravel = hrsOfTravel;
    }

    public TripPackageType() {

    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHoursOfTravel() {
        return hoursOfTravel;
    }

    public void setHoursOfTravel(int hoursOfTravel) {
        this.hoursOfTravel = hoursOfTravel;
    }

    @Override
    public String toString(){

        return " Start destination: " + getStart()+"\n End: destination: "+ getDestination()+"\nPrice: "+getPrice()
                + "\nHours of Travel: "+getHoursOfTravel();
    }
}

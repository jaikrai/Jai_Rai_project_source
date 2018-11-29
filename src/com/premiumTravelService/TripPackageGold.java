package com.premiumTravelService;

public class TripPackageGold extends TripPackageType{
    String PackageName = "PREMIUM";
    Double Price= Double.valueOf("30000.00");
    String TransportType= "PRIVATE JET";
    String TransportType1 = "YETCH";

    public TripPackageGold(String packageName, Double price, String transportType, String transportType1) {
        super();
        PackageName = packageName;
        Price = price;
        TransportType = transportType;
        TransportType1 = transportType1;
    }

    public String getPackageName() {
        return PackageName;
    }

    public void setPackageName(String packageName) {
        PackageName = packageName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getTransportType() {
        return TransportType;
    }

    public void setTransportType(String transportType) {
        TransportType = transportType;
    }

    public String getTransportType1() {
        return TransportType1;
    }

    public void setTransportType1(String transportType1) {
        TransportType1 = transportType1;
    }

    @Override
    public String toString(){
        return "Package: \t"+ getPackageName()+ "\nPrice: \t$"+getPrice()+ "\nTransportType: \t"+ getTransportType()
                + " \nTransport Type1 : \t"+getTransportType1();
    }
}

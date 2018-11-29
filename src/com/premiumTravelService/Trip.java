package com.premiumTravelService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Trip {
    private String Agent;
    private TripPackageType _tripPackageType;
    private TripPackagePremium tripPackagePremium;
    private long _orderId;
    private Date _bookedOn;
    private List<TripPackageType> _packages;
    private List<String> _travellers;
    private List<String> _destinations;
    private String _thankYou;
    private Payment _payment;
    private List<Person> contactPerson;

    ///     Holds status of Trip instance.
    ///     Do not arbitrarily change.
    ///     Must be managed by TripState machine.
    private TripState.Status _tripStateStatus;

    public Trip(){
        _tripStateStatus = TripState.Status.Create;
        _packages = new ArrayList<TripPackageType>();
        _travellers = new ArrayList<String>();
        _destinations = new ArrayList<String>();
        contactPerson = new ArrayList<Person>();

    }

    //Getters and setters
    public long getOrderId() {
        return _orderId;
    }
    public void setOrderId(long _orderId) {
        this._orderId = _orderId;
    }
    public Date getBookedOn() {
        return _bookedOn;
    }
    public void setBookedOn(Date _bookedOn) {
        this._bookedOn = _bookedOn;
    }
    public List<TripPackageType> getPackages() {
        return _packages;
    }
    public void setPackages(List<TripPackageType> _packages) {
        this._packages = _packages;
    }
    public String getThankYou() {
        return _thankYou;
    }
    public void setThankYou(String _thankYou) {
        this._thankYou = _thankYou;
    }
    public Payment getPayment() {
        return _payment;
    }
    public void setPayment(Payment _payment) {
        this._payment = _payment;
    }
    public TripState.Status getTripStateStatus() {
        return _tripStateStatus;
    }
    public void setTripStateStatus(TripState.Status _tripStateStatus) {
        this._tripStateStatus = _tripStateStatus;
    }
    public Double GrandTotal(){
        double price = 0.0;
        for (int i = 0; i < _packages.size(); i++ ){
            TripPackageType tem = _packages.get(i);
             price += tem.getPrice();
           
        }
        return price;

    }
    public String getAgent() {
        return Agent;
    }
    public void setAgent(String agent) {
        Agent = agent;
    }
    public List<String> getTravellers() {
        return _travellers;
    }
    public void setTravellers(List<String> _travellers) {
        this._travellers = _travellers;
    }
    public TripPackagePremium getTripPackagePremium() {
        return tripPackagePremium;
    }
    public void setTripPackagePremium(TripPackagePremium tripPackagePremium) {
        this.tripPackagePremium = tripPackagePremium;
    }
    public List<String> getDestinations() {
        return _destinations;
    }
    public void setDestinations(List<String> _destinations) {
        this._destinations = _destinations;
    }
    public List<Person> getContactPerson() {
        return contactPerson;
    }
    public void setContactPerson(List<Person> contactPerson) {
        this.contactPerson = contactPerson;
    }
    //End getters and setters

}

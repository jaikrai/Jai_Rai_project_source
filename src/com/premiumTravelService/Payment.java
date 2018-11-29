package com.premiumTravelService;


import java.util.Scanner;

abstract class Payment {
    protected TripContext _context;
    double amount;
    Payment(TripContext context){
        _context = context;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void collect(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("The "+ _context.getTrip().getPackages().size()+ " packages is cost $" + _context.getTrip().GrandTotal());
            System.out.println("Please pay "+_context.getTrip().GrandTotal());
            double amountPaid = scanner.nextDouble();

            if (amountPaid == _context.getTrip().GrandTotal()){
                System.out.println("$"+ amountPaid + " Payment Accepted");
                amount = amountPaid;
                break;
            }
            else {
                System.out.println("ERROR: Payment must be equal to $" + _context.getTrip().GrandTotal()+ " Try again.");
            }
        }
    }
    @Override
    public String  toString(){
        return  "Payment = $" + getAmount();
    }
}

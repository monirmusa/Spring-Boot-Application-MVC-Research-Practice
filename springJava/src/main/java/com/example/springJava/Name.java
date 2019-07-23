package com.example.springJava;

public class Name {

 private String PassengerName;
 private String RentCharge;

    public Name() {
    }

    public Name(String passengerName, String rentCharge) {
        PassengerName = passengerName;
        RentCharge = rentCharge;
    }

    public String getPassengerName() {
        return PassengerName;
    }

    public void setPassengerName(String passengerName) {
        PassengerName = passengerName;
    }

    public String getRentCharge() {
        return RentCharge;
    }

    public void setRentCharge(String rentCharge) {
        RentCharge = rentCharge;
    }

    @Override
    public String toString() {
        return "Name{" +
                "PassengerName='" + PassengerName + '\'' +
                ", RentCharge='" + RentCharge + '\'' +
                '}';
    }
}


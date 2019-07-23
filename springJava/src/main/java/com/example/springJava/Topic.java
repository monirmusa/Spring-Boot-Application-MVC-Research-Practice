package com.example.springJava;





public class Topic {
    private  String id;
    private String carModel;
    private  String passengerName;
    private String sourceToDestination;
    private  int rentCost;
    private int carOwnerProfit;
    private int companyProfit;


    public Topic() {
    }

    public Topic(String id, String carModel, String passengerName, String sourceToDestination, int rentCost, int carOwnerProfit, int companyProfit) {
        this.id = id;
        this.carModel = carModel;
        this.passengerName = passengerName;
        this.sourceToDestination = sourceToDestination;
        this.rentCost = rentCost;
        this.carOwnerProfit =rentCost-companyProfit;
        this.companyProfit = (rentCost*45)/100;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getSourceToDestination() {
        return sourceToDestination;
    }

    public void setSourceToDestination(String sourceToDestination) {
        this.sourceToDestination = sourceToDestination;
    }

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }

    public int getCarOwnerProfit() {
        return carOwnerProfit;
    }

    public void setCarOwnerProfit(int carOwnerProfit) {
        this.carOwnerProfit = carOwnerProfit;
    }

    public int getCompanyProfit() {
        return companyProfit;
    }

    public void setCompanyProfit(int companyProfit) {
        this.companyProfit = companyProfit;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id='" + id + '\'' +
                ", carModel='" + carModel + '\'' +
                ", passengerName='" + passengerName + '\'' +
                ", sourceToDestination='" + sourceToDestination + '\'' +
                ", rentCost=" + rentCost +
                ", carOwnerProfit=" + carOwnerProfit +
                ", companyProfit=" + companyProfit +
                '}';
    }
}

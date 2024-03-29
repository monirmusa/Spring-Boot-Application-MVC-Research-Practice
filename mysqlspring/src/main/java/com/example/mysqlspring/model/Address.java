package com.example.mysqlspring.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

 private  String  streetAddress;
 private String city;
 private  String country;
 private String PostalCode;

    public Address() {
    }

    public Address(String streetAddress, String city, String country, String postalCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.country = country;
        PostalCode = postalCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", PostalCode='" + PostalCode + '\'' +
                '}';
    }
}

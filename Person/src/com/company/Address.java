package com.company;

public class Address {
    String country;
    String city;

    public Address() {
        this.country = "Ukraine";
        this.city = "Kherson";
    }

    public String getAddress() {
        return country + city;
    }
    public void setAddress(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address {" +
                "country = " + country +
                ", city = " + city +
                '}';
    }
}

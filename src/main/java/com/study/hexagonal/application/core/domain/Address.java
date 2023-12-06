package com.study.hexagonal.application.core.domain;

public class Address {

    public Address(String streat, String city, String state) {
        this.streat = streat;
        this.city = city;
        this.state = state;
    }

    public Address(){

    }

    private  String streat;

    private String city;

    private String state;

    public String getStreat() {
        return streat;
    }

    public void setStreat(String streat) {
        this.streat = streat;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

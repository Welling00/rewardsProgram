package com.example.rewardsProgram.requestObjects;

import java.util.List;

public class CustomerPurchases {

    private Integer customerId;
    private String firstName;
    private String lastName;
    private List<Month> months;

    public CustomerPurchases() {
    }

    public CustomerPurchases(Integer customerId, String firstName, String lastName, List<Month> months) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.months = months;
    }

    public List<Month> getMonths() {
        return months;
    }

    public void setMonths(List<Month> months) {
        this.months = months;
    }


    public Integer getCustomerId() {
        return customerId;
    }


    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

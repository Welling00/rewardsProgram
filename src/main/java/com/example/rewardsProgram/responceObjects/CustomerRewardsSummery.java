package com.example.rewardsProgram.responceObjects;

import java.util.ArrayList;
import java.util.List;

public class CustomerRewardsSummery {
    private Integer customerId;
    private String firstName;
    private String lastName;
    private List<String> monthlyRewards = new ArrayList<>();
    private String totalRewards;

    public CustomerRewardsSummery() {
    }

    public CustomerRewardsSummery(Integer customerId, String firstName, String lastName) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public List<String> getMonthlyRewards() {
        return monthlyRewards;
    }

    public void setMonthlyRewards(List<String> monthlyRewards) {
        this.monthlyRewards = monthlyRewards;
    }

    public String getTotalRewards() {
        return totalRewards;
    }

    public void setTotalRewards(String totalRewards) {
        this.totalRewards = totalRewards;
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

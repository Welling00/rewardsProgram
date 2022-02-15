package com.example.rewardsProgram.services;

import com.example.rewardsProgram.requestObjects.CustomerPurchases;
import com.example.rewardsProgram.responceObjects.CustomerRewardsSummery;

public interface RewardsService {

    CustomerRewardsSummery calculateMonthlyReward(CustomerPurchases purchases);

}

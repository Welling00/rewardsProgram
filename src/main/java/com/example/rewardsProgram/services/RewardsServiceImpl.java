package com.example.rewardsProgram.services;

import com.example.rewardsProgram.requestObjects.CustomerPurchases;
import com.example.rewardsProgram.requestObjects.Month;
import com.example.rewardsProgram.responceObjects.CustomerRewardsSummery;
import org.springframework.stereotype.Service;

@Service
public class RewardsServiceImpl implements RewardsService{

    @Override
    public CustomerRewardsSummery calculateMonthlyReward(CustomerPurchases purchases) {
        CustomerRewardsSummery summery = new CustomerRewardsSummery(
                purchases.getCustomerId(), purchases.getFirstName(), purchases.getLastName());
        int rewardPoints, totalRewardPoints = 0;
        for (Month m : purchases.getMonths()) {
            rewardPoints = getRewards(m.getPurchases());
            totalRewardPoints += rewardPoints;
            summery.getMonthlyRewards().add(Integer.toString(rewardPoints));
        }
        summery.setTotalRewards(Integer.toString(totalRewardPoints));
        return summery;
    }

    private int getRewards(String[] amount) {
        int rewards = 0;
        for (String s: amount) {
            int purchase = (int) Double.parseDouble(s.substring(1));
            if (purchase >= 100)
                rewards += ((purchase - 100) * 2) + 50;
            else if (purchase < 100 && purchase > 50)
                rewards += purchase - 50;
        }
        return rewards;
    }


}

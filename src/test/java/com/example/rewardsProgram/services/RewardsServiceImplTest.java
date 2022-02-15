package com.example.rewardsProgram.services;

import com.example.rewardsProgram.requestObjects.CustomerPurchases;
import com.example.rewardsProgram.requestObjects.Month;
import com.example.rewardsProgram.responceObjects.CustomerRewardsSummery;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class RewardsServiceImplTest {

    @Test
    @DisplayName("This should test that all three months are being computed correctly.  First month should be over $100," +
            " second month should be over $50 but less then $100 and third should be less then $50")
    public void calculateMonthlyReward() {
        RewardsService rewardsService = new RewardsServiceImpl();
        Month month;
        List<Month> purchaseList = new ArrayList<>();
        //                      First, Second, Third
        String[] testValues = {"$120", "$57", "$44"};

        for (String value: testValues) {
            month = new Month();
            String[] singleVal = {value};
            month.setPurchases(singleVal);
            purchaseList.add(month);
        }

        CustomerPurchases customerPurchases = new CustomerPurchases(1,"Bob","Testman",purchaseList);
        CustomerRewardsSummery summery;
        summery = rewardsService.calculateMonthlyReward(customerPurchases);

        Assertions.assertEquals("90", summery.getMonthlyRewards().get(0));
        Assertions.assertEquals("7", summery.getMonthlyRewards().get(1));
        Assertions.assertEquals("0", summery.getMonthlyRewards().get(2));
        Assertions.assertEquals("97", summery.getTotalRewards());

    }
}
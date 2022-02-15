package com.example.rewardsProgram.controller;

import com.example.rewardsProgram.requestObjects.CustomerPurchases;
import com.example.rewardsProgram.responceObjects.CustomerRewardsSummery;
import com.example.rewardsProgram.services.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/rewards")
public class RewardsController {

    private final RewardsService rewardsService;

    @Autowired
    public RewardsController(RewardsService rewardsService) {
        this.rewardsService = rewardsService;
    }

    @PostMapping(path = "/allRewards", consumes = "application/json")
    public @ResponseBody
    List<CustomerRewardsSummery> calculateRewards(@RequestBody List<CustomerPurchases> purchases){
        List<CustomerRewardsSummery> rewards = new ArrayList<>();
        for (CustomerPurchases customerPurchases : purchases) {
            rewards.add(rewardsService.calculateMonthlyReward(customerPurchases));
        }
        return rewards;
    }
}

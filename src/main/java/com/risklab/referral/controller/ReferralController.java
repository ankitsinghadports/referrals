package com.risklab.referral.controller;

import com.risklab.referral.entity.ReferralEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/referrals")
public class ReferralController {
    private Map<Long,ReferralEntity> referralsEntries = new HashMap<>();

    @GetMapping
    public List<ReferralEntity> getAllReferrals(){
        return new ArrayList<>(referralsEntries.values());
    }

    @PostMapping
    public ReferralEntity createReferral(@RequestBody ReferralEntity referralEntity){
        referralsEntries.put(referralEntity.getId(), referralEntity);
        return referralEntity;
    }
}

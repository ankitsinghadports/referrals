package com.risklab.referral.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class TravelerRuleForYas implements Serializable {
    private Double score;
    private String travellerRuleId;
    private String travellerRuleStatement;
    private String travellerRuleRationale;
}

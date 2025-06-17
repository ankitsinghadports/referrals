package com.risklab.referral.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TravelerRuleTypeForYas implements Serializable {
    private String travellerReference;
    private List<TravelerRuleType2ForYas> ruleTypes;
}

package com.risklab.referral.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TravelerRuleType2ForYas implements Serializable {
    private String ruleType;
    private List<TravelerTrsRuleForYas> trsRules;
}

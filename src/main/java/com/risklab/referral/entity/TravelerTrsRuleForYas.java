package com.risklab.referral.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TravelerTrsRuleForYas implements Serializable {
    private String trs ;
    private List<TravelerRuleForYas> rules;
}

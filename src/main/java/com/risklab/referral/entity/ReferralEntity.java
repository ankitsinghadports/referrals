package com.risklab.referral.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ReferralEntity {
    public static final String DEFAULT_VALUE_SYSTEM_ID =  "ADC_RMS";

    private String referralId;
    private String systemId = DEFAULT_VALUE_SYSTEM_ID;
    private Date referenceTimestamp;
    private String ogaRisks;
    private Boolean hasPcaRisks = false;
    private InspectionTypeForYas inspectionType;
    private List<TravelerRuleTypeForYas> travellerRuleTypes;
    private String referralType;
    private String createdDate ;
    private String userId;
    private String userName;
    private Date updatedAt;
}

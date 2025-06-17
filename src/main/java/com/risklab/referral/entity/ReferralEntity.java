package com.risklab.referral.entity;

import java.util.Date;
import java.util.List;

public class ReferralEntity {
    public static final String DEFAULT_VALUE_SYSTEM_ID =  "ADC_RMS";

    private String referralId;
    private String systemId = DEFAULT_VALUE_SYSTEM_ID;
    private Date referenceTimestamp;
    private String ogaRisks;
    private Boolean hasPcaRisks = false;
    private InspectionTypeForYas inspectionType;
    public InspectionTypeForYas getInspectionType() {
        return inspectionType;
    }

    public void setInspectionType(InspectionTypeForYas inspectionType) {
        this.inspectionType = inspectionType;
    }

    private String referralType;
    private String createdDate ;
    private String userId;
    private String userName;
    private Date updatedAt;

    public String getReferralId() {
        return referralId;
    }

    public void setReferralId(String referralId) {
        this.referralId = referralId;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public Date getReferenceTimestamp() {
        return referenceTimestamp;
    }

    public void setReferenceTimestamp(Date referenceTimestamp) {
        this.referenceTimestamp = referenceTimestamp;
    }

    public String getOgaRisks() {
        return ogaRisks;
    }

    public void setOgaRisks(String ogaRisks) {
        this.ogaRisks = ogaRisks;
    }

    public Boolean getHasPcaRisks() {
        return hasPcaRisks;
    }

    public void setHasPcaRisks(Boolean hasPcaRisks) {
        this.hasPcaRisks = hasPcaRisks;
    }

    public String getReferralType() {
        return referralType;
    }

    public void setReferralType(String referralType) {
        this.referralType = referralType;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}

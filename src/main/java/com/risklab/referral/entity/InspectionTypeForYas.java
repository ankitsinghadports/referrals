package com.risklab.referral.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InspectionTypeForYas {
    @JsonProperty("caseTypes")
    @JsonAlias("caseType")
    private List<CaseTypes> caseTypes;
    public List<CaseTypes> getCaseTypes() {
        return caseTypes;
    }

    public void setCaseTypes(List<CaseTypes> caseTypes) {
        this.caseTypes = caseTypes;
    }

    private YASChannel channel;
    private String originalChannel;
    private String caseContext;
    private String referralComment;
    private List<ReferralReasons> referralReasons;
    public List<ReferralReasons> getReferralReasons() {
        return referralReasons;
    }

    public void setReferralReasons(List<ReferralReasons> referralReasons) {
        this.referralReasons = referralReasons;
    }

    public YASChannel getChannel() {
        return channel;
    }

    public void setChannel(YASChannel channel) {
        this.channel = channel;
    }

    public String getOriginalChannel() {
        return originalChannel;
    }

    public void setOriginalChannel(String originalChannel) {
        this.originalChannel = originalChannel;
    }

    public String getCaseContext() {
        return caseContext;
    }

    public void setCaseContext(String caseContext) {
        this.caseContext = caseContext;
    }

    public String getReferralComment() {
        return referralComment;
    }

    public void setReferralComment(String referralComment) {
        this.referralComment = referralComment;
    }

    public enum YASChannel {
        GREEN,
        RED,
        YELLOW
    }
}

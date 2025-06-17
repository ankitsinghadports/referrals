package com.risklab.referral.entity;

import java.util.List;

public class CaseTypes {
    private String type;
    private String typeName;
    private String caseContext;
    private List<RatingPriority> ratingPriority;
    public List<RatingPriority> getRatingPriority() {
        return ratingPriority;
    }

    public void setRatingPriority(List<RatingPriority> ratingPriority) {
        this.ratingPriority = ratingPriority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getCaseContext() {
        return caseContext;
    }

    public void setCaseContext(String caseContext) {
        this.caseContext = caseContext;
    }
}

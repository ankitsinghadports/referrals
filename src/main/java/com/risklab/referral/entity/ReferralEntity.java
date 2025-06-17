package com.risklab.referral.entity;

public class ReferralEntity {
    public long id;

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String title;
    public String content;

    public String getTitle() {
        return title;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

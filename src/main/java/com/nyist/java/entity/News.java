package com.nyist.java.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zhoukaili on 2017/6/13.
 */
@Entity
public class News {
    @Id
    @GeneratedValue
    private Integer Id;
    private String telephone;//发布人标识，电话号码
    private String releseType;
    private String releseTime;
    private String releseTitle;
    private String releseContent;
    private String scanHistory;

    public News() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getReleseType() {
        return releseType;
    }

    public void setReleseType(String releseType) {
        this.releseType = releseType;
    }

    public String getReleseTime() {
        return releseTime;
    }

    public void setReleseTime(String releseTime) {
        this.releseTime = releseTime;
    }

    public String getReleseTitle() {
        return releseTitle;
    }

    public void setReleseTitle(String releseTitle) {
        this.releseTitle = releseTitle;
    }

    public String getReleseContent() {
        return releseContent;
    }

    public void setReleseContent(String releseContent) {
        this.releseContent = releseContent;
    }

    public String getScanHistory() {
        return scanHistory;
    }

    public void setScanHistory(String scanHistory) {
        this.scanHistory = scanHistory;
    }
}

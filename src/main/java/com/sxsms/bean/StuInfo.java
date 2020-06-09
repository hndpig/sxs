package com.sxsms.bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class StuInfo implements Serializable {
    private Integer sId;

    private String sSex;

    private String sName;

    private Integer sAge;

    private String sSchool;

    private String sNumber;

    private String sPhone;

    private Integer sStatus;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date sEntrytime;

    private String sWorkingtime;

    private String sGroup;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    public String getsSchool() {
        return sSchool;
    }

    public void setsSchool(String sSchool) {
        this.sSchool = sSchool;
    }

    public String getsNumber() {
        return sNumber;
    }

    public void setsNumber(String sNumber) {
        this.sNumber = sNumber;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public Integer getsStatus() {
        return sStatus;
    }

    public void setsStatus(Integer sStatus) {
        this.sStatus = sStatus;
    }

    public Date getsEntrytime() {
        return sEntrytime;
    }

    public void setsEntrytime(Date sEntrytime) {
        this.sEntrytime = sEntrytime;
    }

    public String getsWorkingtime() {
        return sWorkingtime;
    }

    public void setsWorkingtime(String sWorkingtime) {
        this.sWorkingtime = sWorkingtime;
    }

    public String getsGroup() {
        return sGroup;
    }

    public void setsGroup(String sGroup) {
        this.sGroup = sGroup;
    }
}
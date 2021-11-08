package com.xkcoding.orm.mybatis.entity;

import java.util.Date;

public class PersonalPhone {
    private Long id;

    private String phoneNumber;

    private String area;

    private Byte szStatus;

    private Integer szVersion;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Byte getSzStatus() {
        return szStatus;
    }

    public void setSzStatus(Byte szStatus) {
        this.szStatus = szStatus;
    }

    public Integer getSzVersion() {
        return szVersion;
    }

    public void setSzVersion(Integer szVersion) {
        this.szVersion = szVersion;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}

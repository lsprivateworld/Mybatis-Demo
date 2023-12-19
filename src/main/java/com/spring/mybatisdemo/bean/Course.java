package com.spring.mybatisdemo.bean;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class Course {
    private String id;
    private String createTime;
    private String createBy;
    private String updateTime;
    private String updateBy;
    private Integer isdeleate;
    private Integer year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getIsdeleate() {
        return isdeleate;
    }

    public void setIsdeleate(Integer isdeleate) {
        this.isdeleate = isdeleate;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}

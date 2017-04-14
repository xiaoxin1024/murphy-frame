package com.scoot.murphy.api.demo.dto;

import java.util.Date;

/**
 * DemoVersion dto
 */
public class DemoVersion {

    private String version;

    private Date createTime;

    private Integer num;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}

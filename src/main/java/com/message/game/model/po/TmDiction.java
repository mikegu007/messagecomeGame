package com.message.game.model.po;

import java.util.Date;

public class TmDiction {
    private Long id;

    private String dictionCode;

    private String dictionType;

    private String dictionName;

    private Integer isDel;

    private Date createDate;

    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDictionCode() {
        return dictionCode;
    }

    public void setDictionCode(String dictionCode) {
        this.dictionCode = dictionCode == null ? null : dictionCode.trim();
    }

    public String getDictionType() {
        return dictionType;
    }

    public void setDictionType(String dictionType) {
        this.dictionType = dictionType == null ? null : dictionType.trim();
    }

    public String getDictionName() {
        return dictionName;
    }

    public void setDictionName(String dictionName) {
        this.dictionName = dictionName == null ? null : dictionName.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
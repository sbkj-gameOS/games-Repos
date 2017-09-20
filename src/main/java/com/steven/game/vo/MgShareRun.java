package com.steven.game.vo;

import java.math.BigDecimal;

public class MgShareRun {
    private Long id;

    private String userName;

    private String userOpenid;

    private BigDecimal shareRunAmount;

    private String sourceAccounts;

    private String gainTime;

    private BigDecimal cashAmount;

    private BigDecimal cashTime;

    private BigDecimal shareRunSurplus;

    private String createTime;

    private String lastUpdateTime;

    private Byte isDel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserOpenid() {
        return userOpenid;
    }

    public void setUserOpenid(String userOpenid) {
        this.userOpenid = userOpenid == null ? null : userOpenid.trim();
    }

    public BigDecimal getShareRunAmount() {
        return shareRunAmount;
    }

    public void setShareRunAmount(BigDecimal shareRunAmount) {
        this.shareRunAmount = shareRunAmount;
    }

    public String getSourceAccounts() {
        return sourceAccounts;
    }

    public void setSourceAccounts(String sourceAccounts) {
        this.sourceAccounts = sourceAccounts == null ? null : sourceAccounts.trim();
    }

    public String getGainTime() {
        return gainTime;
    }

    public void setGainTime(String gainTime) {
        this.gainTime = gainTime == null ? null : gainTime.trim();
    }

    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public BigDecimal getCashTime() {
        return cashTime;
    }

    public void setCashTime(BigDecimal cashTime) {
        this.cashTime = cashTime;
    }

    public BigDecimal getShareRunSurplus() {
        return shareRunSurplus;
    }

    public void setShareRunSurplus(BigDecimal shareRunSurplus) {
        this.shareRunSurplus = shareRunSurplus;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }

    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
}
package com.steven.game.vo;

import java.math.BigDecimal;

public class MgUserRechargeHistory {
    private Long id;

    private String userName;

    private String userOpenid;

    private String chargeTime;

    private Integer roomCardNum;

    private BigDecimal originalPrice;

    private BigDecimal preferAmount;

    private BigDecimal payAmount;

    private BigDecimal dirHomeAmount;

    private BigDecimal indHomeAmount;

    private BigDecimal balance;

    private BigDecimal total;

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

    public String getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(String chargeTime) {
        this.chargeTime = chargeTime == null ? null : chargeTime.trim();
    }

    public Integer getRoomCardNum() {
        return roomCardNum;
    }

    public void setRoomCardNum(Integer roomCardNum) {
        this.roomCardNum = roomCardNum;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getPreferAmount() {
        return preferAmount;
    }

    public void setPreferAmount(BigDecimal preferAmount) {
        this.preferAmount = preferAmount;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getDirHomeAmount() {
        return dirHomeAmount;
    }

    public void setDirHomeAmount(BigDecimal dirHomeAmount) {
        this.dirHomeAmount = dirHomeAmount;
    }

    public BigDecimal getIndHomeAmount() {
        return indHomeAmount;
    }

    public void setIndHomeAmount(BigDecimal indHomeAmount) {
        this.indHomeAmount = indHomeAmount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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
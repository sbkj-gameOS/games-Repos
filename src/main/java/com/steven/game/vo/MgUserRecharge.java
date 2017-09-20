package com.steven.game.vo;

public class MgUserRecharge {
    private Long id;

    private String userOpenid;

    private Integer roomCardNum;

    private Integer balance;

    private Integer total;

    private Integer invitationCode;

    private String createTime;

    private String lastUpdateTime;

    private Byte isDel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserOpenid() {
        return userOpenid;
    }

    public void setUserOpenid(String userOpenid) {
        this.userOpenid = userOpenid == null ? null : userOpenid.trim();
    }

    public Integer getRoomCardNum() {
        return roomCardNum;
    }

    public void setRoomCardNum(Integer roomCardNum) {
        this.roomCardNum = roomCardNum;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(Integer invitationCode) {
        this.invitationCode = invitationCode;
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
package com.steven.game.vo;

public class MgRoomCordUsehistory {
    private Long id;

    private String userName;

    private String userOpenid;

    private String useTime;

    private Integer useRcNum;

    private Integer surplusRcNum;

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

    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime == null ? null : useTime.trim();
    }

    public Integer getUseRcNum() {
        return useRcNum;
    }

    public void setUseRcNum(Integer useRcNum) {
        this.useRcNum = useRcNum;
    }

    public Integer getSurplusRcNum() {
        return surplusRcNum;
    }

    public void setSurplusRcNum(Integer surplusRcNum) {
        this.surplusRcNum = surplusRcNum;
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
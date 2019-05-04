package com.zsq.company0501.po;

public class Contract {
    private Integer companyId;

    private String bankName;

    private String email;

    private String singer;

    private String taxPayerId;

    private String alipayAppId;

    private String alipayAppKey;

    private String wechatpayAppId;

    private String wechatpayAppKey;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer == null ? null : singer.trim();
    }

    public String getTaxPayerId() {
        return taxPayerId;
    }

    public void setTaxPayerId(String taxPayerId) {
        this.taxPayerId = taxPayerId == null ? null : taxPayerId.trim();
    }

    public String getAlipayAppId() {
        return alipayAppId;
    }

    public void setAlipayAppId(String alipayAppId) {
        this.alipayAppId = alipayAppId == null ? null : alipayAppId.trim();
    }

    public String getAlipayAppKey() {
        return alipayAppKey;
    }

    public void setAlipayAppKey(String alipayAppKey) {
        this.alipayAppKey = alipayAppKey == null ? null : alipayAppKey.trim();
    }

    public String getWechatpayAppId() {
        return wechatpayAppId;
    }

    public void setWechatpayAppId(String wechatpayAppId) {
        this.wechatpayAppId = wechatpayAppId == null ? null : wechatpayAppId.trim();
    }

    public String getWechatpayAppKey() {
        return wechatpayAppKey;
    }

    public void setWechatpayAppKey(String wechatpayAppKey) {
        this.wechatpayAppKey = wechatpayAppKey == null ? null : wechatpayAppKey.trim();
    }
}
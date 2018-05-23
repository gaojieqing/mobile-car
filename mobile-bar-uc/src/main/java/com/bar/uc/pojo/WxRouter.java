package com.bar.uc.pojo;

import java.io.Serializable;

public class WxRouter implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2877196930046684135L;

	private Integer id;

    private String openId;

    private String sysCode;

    private String unionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode == null ? null : sysCode.trim();
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }
}
package com.bar.uc.pojo;

import java.io.Serializable;

public class WxUserInfoDto extends WxUserInfo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2122044799388019416L;

	private String openId;

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
}
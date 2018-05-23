package com.bar.uc.service;

import com.bar.framework.common.SystemCode;
import com.bar.uc.pojo.WxUserInfoDto;

public interface WxUserCenterService {

	public void create(SystemCode systemCode, WxUserInfoDto userInfo);
	
}

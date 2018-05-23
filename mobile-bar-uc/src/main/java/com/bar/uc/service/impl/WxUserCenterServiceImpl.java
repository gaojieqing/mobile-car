package com.bar.uc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bar.framework.common.SystemCode;
import com.bar.uc.dao.mapper.WxRouterMapper;
import com.bar.uc.dao.mapper.WxUserInfoMapper;
import com.bar.uc.pojo.WxRouter;
import com.bar.uc.pojo.WxUserInfoDto;
import com.bar.uc.service.WxUserCenterService;

@Service
public class WxUserCenterServiceImpl implements WxUserCenterService {
	
	@Autowired
	WxRouterMapper wxRouterMapper;
	
	@Autowired
	WxUserInfoMapper wxUserInfoMapper;

	@Override
	@Transactional
	public void create(SystemCode systemCode, WxUserInfoDto userInfo) {
		
		WxRouter router = new WxRouter();
		router.setSysCode(systemCode.getCode());
		router.setOpenId(userInfo.getOpenId());
		router.setUnionId(userInfo.getUnionId());
		wxRouterMapper.insert(router);
		
		wxUserInfoMapper.insert(userInfo);
		
	}

}

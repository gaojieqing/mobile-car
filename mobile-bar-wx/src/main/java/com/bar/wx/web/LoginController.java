package com.bar.wx.web;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bar.api.service.WxApiAccessService;
import com.bar.framework.common.AjaxResult;
import com.bar.uc.service.WxUserCenterService;
import com.bar.wx.constants.WxConfigs;

@Controller("/login")
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private WxApiAccessService wxApiAccessService;

	@SuppressWarnings("unused")
	@Autowired
	private WxUserCenterService wxUserCenterService;
	
	@Autowired
	private WxConfigs wxConfigs;
	
	@GetMapping("/token/get")
	@ResponseBody
	public AjaxResult getToken(String code) throws Exception {

		// 获取openId和session_key
		Map<String, Object> data = wxApiAccessService.getOpenIdAndSessionKey(wxConfigs.getAppId(), wxConfigs.getAppSecret(), code);

		logger.info(JSON.toJSONString(data));

		return AjaxResult.success();
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public AjaxResult test(String code) {

		return AjaxResult.success();
	}

}

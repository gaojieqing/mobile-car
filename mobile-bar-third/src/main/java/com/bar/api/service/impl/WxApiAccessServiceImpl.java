package com.bar.api.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.bar.framework.utils.AesCbcUtil;

@Service
public class WxApiAccessServiceImpl {
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> getOpenIdAndSessionKey(String appId, String appSecret, String code) throws Exception {
		RestTemplate restTemplate = new RestTemplate();

		// 接口地址
		String url = String.format("https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code",
				appId, appSecret, code);

		// 获取openid和session_key
		String data = restTemplate.getForObject(url, String.class);

		// 解析openid和session_key
		Map<String, Object> map = JSON.parseObject(data, Map.class);

		return map;
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> decryptUserInfo(String encryptedData, String sessionKey, String iv) throws Exception{
		// 解密用户信息
		String result = null;
		
		result = AesCbcUtil.decrypt(encryptedData, sessionKey, iv, "UTF-8");

		// 将json字符串转化为map对象
		Map<String, Object> map = JSON.toJavaObject(JSON.parseObject(result), Map.class);
		return map;
	}

}

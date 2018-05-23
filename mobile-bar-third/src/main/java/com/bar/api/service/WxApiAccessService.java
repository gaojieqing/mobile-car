package com.bar.api.service;

import java.util.Map;

public interface WxApiAccessService {

	public Map<String, Object> getOpenIdAndSessionKey(String appId, String appSecret, String code) throws Exception;
	
	public Map<String, Object> decryptUserInfo(String encryptedData, String sessionKey, String iv) throws Exception;
	
}

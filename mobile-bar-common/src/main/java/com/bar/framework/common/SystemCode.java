package com.bar.framework.common;

public enum SystemCode implements ICode {

	DEFAULT_SYS("0","空白平台"),
	MINIAPP_SYS("1","小程序"),
	;
	
	private String code;
	
	private String message;
	
	private SystemCode(String code, String message){
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

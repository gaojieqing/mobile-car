package com.bar.framework.common;

/**
 * 基础编码业务编码
 *
 */
public enum BizCode implements ICode {
	
	SUCCESS("100000","操作成功"),
	TOKEN_ERROR("200000","Token失效"),
	SECURITY_ERROR("300000","访问权限不足"),SECURITY_FREQ("300001","访问频次异常"),SECURITY_BLACK("300002","黑名单用户"),
	CLIENT_ERROR("400000","请求参数异常"),
	SERVER_ERROR("500000","系统异常"),
	BUSI_ERROR("999999","业务异常问题"),
	;
	
	private String code;
	private String message;
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
	
	BizCode(String code, String message){
		this.code = code;
		this.message = message;
	}
	
}

package com.bar.framework.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bar.framework.common.AjaxResult;
import com.bar.framework.common.BizException;

/**
 * 全局异常处理
 * 
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@ExceptionHandler(BizException.class)
	@ResponseBody
	public AjaxResult handleBizException(BizException e) {
		logger.error(e.getCode().getMessage(), e);
		return AjaxResult.failed(e.getCode());
	}

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public AjaxResult handleSysException(Exception e) {
		logger.error(e.getMessage(), e);
		return AjaxResult.failed();
	}

}

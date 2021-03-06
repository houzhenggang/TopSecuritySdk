package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wangwang.abstract.initialize response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WangwangAbstractInitializeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8876872462738531519L;

	/** 
	 * 当ret_code=-1时这个变量才有
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 0或-1表示成功或失败
	 */
	@ApiField("ret_code")
	private Long retCode;


	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setRetCode(Long retCode) {
		this.retCode = retCode;
	}
	public Long getRetCode( ) {
		return this.retCode;
	}
	


}

package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wangwang.abstract.deleteword response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WangwangAbstractDeletewordResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8412517589863627428L;

	/** 
	 * 例如单词长度太长等
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 0或-1，表示错误或正确，错误时有错误信息
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

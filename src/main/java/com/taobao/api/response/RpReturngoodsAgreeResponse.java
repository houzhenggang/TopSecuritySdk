package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.rp.returngoods.agree response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class RpReturngoodsAgreeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3883825565389741978L;

	/** 
	 * 操作成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}

package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbWlborderGetResponse;

/**
 * TOP API: taobao.wlb.wlborder.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.14
 */
public class WlbWlborderGetRequest extends BaseTaobaoRequest<WlbWlborderGetResponse> {
	
	

	/** 
	* 物流宝订单编码
	 */
	private String wlbOrderCode;

	public void setWlbOrderCode(String wlbOrderCode) {
		this.wlbOrderCode = wlbOrderCode;
	}

	public String getWlbOrderCode() {
		return this.wlbOrderCode;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wlborder.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("wlb_order_code", this.wlbOrderCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWlborderGetResponse> getResponseClass() {
		return WlbWlborderGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(wlbOrderCode, "wlbOrderCode");
	}
	

}
package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 评价大印象返回的印象词接口
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ImprItemDO extends TaobaoObject {

	private static final long serialVersionUID = 8345611578683569169L;

	/**
	 * 印象标签的id
	 */
	@ApiField("attribute_id")
	private Long attributeId;

	/**
	 * 被买家评价提及到的印象标签次数
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 印象标签情感倾向 1表示正面 -1表示负面 0表示中性
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 印象标签的名称
	 */
	@ApiField("title")
	private String title;


	public Long getAttributeId() {
		return this.attributeId;
	}
	public void setAttributeId(Long attributeId) {
		this.attributeId = attributeId;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}

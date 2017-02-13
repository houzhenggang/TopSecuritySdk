package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * E客服账号操作信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class AccountInfo extends TaobaoObject {

	private static final long serialVersionUID = 1669748498156846384L;

	/**
	 * 账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 操作列表
	 */
	@ApiListField("account_stats")
	@ApiField("account_stat")
	private List<AccountStat> accountStats;

	/**
	 * account_stats列表的长度
	 */
	@ApiField("count")
	private Long count;


	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public List<AccountStat> getAccountStats() {
		return this.accountStats;
	}
	public void setAccountStats(List<AccountStat> accountStats) {
		this.accountStats = accountStats;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

}

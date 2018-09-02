package io.github.dudy.transaction.datarefillcenter.service;

/**
 * 积分service组件
 * @author dudy
 *
 */
public interface CreditService {

	/**
	 * 增加积分
	 * @param userAccountId 用户账号id
	 */
	void increment(Long userAccountId, Double updatedPoint);
	
}

package io.github.dudy.transaction.datarefillcenter.service;

/**
 * 抽奖机会service组件
 * @author dudy
 *
 */
public interface LotteryDrawService {

	/**
	 * 增加一次抽奖次数
	 * @param userAccountId 用户账号id
	 */
	void increment(Long userAccountId);
	
}

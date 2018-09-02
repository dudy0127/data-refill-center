package io.github.dudy.transaction.datarefillcenter.service.impl;

import io.github.dudy.transaction.datarefillcenter.mapper.LotteryDrawMapper;
import io.github.dudy.transaction.datarefillcenter.service.LotteryDrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 抽奖机会service组件
 * @author dudy
 *
 */
@Service
public class LotteryDrawServiceImpl implements LotteryDrawService {

	/**
	 * 抽奖机会mapper组件
	 */
	@Autowired
	private LotteryDrawMapper lotteryDrawMapper;
	
	/**
	 * 增加一次抽奖次数
	 * @param userAccountId 用户账号id
	 */
	public void increment(Long userAccountId) {
		lotteryDrawMapper.increment(userAccountId);  
	}
	
}

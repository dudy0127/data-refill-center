package io.github.dudy.transaction.datarefillcenter.service.impl;

import io.github.dudy.transaction.datarefillcenter.mapper.CreditMapper;
import io.github.dudy.transaction.datarefillcenter.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 积分service组件
 * @author dudy
 *
 */
@Service
public class CreditServiceImpl implements CreditService {

	/**
	 * 积分mapper组件
	 */
	@Autowired
	private CreditMapper creditMapper;
	
	/**
	 * 增加积分
	 * @param userAccountId 用户账号id
	 */
	public void increment(Long userAccountId, Double updatedPoint) {
		creditMapper.increment(userAccountId, updatedPoint); 
	}
	
}

package io.github.dudy.transaction.datarefillcenter.service;

import io.github.dudy.transaction.datarefillcenter.model.RefillOrder;

import java.util.List;


/**
 * 充值订单service组件
 * @author dudy
 *
 */
public interface RefillOrderService {

	/**
	 * 增加一个充值订单
	 * @param refillOrder 充值订单
	 */
	void add(RefillOrder refillOrder);
	
	/**
	 * 查询所有的充值订单
	 * @return
	 */
	List<RefillOrder> queryAll(Long userAccountId);
	
	/**
	 * 查询充值订单
	 * @param id 充值订单id
	 * @return
	 */
	RefillOrder queryById(Long id);
	
}

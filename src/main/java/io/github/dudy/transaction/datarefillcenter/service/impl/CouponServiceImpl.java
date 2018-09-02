package io.github.dudy.transaction.datarefillcenter.service.impl;

import io.github.dudy.transaction.datarefillcenter.mapper.CouponMapper;
import io.github.dudy.transaction.datarefillcenter.model.Coupon;
import io.github.dudy.transaction.datarefillcenter.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 流量券service组件
 * @author dudy
 *
 */
@Service
public class CouponServiceImpl implements CouponService {
	
	/**
	 * 流量券mapper组件
	 */
	@Autowired
	private CouponMapper couponMapper;
	
	/**
	 * 查询用户账号的面额最高的一张流量券
	 * @param userAccountId 用户账号id
	 * @return 流量券
	 */
	public Coupon queryByUserAccountId(Long userAccountId) {
		return couponMapper.queryByUserAccountId(userAccountId);
	}
	
	/**
	 * 将流量券标记为已使用
	 * @param id 流量券id
	 */
	public void markCouponUsed(Long id) {
		couponMapper.updateStatus(id, 2);
	}
	
	/**
	 * 插入一张流量券
	 * @param coupon 流量券
	 */
	public void insert(Coupon coupon) {
		couponMapper.insert(coupon); 
	}

}

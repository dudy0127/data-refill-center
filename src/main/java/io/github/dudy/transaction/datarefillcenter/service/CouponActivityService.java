package io.github.dudy.transaction.datarefillcenter.service;


import io.github.dudy.transaction.datarefillcenter.model.CouponActivity;

/**
 * 流量券活动service组件
 * @author dudy
 *
 */
public interface CouponActivityService {

	/**
	 * 查询流量套餐绑定的状态处于"进行中"的流量券活动
	 * @return 流量券活动
	 */
	CouponActivity queryByDataPackageId(Long dataPackageId);
	
}

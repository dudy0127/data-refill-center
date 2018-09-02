package io.github.dudy.transaction.datarefillcenter.service.impl;

import io.github.dudy.transaction.datarefillcenter.mapper.CouponActivityMapper;
import io.github.dudy.transaction.datarefillcenter.model.CouponActivity;
import io.github.dudy.transaction.datarefillcenter.service.CouponActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 流量券活动service组件
 * @author dudy
 *
 */
@Service
public class CouponActivityServiceImpl implements CouponActivityService {
	
	/**
	 * 流量券活动mapper组件
	 */
	@Autowired
	private CouponActivityMapper couponActivityMapper;
	
	/**
	 * 查询流量套餐绑定的状态处于"进行中"的流量券活动
	 * @return 流量券活动
	 */
	public CouponActivity queryByDataPackageId(Long dataPackageId) {
		return couponActivityMapper.queryByDataPackageId(dataPackageId);
	}

}

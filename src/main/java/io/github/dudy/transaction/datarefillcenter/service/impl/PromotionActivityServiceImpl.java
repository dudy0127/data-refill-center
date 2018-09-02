package io.github.dudy.transaction.datarefillcenter.service.impl;

import io.github.dudy.transaction.datarefillcenter.mapper.PromotionActivityMapper;
import io.github.dudy.transaction.datarefillcenter.model.PromotionActivity;
import io.github.dudy.transaction.datarefillcenter.service.PromotionActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 优惠活动service组件
 * @author dudy
 *
 */
@Service
public class PromotionActivityServiceImpl implements PromotionActivityService {
	
	/**
	 * 优惠活动mapper组件
	 */
	@Autowired
	private PromotionActivityMapper promotionActivityMapper;
	
	/**
	 * 查询流量套餐绑定的状态处于"进行中"的优惠活动
	 * @return 优惠活动
	 */
	public PromotionActivity queryByDataPackageId(Long dataPackageId) {
		return promotionActivityMapper.queryByDataPackageId(dataPackageId);
	}

}

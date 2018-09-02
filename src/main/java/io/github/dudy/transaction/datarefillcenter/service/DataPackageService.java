package io.github.dudy.transaction.datarefillcenter.service;

import java.util.List;

import io.github.dudy.transaction.datarefillcenter.model.DataPackage;

/**
 * 流量套餐service组件
 * @author dudy
 *
 */
public interface DataPackageService {

	/**
	 * 查询所有的流量套餐
	 * @return 流量套餐
	 */
	List<DataPackage> queryAll();
	
}

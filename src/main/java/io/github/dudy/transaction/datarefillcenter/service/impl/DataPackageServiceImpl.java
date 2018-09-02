package io.github.dudy.transaction.datarefillcenter.service.impl;

import java.util.List;

import io.github.dudy.transaction.datarefillcenter.mapper.DataPackageMapper;
import io.github.dudy.transaction.datarefillcenter.model.DataPackage;
import io.github.dudy.transaction.datarefillcenter.service.DataPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 流量套餐service组件
 * @author dudy
 *
 */
@Service
public class DataPackageServiceImpl implements DataPackageService {

	/**
	 * 流量套餐mapper组件
	 */
	@Autowired
	private DataPackageMapper dataPackageMapper;
	
	/**
	 * 查询所有的流量套餐
	 * @return 流量套餐
	 */
	public List<DataPackage> queryAll() {
		return dataPackageMapper.queryAll();
	}
	
}

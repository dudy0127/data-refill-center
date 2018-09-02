package io.github.dudy.transaction.datarefillcenter.mapper;

import java.util.List;

import io.github.dudy.transaction.datarefillcenter.model.DataPackage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;


/**
 * 流量套餐mapper组件
 * @author dudy
 *
 */
@Mapper
public interface DataPackageMapper {

	/**
	 * 查询所有的流量套餐
	 * @return 流量套餐
	 */
	@Select("SELECT * FROM data_package")  
	@Results({
		@Result(column = "created_time", property = "createdTime"),
		@Result(column = "modified_time", property = "modifiedTime")
	})
	List<DataPackage> queryAll();
	
}

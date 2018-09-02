package io.github.dudy.transaction.datarefillcenter.mapper;

import io.github.dudy.transaction.datarefillcenter.model.CouponActivity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;


/**
 * 流量券活动mapper组件
 * @author dudy
 *
 */
@Mapper
public interface CouponActivityMapper {

	/**
	 * 查询流量套餐绑定的状态处于"进行中"的流量券活动
	 * @return 流量券活动
	 */
	@Select("SELECT * "
			+ "FROM coupon_activity "
			+ "WHERE data_package_id=#{dataPackageId} "
			+ "AND status=2")  
	@Results({
		@Result(column = "data_package_id", property = "dataPackageId"),
		@Result(column = "coupon_amount", property = "couponAmount"),
		@Result(column = "start_time", property = "startTime"),
		@Result(column = "end_time", property = "endTime"),
		@Result(column = "created_time", property = "createdTime"),
		@Result(column = "modified_time", property = "modifiedTime")
	})
	CouponActivity queryByDataPackageId(
            @Param("dataPackageId") Long dataPackageId);
	
}

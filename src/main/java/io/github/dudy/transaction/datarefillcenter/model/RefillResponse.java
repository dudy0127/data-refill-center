package io.github.dudy.transaction.datarefillcenter.model;

import lombok.Data;

/**
 * 充值结果
 * @author dudy
 *
 */
@Data
public class RefillResponse {

	/**
	 * 充值结果编号：SUCCESS、FAILURE
	 */
	private String code;
	/**
	 * 充值结果说明
	 */
	private String message;

}








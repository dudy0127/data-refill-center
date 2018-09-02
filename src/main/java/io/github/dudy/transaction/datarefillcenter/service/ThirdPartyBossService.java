package io.github.dudy.transaction.datarefillcenter.service;

/**
 * 访问第三方运营商BOSS系统service组件
 * @author dudy
 *
 */
public interface ThirdPartyBossService {

	/**
	 * 充值流量
	 * @param phoneNumber 手机号
	 * @param data 流量
	 */
	void refillData(String phoneNumber, Long data);   
	
}

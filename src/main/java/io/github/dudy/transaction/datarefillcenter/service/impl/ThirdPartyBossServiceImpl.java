package io.github.dudy.transaction.datarefillcenter.service.impl;

import io.github.dudy.transaction.datarefillcenter.service.ThirdPartyBossService;
import org.springframework.stereotype.Service;


/**
 * 第三方运营商BOSS系统访问service组件
 * @author dudy
 *
 */
@Service
public class ThirdPartyBossServiceImpl implements ThirdPartyBossService {

	/**
	 * 充值流量
	 * @param phoneNumber 手机号
	 * @param data 流量
	 */
	public void refillData(String phoneNumber, Long data) {
		try {
			Thread.sleep(500); 
			System.out.println("已经完成为" + phoneNumber + "充值" + data + "MB流量");      
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
	
}

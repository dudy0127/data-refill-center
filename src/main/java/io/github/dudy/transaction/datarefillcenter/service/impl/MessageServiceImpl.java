package io.github.dudy.transaction.datarefillcenter.service.impl;

import io.github.dudy.transaction.datarefillcenter.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * 消息服务service组件
 * @author dudy
 *
 */
@Service
public class MessageServiceImpl implements MessageService {

	/**
	 * 发送短信
	 * @param phoneNumber 手机号码
	 * @param message 短信消息
	 */
	public void send(String phoneNumber, String message) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("给" + phoneNumber + "发送了一条短信：" + message); 
	}
	
}

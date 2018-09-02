package io.github.dudy.transaction.datarefillcenter.service;

/**
 * 消息服务service组件
 * @author dudy
 *
 */
public interface MessageService {

	/**
	 * 发送短信
	 * @param phoneNumber 手机号码
	 * @param message 短信消息
	 */
	void send(String phoneNumber, String message);
	
}

package ����ģʽ_��ͨFactory;
/**
 * ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ���
 * @author jinhang
 *
 */
public class SendFactory {
	public Sender produce(String type) {  
		if ("mail".equals(type)) {  
			return new MailSender();  
		} else if ("sms".equals(type)) {  
			return new SmsSender();  
		} else {  
			System.out.println("��������ȷ������!");  
			return null;  
		}  
	}  
}

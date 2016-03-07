package 工厂模式_普通Factory;
/**
 * 实现了同一接口的一些类进行实例的创建
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
			System.out.println("请输入正确的类型!");  
			return null;  
		}  
	}  
}

package ����ģʽ_�����������ģʽ;
/**
 * ��̬��������ģʽ��������Ķ����������ģʽ��ķ�����Ϊ��̬�ģ�����Ҫ����ʵ����ֱ�ӵ��ü���
 * @author jinhang
 *
 */
public class SendFactory {
	public static Sender produceMail(){  
		return new MailSender();  
	}  
	public static Sender produceSms(){  
		return new SmsSender();  
	}  
}

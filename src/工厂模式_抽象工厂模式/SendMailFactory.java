package ����ģʽ_���󹤳�ģʽ;

public class SendMailFactory implements Provider{

	@Override
	public Sender produce() {
		return new SmsSender();  
	}
	
}

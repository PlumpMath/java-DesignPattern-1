package ����ģʽ_���󹤳�ģʽ;

public class SendSmsFactory implements Provider{

	@Override
	public Sender produce() {
		return new SmsSender();
	}
	
}

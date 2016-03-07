package 工厂模式_静态工厂方法模式;

public class SmsSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is sms sender!");  
	}

}

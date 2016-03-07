package 建造模式_Builder;

public class SmsSender implements Sender {

	@Override
	public void Send(){
		System.out.println("this is sms sender!");  
	}

}

package 工厂模式_普通Factory;

public class Test {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();  
		Sender sender = factory.produce("sms");  
		sender.Send();  
	}
}

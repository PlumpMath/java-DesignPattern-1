package 工厂模式_多个工厂方法模式;

public class Test {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();  
		Sender sender = SendFactory.produceMail();    
        sender.Send();  
	}
}

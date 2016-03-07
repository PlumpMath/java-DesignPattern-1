package 工厂模式_静态工厂方法模式;

public class Test {
	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();  
		sender.Send();   
	}
}

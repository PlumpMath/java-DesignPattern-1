package ����ģʽ_�����������ģʽ;

public class Test {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();  
		Sender sender = SendFactory.produceMail();    
        sender.Send();  
	}
}

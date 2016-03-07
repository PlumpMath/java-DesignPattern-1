package 工厂模式_普通Factory;

public class MailSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is mailsender!");  
	}

}

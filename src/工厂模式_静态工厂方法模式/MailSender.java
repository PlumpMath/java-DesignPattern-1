package 工厂模式_静态工厂方法模式;

public class MailSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is mailsender!");  
	}

}

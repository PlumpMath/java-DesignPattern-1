package 建造模式_Builder;

public class MailSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is mailsender!");  
	}

}

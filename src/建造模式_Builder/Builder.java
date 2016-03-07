package ����ģʽ_Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ģʽ���ǽ����ֲ�Ʒ�����������й��������������϶���
 * ����ģʽ��ע���Ǵ���������Ʒ����������ģʽ���ע�������϶��󣬶�����֡�
 * @author jinhang
 *
 */
public class Builder {
	private List<Sender> list = new ArrayList<Sender>(); 
	public void produceMailSender(int count){  
		for(int i=0; i<count; i++){  
			list.add(new MailSender());  
		}  
	}  

	public void produceSmsSender(int count){  
		for(int i=0; i<count; i++){  
			list.add(new SmsSender());  
		}  
	}  
}

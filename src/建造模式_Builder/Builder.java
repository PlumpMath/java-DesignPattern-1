package 建造模式_Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 造者模式则是将各种产品集中起来进行管理，用来创建复合对象
 * 工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分。
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

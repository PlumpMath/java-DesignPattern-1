package ��������ģʽ;
/**
 * ��һ��Source�࣬ӵ��һ�������������䣬Ŀ��ӿ�ʱTargetable��ͨ��Adapter�࣬��Source�Ĺ�����չ��Targetable��
 * @author jinhang
 *
 */
public class Adapter extends Source implements Targetable{

	@Override
	public void method2() {
		 System.out.println("this is the targetable method!");  
	}

}

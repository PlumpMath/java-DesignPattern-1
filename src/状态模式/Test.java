package ״̬ģʽ;
/**
 * ״̬ģʽ���ճ��������õ�ͦ��ģ�����������վ��ʱ��������ʱϣ�����ݶ����ĳһ���ԣ��������ǵ�һЩ���ܣ�����˵�򵥵�Ȩ�޿��Ƶȡ�
 * @author jinhang
 *
 */
public class Test {
	public static void main(String[] args) {  

		State state = new State();  
		Context context = new Context(state);  

		//���õ�һ��״̬  
		state.setValue("state1");  
		context.method();  

		//���õڶ���״̬  
		state.setValue("state2");  
		context.method();  
	}  
}

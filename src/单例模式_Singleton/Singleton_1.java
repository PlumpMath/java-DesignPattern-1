package ����ģʽ_Singleton;

public class Singleton_1 {
	/* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */ 
	private static Singleton_1 instance = null;  
	/* ˽�й��췽������ֹ��ʵ���� */  
	private Singleton_1() {  

	}
	/* ��̬���̷���������ʵ�� */  
	/**
	 * JVM��Ϊ�µ�Singletonʵ������ռ䣬Ȼ��ֱ�Ӹ�ֵ��instance��Ա��Ȼ����ȥ��ʼ�����Singletonʵ���������Ϳ��ܳ�����
	 * ���̻߳����µĳ�������Ѷȣ�����ս
	 * @return
	 */
	public static Singleton_1 getInstance() {  
		synchronized (instance) {  
			if (instance == null) {  
				instance = new Singleton_1();  
			}  
		}  
		return instance;  
	}
	/* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
	public Object readResolve() {  
		return instance;  
	}  
}

package ����ģʽ_Singleton;
/**
 * ���캯�����׳��쳣��ʵ������Զ�ò�������
 * @author jinhang
 *
 */
public class Singleton_perfect {
	 private static Singleton instance;
    
	/* ˽�й��췽������ֹ��ʵ���� */  
    private Singleton_perfect() {  
    }  
  
    /* �˴�ʹ��һ���ڲ�����ά������ */  
    private static class SingletonFactory {  
        private static Singleton_perfect instance = new Singleton_perfect();  
    }  
  
    /* ��ȡʵ�� */  
    public static Singleton getInstance() {  
        return Singleton_perfect.instance;  
    }  
  
    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
    public Object readResolve() {  
        return getInstance();  
    }  
}

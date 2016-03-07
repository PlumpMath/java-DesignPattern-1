package 单例模式_Singleton;
/**
 * 构造函数中抛出异常，实例将永远得不到创建
 * @author jinhang
 *
 */
public class Singleton_perfect {
	 private static Singleton instance;
    
	/* 私有构造方法，防止被实例化 */  
    private Singleton_perfect() {  
    }  
  
    /* 此处使用一个内部类来维护单例 */  
    private static class SingletonFactory {  
        private static Singleton_perfect instance = new Singleton_perfect();  
    }  
  
    /* 获取实例 */  
    public static Singleton getInstance() {  
        return Singleton_perfect.instance;  
    }  
  
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return getInstance();  
    }  
}

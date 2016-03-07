package 单例模式_Singleton;

public class Singleton_1 {
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */ 
	private static Singleton_1 instance = null;  
	/* 私有构造方法，防止被实例化 */  
	private Singleton_1() {  

	}
	/* 静态工程方法，创建实例 */  
	/**
	 * JVM会为新的Singleton实例分配空间，然后直接赋值给instance成员，然后再去初始化这个Singleton实例。这样就可能出错了
	 * 多线程环境下的程序更有难度，有挑战
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
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object readResolve() {  
		return instance;  
	}  
}

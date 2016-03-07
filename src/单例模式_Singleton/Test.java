package µ¥ÀýÄ£Ê½_Singleton;

import java.util.Vector;

public class Test {
	private static Test instance = null;  
	private Vector properties = null;  

	public Vector getProperties() {  
		return properties;  
	}  

	private Test() {  
	}  

	private static synchronized void syncInit() {  
		if (instance == null) {  
			instance = new Test();  
		}  
	}  

	public static Test getInstance() {  
		if (instance == null) {  
			syncInit();  
		}  
		return instance;  
	}  

	public void updateProperties() {  
		Test shadow = new Test();  
		properties = shadow.getProperties();  
	}  
}

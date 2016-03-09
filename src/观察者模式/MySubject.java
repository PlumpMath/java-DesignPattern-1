package 观察者模式;

import javax.security.auth.Subject;

public class MySubject extends AbstractSubject  {

	@Override
	public void operation() {
		System.out.println("update self!");  
		notifyObservers(); 
	}

}

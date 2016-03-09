package ²ßÂÔÄ£Ê½;

public abstract class Minus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp,"-");  
		return arrayInt[0]-arrayInt[1];  
	}

}

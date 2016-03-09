package ²ßÂÔÄ£Ê½;

public class StrategyTest {
	public static void main(String[] args) {
		ICalculator cal = new Plus();
		int result = cal.calculate("2+8");
		System.out.println(result);
	}
}

package ����ģʽ;
/**
 * ����ģʽ��Ŀ�ľ��Ǵﵽ����ķ����ߺ�ִ����֮����ʵ�������ִ�зֿ�.
 * Struts��ʵ����һ�ֽ�����ͳ��ַ���ļ��������б�Ȼ�漰����ģʽ��˼�룡
 * @author hp
 *
 */
public class Test {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command cmd = new MyCommand(receiver);
		Invoker invoker = new Invoker(cmd);
		invoker.action();
	}
}

package Prototype;
/**
 * Ŀ�ģ�ԭ��ģʽ��Ȼ�Ǵ����͵�ģʽ�������빤��ģʽû�й�ϵ�������ּ��ɿ�������ģʽ��˼����ǽ�һ��������Ϊԭ�ͣ�������и��ơ���¡������һ����ԭ�������Ƶ��¶���
 * 	        ��Java�У����ƶ�����ͨ��clone()ʵ��
 * @author jinhang
 * 
 */
public class Prototype implements Cloneable{
	public Object clone() throws CloneNotSupportedException {  
		/**
		 * ǳ���ƣ���һ�������ƺ󣬻����������͵ı����������´��������������ͣ�ָ��Ļ���ԭ������ָ��ġ�
		 * ��ƣ���һ�������ƺ󣬲����ǻ����������ͻ����������ͣ��������´�����,������ƽ�������ȫ���׵ĸ��ƣ���ǳ���Ʋ����ס�
		 */
		Prototype proto = (Prototype) super.clone();  
		return proto;  
	}  
}

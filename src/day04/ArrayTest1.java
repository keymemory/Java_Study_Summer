package day04;

import static java.lang.System.out;

public class ArrayTest1 {

	public static void main(String[] args) {
		out.println("1----------");
		//1.�迭 ����
		int arr[]; // = int [] arr;
		//2.�޸� �Ҵ�
		arr = new int[3];
		//3.�ʱ�ȭ
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//arr[3]=40;
		out.println("arr[0]="+arr[0]);
		out.println("arr[1]="+arr[1]);
		out.println("arr[2]="+arr[2]);
		out.println("�迭 arr�� ũ���: "+arr.length);
		
		for(int i=0; i<arr.length; i++) {
			out.println("arr["+i+"] = "+arr[i]);
		}
		out.println("�迭 arr�� ũ���: "+arr.length);
		
		out.println("2----------");
		//1.2. ����� ���ÿ� �޸� �Ҵ�
		double b[] = new double[4];
		out.println("b[0]="+b[0]);
		out.println("b[3]="+b[3]);
		/*
		 * b-----> [0,0] [0,0] [0,0] [0,0] 0123 �� �迭�� ���
		 * �ʱ�ȭ���� �ʾ��� ��� ����Ʈ ���� ����
		 */
		b[0]=0x11;
		out.println("b[0]="+b[0]);
		boolean c[] = new boolean[1]; // boolean�� ����Ʈ ���� false
		out.println("c[0]="+c[0]);
		
		//������ �迭
		String str[] = new String[2]; // String�� ����Ʈ ���� NULL
		out.println("str[0]="+str[0]);
		out.println("str[1]="+str[1]);
		str[0] = "ȫ�浿"; //�ʱ�ȭ
		str[1] = new String("�Ӳ���");
		out.println("str[0]="+str[0]);
		out.println("str[1]="+str[1]);
		
		//����� ���ÿ� �޸� �Ҵ�, �ʱ�ȭ
		char[] ch = {'J', 'a', 'v', 'a'};
		for(int i=0; i<ch.length; i++) {
			out.print(ch[i]);
		}
		out.println();
		out.println("3----------");
		int d[] = { 1,2,3,4 };
		for(int i=0; i<d.length; i++) {
			out.print(d[i]+" ");
		}
		out.println("\n�迭 d�� ���ο� �޸� �Ҵ�");
		d = new int[2];
		d[0]=100;
		d[1]=200;
		for(int i=0; i<d.length;i++) {
			out.print(d[i]+" ");
		}
	}

}

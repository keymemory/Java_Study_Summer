package day04;

import static java.lang.System.out;

public class ArrayTest1 {

	public static void main(String[] args) {
		out.println("1----------");
		//1.배열 선언
		int arr[]; // = int [] arr;
		//2.메모리 할당
		arr = new int[3];
		//3.초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//arr[3]=40;
		out.println("arr[0]="+arr[0]);
		out.println("arr[1]="+arr[1]);
		out.println("arr[2]="+arr[2]);
		out.println("배열 arr의 크기는: "+arr.length);
		
		for(int i=0; i<arr.length; i++) {
			out.println("arr["+i+"] = "+arr[i]);
		}
		out.println("배열 arr의 크기는: "+arr.length);
		
		out.println("2----------");
		//1.2. 선언과 동시에 메모리 할당
		double b[] = new double[4];
		out.println("b[0]="+b[0]);
		out.println("b[3]="+b[3]);
		/*
		 * b-----> [0,0] [0,0] [0,0] [0,0] 0123 의 배열의 경우
		 * 초기화하지 않았을 경우 디폴트 값이 들어간다
		 */
		b[0]=0x11;
		out.println("b[0]="+b[0]);
		boolean c[] = new boolean[1]; // boolean의 디폴트 값은 false
		out.println("c[0]="+c[0]);
		
		//참조형 배열
		String str[] = new String[2]; // String의 디폴트 값은 NULL
		out.println("str[0]="+str[0]);
		out.println("str[1]="+str[1]);
		str[0] = "홍길동"; //초기화
		str[1] = new String("임꺽정");
		out.println("str[0]="+str[0]);
		out.println("str[1]="+str[1]);
		
		//선언과 동시에 메모리 할당, 초기화
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
		out.println("\n배열 d에 새로운 메모리 할당");
		d = new int[2];
		d[0]=100;
		d[1]=200;
		for(int i=0; i<d.length;i++) {
			out.print(d[i]+" ");
		}
	}

}

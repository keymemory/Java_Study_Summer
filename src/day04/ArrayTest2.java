package day04;

import static java.lang.System.out;

public class ArrayTest2 {

	public static void main(String[] args) {
		System.out.println("1.-------------");
		int a[] = new int[3];
		a[0]=90;
		a[1]=80;
		a[2]=30;
		int[] b;
		b=a;
		/*
		 * 기존 배열 a로 b를 초기화 해줌, 이 떄 새로운 메모리를 할당받아 생성되는 것이 아니라
		 * a가 참조하는 배열을 b도 참조하는 형태
		 * a나 b의 배열 요소를 변경 할 시, a,b 모두 함께 변경
		 */
		for(int i=0; i<a.length; i++) {
			out.print(a[i]+" ");
		}
		
		System.out.println();
		for(int i=0; i<b.length; i++) {
			out.print(b[i]+" ");
		}
		
	}

}

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
		 * ���� �迭 a�� b�� �ʱ�ȭ ����, �� �� ���ο� �޸𸮸� �Ҵ�޾� �����Ǵ� ���� �ƴ϶�
		 * a�� �����ϴ� �迭�� b�� �����ϴ� ����
		 * a�� b�� �迭 ��Ҹ� ���� �� ��, a,b ��� �Բ� ����
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

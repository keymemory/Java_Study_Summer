package day04;

public class ArrayTest3 {

	public static void main(String[] args) {
		int a[][]; // = int []a[], int [][]a;
		a = new int[2][3]; // 2�� 3��
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		System.out.println("a[0][0]= "+a[0][0]);
		for(int i=0; i<a.length; i++) { //a.length: ���� ũ��
			for(int k=0; k<a[i].length; k++) { //a[i].length: ���� ũ��
				System.out.println(a[i][k]+ "");
			}
			System.out.println();
		}
		
		float b[][] = {{0.1F,10}, {011}, {10, 'A', 20}};
		for(int i=0; i<b.length; i++) {
			for(int k=0; k<b[i].length;k++) {
				System.out.println(b[i][k] +"");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		///����1] String �����͸� �����ϴ� ������ �迭 ����, ��� �� ũ�� ����X
		//"Hello", "Network", "Programming", "Good!"
		//���ڿ����� ������ ��, for ������ �̿��� ���
		String str[][] = { {"Hello"}, {"Network", new String("Programming")}, {"Good!"}};
		for(int i=0; i<str.length;i++) {
			for(int k=0; k<str[i].length; k++) {
				System.out.println(str[i][k]);
			}
			System.out.println();
		}
		
	}
}

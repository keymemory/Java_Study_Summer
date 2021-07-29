package day04;

public class ArrayTest3 {

	public static void main(String[] args) {
		int a[][]; // = int []a[], int [][]a;
		a = new int[2][3]; // 2행 3열
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		System.out.println("a[0][0]= "+a[0][0]);
		for(int i=0; i<a.length; i++) { //a.length: 행의 크기
			for(int k=0; k<a[i].length; k++) { //a[i].length: 열의 크기
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
		///문제1] String 데이터를 저장하는 이차원 배열 선언, 행과 열 크기 제한X
		//"Hello", "Network", "Programming", "Good!"
		//문자열들을 저장한 뒤, for 루프를 이용해 출력
		String str[][] = { {"Hello"}, {"Network", new String("Programming")}, {"Good!"}};
		for(int i=0; i<str.length;i++) {
			for(int k=0; k<str[i].length; k++) {
				System.out.println(str[i][k]);
			}
			System.out.println();
		}
		
	}
}

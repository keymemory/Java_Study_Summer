package day03;

public class Fortest1 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		
		/*
		 * for(초기화; 조건식; 증감식){
		 * 반복 실행될 문자
		 * }
		 */
		
		for(int i=1; i<=10; i++) {
			System.out.println("Hello World! : " +i);
		}//for-----
		System.out.println("-----The End-----");
		
		int j=10;
		for(;j>7;j--) {
			System.out.println(j+": Java");
		}//for-----
		
		System.out.println("-----"+j+"-----");
		
		for(int i=10;i<=100;i+=10) {
			System.out.println(i);
		}
		
		/*for(;;){//무한 반복문
			System.out.println("무한 반복");
			}
*/
		
	}
}

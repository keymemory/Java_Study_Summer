package day03;

public class Fortest1 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		
		/*
		 * for(�ʱ�ȭ; ���ǽ�; ������){
		 * �ݺ� ����� ����
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
		
		/*for(;;){//���� �ݺ���
			System.out.println("���� �ݺ�");
			}
*/
		
	}
}

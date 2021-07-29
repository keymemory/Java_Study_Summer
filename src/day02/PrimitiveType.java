package day02;

public class PrimitiveType {
	
	public PrimitiveType(){
		System.out.println("1.정수형-----");
		byte bt=10;//-128~127
		byte bt2=127;
		System.out.println("bt:" +bt);
		System.out.println("bt2:" +bt2);
		
		short st=1000;
		System.out.println("st:" +st);
		
		int it=30;//정수형의 디폴트
		
		long in=40;
		long in2=40L;	//L,I 이라는 접미사를 붙여준다
		System.out.println("it:" +it);
		System.out.println("in:" +in);
		System.out.println("in2:" +in2);
		
		int i=1000000000;// 0이 9개, int형의 최대 범위
		long j=10000000000L;//0이 10개
		System.out.println("i:" +i);
		System.out.println("j:" +j);
		
		int a = 010;//8진수, 0~7 앞에 0을 붙인다
		System.out.println("a:" +a);
		int b = 0341;
		System.out.println("b:" +b);
		
		long c=0x11; //16진수
		System.out.println("c");
		long d=0x2AC;
		System.out.println("d");
	}
	
	public static void main(String[] args) {
		PrimitiveType p = new PrimitiveType();
	}

}

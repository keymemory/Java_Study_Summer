package day01;

public class MyDemo {
	
	//1. 클래스 변수 a 선언 : 단, 정수형의 자료타입
	//2. 멤버 변수 b 선언
	//3. 생정자 정의
	//4. 멤버 메소드 demo() 정의: "mydemo" 문자열을 출력하는 메소드
	//5. static 메소드 my() 정의 : "my"문자열 출력하는 메소드
	
	static int a; //1
	int b; //2
	
	public MyDemo(){ //3
		a=10;
		b=20;
	}
	
	public void demo(){ //4
		
		System.out.println("mydemo");
	}
	
	public static void my(){ //5
		
		System.out.println("my");
	}
	
	public static void main(String[] args) {

		MyDemo my = new MyDemo();
		//2. 멤버 메소드 호출 - static 이 붙여지지 않은 것
		// 객체명 또는 참조변수명.메소드이름()
		my.demo();
		//3. static 메소드 호출
		// 클래스이름.메소드이름()
		MyDemo.my();
		
		MyDemo.a=30;
		my.b=40;
		System.out.println("a:" + MyDemo.a);
		System.out.println("b:" + my.b);
	}

}

package day02;
/*
 * 변수(variable, field, property, parameter)
 * 1> 클래스 변수 : static 변수
 * 2> 멤버 변수 : instance 변수
 * 3> 지역 변수 : local 변수, automatic 변수, 메소드 블럭 안 또느 인스턴스 블럭안에서 선언된 변수
 */

/* - 한 packaga에 두개의 class
 * 한 페이지에서 여러 클래스를 구성할 경우
 * public 속성은 한 클래스만 가져야 한다
 * 주로 main()메소드를 가지는 클래스가 public 속성을 가지며, 저장할 때 파일명을 주어야 한다.
 * 이때 컴파일을 하면 관련된 클래스 파일이 모두 생김
 */

class Demo{
	
}

public class VarTest2 {

	int a=10; // 멤버 변수, 인스턴스 변수
	static int b=20; // 크래스 변수, static 변수

	public VarTest2(){ // 생성자 - 반환 타입 명시X , 생성자 앞에 void 붙이지X
		int c=30; // 지역 변수, 로컬 변수 - 초기화 시키기
		System.out.println("VarTest() 생성자");
		System.out.println("지역변수 c: " +c);
	}

public static void main(String[] args){
	//1. 클래스 변수 b값 출력
	//클래스명. 변수
	System.out.println("클래스 변수 b: " +VarTest2.b);
	//2.멤버 변수 a값 출력
	//객체 생성 후, 객체명.변수
	VarTest2 v = new VarTest2();
	System.out.println("멤버 변수 a: " +v.a);
	//3.지역 변수 c값 출력
	//System.out.println("지역변수 c: " +v.c);
	//지역 변수는 선언된 블럭 안에서만 사용가능
	int c=300; // c는 지역 변수, 초기화 필요
	System.out.println("지역변수 c: " +c);

	}
}

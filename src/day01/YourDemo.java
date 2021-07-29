package day01;

public class YourDemo {

	//1. main() 메소드를 작성
	//2. 생성자를 구성
	//3. main() 메소드 안에서 생성자를 호출
	//4. 클래스 메소드(static 메소드)를 구성하고 이를 main()안에서 호출
	//5. 멤버 메소드를 하나 구성. 단 매개변수를 받아들여서 이를 main() 메소드 안에서 호출
	
	public YourDemo(){ //2
		
		System.out.println("생성자");
	}
	
	
	public static void first(){ //4
		
		System.out.println("클래스 static 문자열");	
	}
	
	public void second(){
		
		System.out.println("멤버 메소드 문자열");
	}
	
	public void third(String s1, String s2){ //5
		System.out.println("-------------------");
		System.out.println(s1);
		System.out.println("-------------------");
		System.out.println(s2);
	}
	
	public static void main(String[] args){ //1, 3
		System.out.println("-----메인시작-----");
		
		//데이터 타입 변수명 = new 생성자()
		YourDemo your = new YourDemo();
		
		//클래스 메소드 호출 시 클래스명.메소드명();
		YourDemo.first();
		your.second();
		
		
		//멤버 메소드 호출시
		//1) 먼저 객체를 생성하고 (생성자를 호출해주고)
		//그 객체를 참조하고 있는 변수명.메소드명() 의 방식으로 호출
		//즉, 객체명.메소드명()
		
		System.out.println("-----메인시작2-----");
		YourDemo your2 = new YourDemo();
		your2.third("네트워크", "프로그래밍");
	}
	
	
	
}

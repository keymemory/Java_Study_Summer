package day06;

public class OverLoadingTest2 {

	public static void main(String[] args) {
		
		CoffeeMachine cm = new CoffeeMachine();
		// 1. 밀크커피
		cm.getTea(2, 2, 2);
		// 2. 블랙 커피
		cm.getTea(3);
		// 3. 설탕커피
		cm.getTea(2, 3);
		System.out.println(cm.getTea(2, 3));
	}

}



class CoffeeMachine{
	
	int coffee;
	int cream;
	int sugar;
	
	// 생성자
	public CoffeeMachine() { // 기본 생성자
		
	}
	
	// 인자 생성자 ( 인자 3개 )
	public CoffeeMachine(int c, int cr, int su) {
		coffee=c;
		cream=cr;
		sugar=su;
	}
	
	// 커피 만드는 getTea() 메소드 오버로딩 하기
	
	public void getTea(int c, int cr, int su) { // 1. 밀크 티(커피) 만들기
		System.out.println("--밀크커피 정보--");
		System.out.println("커피: " + c);
		System.out.println("크림: " + cr);
		System.out.println("설탕: " + su);
	}
	
	// 블랙 티(커피) 만들기
	public void getTea(int c) { // 2. 블랙 티(커피) 만들기
		System.out.println("--블랙커피 정보--");
		System.out.println("커피: " + c);
	}
	
	// 3. 설탕 커피 농도 출력하는 메소드
	public int getTea(int c, int su) {
		System.out.println("--설탕커피 정보--");
		System.out.println("커피: " + c);
		System.out.println("설탕: " + su);
		
		return (c+su);
	}
}//----------------------------



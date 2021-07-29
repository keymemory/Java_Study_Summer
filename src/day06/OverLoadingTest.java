package day06;

public class OverLoadingTest {

	public static void main(String[] args) {
		
		Superman superman = new Superman("슈퍼맨123", 195, 130);
		Superman superman2 = new Superman("슈퍼맨123", 180);
		superman.showInfo();
		superman2.showInfo();
		
		System.out.println();
		Aquaman aquaman = new Aquaman("아쿠아맨123", 182, 125);
		Aquaman aquaman2 = new Aquaman(188, 127);
		aquaman.showInfo();
		aquaman2.showInfo();
	}

}



class Superman{
	
	String name;
	int height;
	int power;
	
	// 생성자 메소드
	public Superman() { // 기본 생성자
		// 멤버 변수 초기화
		/*name="슈퍼맨";
		height=190;
		power=100;*/
	}
	
	// 생성자 오버로딩
	// 인자 3개 생성자
	public Superman(String name, int height, int power) {
		this.name=name;
		this.height=height;
		this.power=power;
	}
	
	// 인자 2개 생성자 오버로딩
	public Superman(String name, int height) {
		/* this.name=name;
		this.height=height;
		power=20; */
		// 자기 자신의 생성자를 호출할 때 사용한다.
		this(name, height, 20);
	}
	
	// 인자 2개 생성자 오버로딩
	public Superman(int h, int p) {
		/* name="슈퍼맨2";
		height=h;
		power=p; */
		this("슈퍼맨2", h, p); // 자기 자신의 생성자 호출시 사용
	}
	
	// 멤버 메소드 - 위 속성 모두 출력하는 showInfo()
	public void showInfo() {
		System.out.println("--슈퍼맨 정보--");
		System.out.println("이름: " + name);
		System.out.println("키: " + height);
		System.out.println("초능력: " + power);
	}
}//----------------------------


class Aquaman{
	String name;
	int height;
	int speed;
	
	public Aquaman() {
		name="아쿠아맨";
		height=200;
		speed=150;
	}
	
	// 생성자 오버로딩
	
	public Aquaman(String n, int h, int s) {
		name = n;
		height = h;
		speed = s;
	}
	
	public Aquaman(String n, int h) {
		this(n, h, 100);
	}
	
	public Aquaman(int h, int s) {
		this("아쿠아맨2", h, s);
	}
	
	public void showInfo() {
		System.out.println("--아쿠아맨 정보--");
		System.out.println("이름: " + name);
		System.out.println("키: " + height);
		System.out.println("스피드: " + speed);
	}
}//--------------------------------
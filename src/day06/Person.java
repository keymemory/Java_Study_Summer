package day06;

// 추상 클래스
// 1개 이상의 추상 메소드를 갖는 클래스
// 강제성을 표현하기 위해

public abstract class Person {
	String name;
	String id;
	String cName;
	
	// 생성자 오버로딩
	public Person() {
		super();
	}
	
	public Person(String name, String id, String cName) {
		this.name=name;
		this.id=id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	// 추상 메소드 정의
	public abstract void inputInfo(); // 현재 사람의 정보를 입력받는 메소드
	public abstract String getInfo(); // 현재 사람의 정보를 출력하는 메소드
	
	// 현재 객체의 정보를 출력하는 메소드
	public void printAll() {
		System.out.println(this.getInfo());
	}

	public void setAddr(String cName) {
		this.cName = cName;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}

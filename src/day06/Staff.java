package day06;

import java.util.Scanner;

public class Staff extends Person{

	private String id;
	private String dept;
	
	@Override
	public void inputInfo() {
		// 이름, 번호. 학급을 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요 =>");
		name = scan.next();
		System.out.println("부서을 입력하세요 =>");
		cName = scan.next();
		System.out.println("사번을 입력하세요 =>");
		id = scan.next();
	}

	@Override
	public String getInfo() {
		String result = "이름: " + name + 
		"\n 부서: " + cName + 
		"\n 사번: " + id;
		return result;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getName() {
		return dept;
	}


}

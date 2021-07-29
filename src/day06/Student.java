package day06;

import java.util.Scanner;

public class Student extends Person{

	private String id;
	private String classname;
	
	@Override
	public void inputInfo() {
		// 이름, 번호. 학급을 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요 =>");
		name = scan.next();
		System.out.println("학급을 입력하세요 =>");
		cName = scan.next();
		System.out.println("학번을 입력하세요 =>");
		id = scan.next();
	}

	@Override
	public String getInfo() {
		String result = "이름: " + name +
		"\n 학급: " + cName +
		"\n 학번: " + id;
		return result;
	}
	
	public void setClassName(String classname) {
		this.classname = classname;
	}
	
	public String getName() {
		return classname;
	}

}

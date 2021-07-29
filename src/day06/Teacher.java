package day06;

import java.util.Scanner;

public class Teacher extends Person{

	private String id;
	private String subject;
	
	@Override
	public void inputInfo() {
		// 이름, 번호. 학급을 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요 =>");
		name = scan.next();
		System.out.println("과목을 입력하세요 =>");
		cName = scan.next();
		System.out.println("교번을 입력하세요 =>");
		id = scan.next();
	}

	@Override
	public String getInfo() {
		String result = "이름: " + name + 
		"\n 과목: " + cName + 
		"\n 교번: " + id;
		return result;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getName() {
		return subject;
	}


}

package day06;

import java.util.Scanner;

public class Teacher extends Person{

	private String id;
	private String subject;
	
	@Override
	public void inputInfo() {
		// �̸�, ��ȣ. �б��� �Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ��� =>");
		name = scan.next();
		System.out.println("������ �Է��ϼ��� =>");
		cName = scan.next();
		System.out.println("������ �Է��ϼ��� =>");
		id = scan.next();
	}

	@Override
	public String getInfo() {
		String result = "�̸�: " + name + 
		"\n ����: " + cName + 
		"\n ����: " + id;
		return result;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getName() {
		return subject;
	}


}

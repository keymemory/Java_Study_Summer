package day06;

import java.util.Scanner;

public class Student extends Person{

	private String id;
	private String classname;
	
	@Override
	public void inputInfo() {
		// �̸�, ��ȣ. �б��� �Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ��� =>");
		name = scan.next();
		System.out.println("�б��� �Է��ϼ��� =>");
		cName = scan.next();
		System.out.println("�й��� �Է��ϼ��� =>");
		id = scan.next();
	}

	@Override
	public String getInfo() {
		String result = "�̸�: " + name +
		"\n �б�: " + cName +
		"\n �й�: " + id;
		return result;
	}
	
	public void setClassName(String classname) {
		this.classname = classname;
	}
	
	public String getName() {
		return classname;
	}

}

package day06;

import java.util.Scanner;

public class Staff extends Person{

	private String id;
	private String dept;
	
	@Override
	public void inputInfo() {
		// �̸�, ��ȣ. �б��� �Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ��� =>");
		name = scan.next();
		System.out.println("�μ��� �Է��ϼ��� =>");
		cName = scan.next();
		System.out.println("����� �Է��ϼ��� =>");
		id = scan.next();
	}

	@Override
	public String getInfo() {
		String result = "�̸�: " + name + 
		"\n �μ�: " + cName + 
		"\n ���: " + id;
		return result;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getName() {
		return dept;
	}


}

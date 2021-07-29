package day05;

import java.util.Scanner;

public class JobApp {
	//���� ��� ���α׷�
	public void showMenu() {
		System.out.println("-----JOB v1.0-----");
		System.out.println("** 1. ���� ��� **");
		System.out.println("** 2. ���� ��� **");
		System.out.println("** 3. ������ ���� **");
		System.out.println("** 4. ���� **");
		System.out.println("�޴� ��ȣ�� �Է��ϼ��� =>");
	}//showMenu()------
	
	public static void inputPerson() { //1.������� �޴� �����ϴ� �޼ҵ�
		//������ ���ϴ� ����� ���������� �Է¹޴� �޼ҵ�
		//�̸�, ����, ����, ��ȭ��ȣ�� �Է¹޾� Person ��ü�� ����
		Scanner scan = new Scanner(System.in);
		Person person = new Person();
		System.out.println("�̸��� �Է��ϼ��� =>");
		person.name = scan.next();
		System.out.println("���̸� �Է��ϼ��� =>");
		person.age = scan.nextInt();
		System.out.println("������ �Է��ϼ��� =>");
		System.out.println("1.���� 2.����");
		int s = scan.nextInt();
		if(s==1) {
			person.sex = 'M';
		}
		else {
			person.sex = 'F';
		}
		System.out.println("��ȭ��ȣ�� �Է��ϼ��� =>");
		person.tel = scan.next();
		String info = person.showProfile();
		System.out.println(info);
	}//inputPreson()-------

	public static void main(String[] args) {
		JobApp joa = new JobApp();
		Scanner scn = new Scanner(System.in);
		while(true) {
			joa.showMenu();
		int num = scn.nextInt();
		if(num==4){
			System.exit(0); //���α׷� ���� - ��������(0)
		}
		else if(num==1) { //1.���� ��� �޴� ����(������ ���ϴ� ����� �������� �Է¹޴� �޼ҵ� ȣ��)
			joa.inputPerson();
		}
		else {
			
		}
		
		}//while()-----
	}

}



class Person{
	//�߻�ȭ
	//�Ӽ�, �޼ҵ� ���� -> has a ���� �����ϱ�
	String name;
	int age;
	String tel;
	char sex;
	
	//��� ����� ������ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	public String showProfile() {
		String result = null;
		result = "-----" + name + "������-----";
		result+="\n����: " +age;
		result+="\n����: " +sex;
		result+="\n��ȭ: " +tel;
		return result;
	}
	
	//��� ������ ��� ������ ����ϴ� �޼ҵ� �ۼ�
	public void wantJob(String job, int pay) {
		System.out.println("-----" + name + "��");
		System.out.println("--��� ����--" + job);
		System.out.println("--��� ����--" + pay);
	}
	
}
package day06;
import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InstApp {

	final static int PMAX=30; // �������
	private Person person[] = new Person[PMAX]; // 30�� ����
	private int count; // �迭�� �ε����μ� ���� ����
	
	public Person[] getPerson() {
		return person;
	}
	
	public int getCount() {
		return count;
	}
	
	// ���� �޴��� �����ִ� �޼ҵ�
	public static void mainMenu() {
		out.println("-----------Main Menu-----------");
		out.println("1.���  2.�˻�  3.����  4.��� 5.����");
		out.println("-------------------------------");
		out.println("��ȣ�� �Է��ϼ��� =>");
		out.println("-------------------------------");
	}//mainMenu()-----------------
	
	// �� �޴��� �����ִ� �޼ҵ�
	public static void subMenu() {
		out.println("-----------Sub Menu-----------");
		out.println("1.�л�  2.����  3.����  4.���� �޴� ");
		out.println("-------------------------------");
		out.println("��ȣ�� �Է��ϼ��� =>");
		out.println("-------------------------------");
	}//subMenu()-----------------
	
	// ���� �޴� ��� / ���̽� ���� ���� ��
	public void register() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			subMenu();
			int no=0;
			try{
				no=sc.nextInt();
			}
			catch(InputMismatchException e) {
				out.println("���ڷ� �Է��ϼ���");
					return;
			}
			
			switch(no) {
			case 1: //�л�
				Student st=new Student();
				st.inputInfo(); //�л� ������ �Է¹���
				addPerson(st); //��ϵ� ��ü�� �迭�� ����
				break;
			case 2: //����
				Teacher tc=new Teacher();
				tc.inputInfo();
				addPerson(tc);
				break;
			case 3: //����
				Staff sf=new Staff();
				sf.inputInfo();
				addPerson(sf);
				break;
			case 4: //���� �޴�
				return; 
				
			default: out.println("�������� �ʴ� �޴����Դϴ�.");
			}//switch()-----------
			
		}//while()--------------
		
	}//register()-------------
	
	//1. ����� ������� �迭�� �����ϴ� �޼ҵ�
	public void addPerson(Person p) {
		if(count<person.length){
			person[count++]=p;
		}
		else {
			out.println("30�� ���� �ʰ� �Ǿ����!");
		}
	}//addPerson()-----------------
	
	//2. �̸����� ��ϵ� ����� �˻��ϴ� �޼ҵ�
	public String findPerson(String name) {
		for(int i=0; i<count; i++) {
			//�迭�� ����� ����� �̸��� �����´�
			String arrName = person[i].getName();
			
			//�˻��ϰ��� �ϴ� ����� �̸��� ���� �̸��� ��ġ�ϴ��� ��
			if(name.equals(arrName)) {
				person[i].printAll(); // ������ �� ����� ������ ���
				return person[i].getInfo();
			}
		}//for()-----
		out.println(name + "�̶� ��� �����ϴ�");
		return name + "�̶� ��� �����ϴ�";
	}//findPerson()------
	
	//3. �̸����� �����ϴ� �޼ҵ�
	public String removePerson(String name) {
		for(int i=0; i<count; i++) {
			String pname = person[i].getName();
			
			if(name.equals(pname)) {
				for(int j=i; j<count; j++) {
					person[j]=person[j+1];
				}
			count--;
			out.println(name + "�� ������ �����Ǿ����ϴ�");
			return name + "�� ������ �����Ǿ����ϴ�";
			}//if()------
			
		}//for()-----
		out.println(name + "�� ������ �����ϴ�");
		return name + "�� ������ �����ϴ�";
	}//removePerson()------
	
	//4. �迭�� ����� ����� ��� ���� ���
	public String printAll() {
		String str="";
		for(int i=0; i<count; i++) {
			if(person[i] instanceof Student) {
				str+="\n ---�л�����---\n";
			}
			else if(person[i] instanceof Teacher) {
				str+="\n ---��������---\n";
			}
			else {
				str+="\n ---��������---\n";
			}
			str+=person[i].getInfo();
		}
		out.println(str);
		return str;
	}//printAll()-----
	
	
	
	public static void main(String[] args) {
		InstApp instapp = new InstApp();
		Scanner scan = new Scanner(System.in);
			
		while(true) {
		instapp.mainMenu();
		int no = scan.nextInt();
		
		switch(no) {
		case 1: //���
			instapp.register();
			break;
		case 2: //�˻�
			out.println("�˻�: ��� �̸� =>");
			String name = scan.next();
			out.println("--" + name + "���� �˻��մϴ�");
			instapp.findPerson(name);
			break;
		case 3: //����
			out.println("����: ��� �̸� =>");
			name = scan.next();
			instapp.removePerson(name);
			break;
		case 4: //���
			instapp.printAll();
			break;
		case 5:
			out.println("���α׷� ����");
			System.exit(0); //���α׷� ���� ����
			break;
		default:
			out.println("�������� �ʴ� �޴� ��ȣ�Դϴ�");
		}//switch()-----
		
		}//while()------
	}//main()-------

	
}/////////////////////

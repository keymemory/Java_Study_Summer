package day03;

import static java.lang.System.out;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		out.println("-----Menu-----");
		out.println("1. ������ (liter�� 50��)");
		out.println("2. ����� (liter�� 45��)");
		out.println("3. ������ (liter�� 30��)");
		out.println("--------------");
		out.println("�޴��� �����ϼ���=>");
		out.println("--------------");
		
		Scanner sc=new Scanner(System.in);
		int code=sc.nextInt();
		int fare=0; //�����
		double tax=0; //����
		out.println("��뷮�� �Է��ϼ���=>");
		int use=sc.nextInt(); //��뷮
		
		switch(code){
		case 1: 
			fare=use*50;	
			break;
		case 2: 
			fare=use*45;	
			break;
		case 3: 
			fare=use*30;	
			break;
		
		default: out.println("�������� �ʴ� �޴���ȣ�Դϴ�.");
		}//switch
		out.println("--------------");
		out.println("����� �ڵ�: "+code);
		out.println("��� ���: "+fare);
		tax=fare*.05;
		double total=fare+tax;
		//double total=fare*1.05;
		out.println("�� ���� ���: "+total);
		out.println("--------------");
		
		
	}

}

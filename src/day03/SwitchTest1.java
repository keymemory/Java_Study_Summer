package day03;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class SwitchTest1 {

	public static void main(String[] args) 
		throws IOException
	{
		out.println("-----�ȳ�-----");
		out.println("���� ��1�� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		out.println("���� ��2�� �Է��ϼ���");
		int n2=sc.nextInt();
		out.println("�����ڸ� �Է��ϼ���");
		out.println(" [ +, -, *, / ]");
		char oper=(char)System.in.read();
		int res=0;
		if(oper=='+')
			res=n1+n2;
		else if(oper=='-')
			res=n1-n2;
		if(oper=='*')
			res=n1*n2;
		else
			res=n1/n2;
		
		out.println("��: " +n1+oper+n2+"="+res);
		
		long a='+';
		//switch()�� ��ȣ �ȿ� �� ���� ����,�� �� �� ���� �ִ�.
		//�׷��� �� ��� ���� ������ �������� ���̾�� �Ѵ�.
		//� ������ ������ �� ��.
		//����, �� ���� �������̾�� �ϸ�, ������ �߿����� long���� �� ��
		//��, byte, short, char, int ���� ��
		int res2=0;
		switch(oper){
		case'+': out.println("���ϱ�");
				res2=n1+n2;
		case'-': out.println("����");
				res2=n1-n2;
		case'*': out.println("����");
				res2=n1*n2;
		case'/': out.println("������");
				res2=n1/n2;
			
		}
		out.println("��: " +n1+oper+n2+"="+res2);
		
		}
	}



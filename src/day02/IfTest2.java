package day02;
import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
			System.out.println("0~9 �Ǵ� ���ĺ�, �׿� ���ڸ�"+"�Է��ϼ���=>");
			Scanner scan =new Scanner(System.in);
			String n=scan.next();
			System.out.println("�Է��� ��: " +n);
			
			if(n.equals("0")||n.equals("9"))
				System.out.println("����");
			
			else if(n.equals("A")||n.equals("Z")||n.equals("a")||n.equals("z"))
				System.out.println("���ĺ�");
			
			else
				System.out.println("��Ÿ����");
		}
	}


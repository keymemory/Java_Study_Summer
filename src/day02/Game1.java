package day02;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		
		int x,y;
		Random r= new Random();
		
		x=r.nextInt(9)+1; // ()���� ~������ ����, 0<= r < 1 - �⺻ ���� , ������ 0���� ����
		y=r.nextInt(9)+1; // +1�� �ȴٸ� 1���� ����, +�Ǵ� ���� ���� ��
		
		int num=x*y;
		
		System.out.println();
		System.out.println("������ " + x + "�ܿ� ���� �����Դϴ�.");
		System.out.println();
		System.out.println(x + " * " + y + " = ");
		
		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();
		
		if(num==inputNum){
			System.out.println("�����Դϴ�");
		}
		else{
			System.out.println("Ʋ�Ƚ��ϴ� ������ " + num + " �Դϴ�");
		}

	}

}

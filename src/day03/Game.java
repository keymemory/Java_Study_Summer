package day03;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	//�޴��� ������ִ� ����� ���� �޼ҵ�
	public static void showMenu() {
		System.out.println("**********Game Menu**********");
		System.out.println("1.����  2.����  3.��  9.����");
		System.out.println("*****************************");
		System.out.println("�Է��ϼ��� =>");
	}//showMenu()-----

	public static void main(String[] args) {
		while(true) {
			Game.showMenu();
			Scanner scan = new Scanner(System.in);
			int no=scan.nextInt();
			
			if(no==9) break; 
			Random rand = new Random();
			int comp = rand.nextInt(3)+1;
			//int comp=(int)(Math.random()*3+1);
			
			//1.��� ���: no==comp
			//2.������ �̱� ���
			//3.�׿ܴ� ���� �� ���
			
			if(no==comp) {
				System.out.println("�����ϴ�");
			}
			else if((no==1&&comp==3)||(no==2&&comp==1)||(no==3&&comp==2)) {
				System.out.println("����� �̰���ϴ�");
				}
			else System.out.println("����� �����ϴ�");
			
		}//while()-----
		System.out.println("�������ϴ�");
	}//main()-----

}

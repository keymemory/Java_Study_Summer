package day03;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	//메뉴를 출력해주는 사용자 정의 메소드
	public static void showMenu() {
		System.out.println("**********Game Menu**********");
		System.out.println("1.가위  2.바위  3.보  9.종료");
		System.out.println("*****************************");
		System.out.println("입력하세요 =>");
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
			
			//1.비길 경우: no==comp
			//2.유저가 이길 경우
			//3.그외는 내가 질 경우
			
			if(no==comp) {
				System.out.println("비겼습니다");
			}
			else if((no==1&&comp==3)||(no==2&&comp==1)||(no==3&&comp==2)) {
				System.out.println("당신이 이겼습니다");
				}
			else System.out.println("당신이 졌습니다");
			
		}//while()-----
		System.out.println("끝났습니다");
	}//main()-----

}

package day02;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		
		int x,y;
		Random r= new Random();
		
		x=r.nextInt(9)+1; // ()안은 ~까지의 범위, 0<= r < 1 - 기본 범위 , 원래는 0부터 시작
		y=r.nextInt(9)+1; // +1이 된다면 1부터 시작, +되는 값이 시작 값
		
		int num=x*y;
		
		System.out.println();
		System.out.println("구구단 " + x + "단에 대한 문자입니다.");
		System.out.println();
		System.out.println(x + " * " + y + " = ");
		
		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();
		
		if(num==inputNum){
			System.out.println("정답입니다");
		}
		else{
			System.out.println("틀렸습니다 정답은 " + num + " 입니다");
		}

	}

}

package day03;

import static java.lang.System.out;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		out.println("-----Menu-----");
		out.println("1. 가정용 (liter당 50원)");
		out.println("2. 상업용 (liter당 45원)");
		out.println("3. 공업용 (liter당 30원)");
		out.println("--------------");
		out.println("메뉴를 선택하세요=>");
		out.println("--------------");
		
		Scanner sc=new Scanner(System.in);
		int code=sc.nextInt();
		int fare=0; //사용요금
		double tax=0; //세금
		out.println("사용량을 입력하세요=>");
		int use=sc.nextInt(); //사용량
		
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
		
		default: out.println("지원되지 않는 메뉴번호입니다.");
		}//switch
		out.println("--------------");
		out.println("사용자 코드: "+code);
		out.println("사용 요금: "+fare);
		tax=fare*.05;
		double total=fare+tax;
		//double total=fare*1.05;
		out.println("총 수도 요금: "+total);
		out.println("--------------");
		
		
	}

}

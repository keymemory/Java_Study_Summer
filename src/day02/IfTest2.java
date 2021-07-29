package day02;
import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
			System.out.println("0~9 또는 알파벳, 그외 문자를"+"입력하세요=>");
			Scanner scan =new Scanner(System.in);
			String n=scan.next();
			System.out.println("입력한 값: " +n);
			
			if(n.equals("0")||n.equals("9"))
				System.out.println("숫자");
			
			else if(n.equals("A")||n.equals("Z")||n.equals("a")||n.equals("z"))
				System.out.println("알파벳");
			
			else
				System.out.println("기타문자");
		}
	}


package day02;
import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
			System.out.println("0~9사이의 정수를 입력하세요=>");
			Scanner scan =new Scanner(System.in);
			int input=scan.nextInt();
			
			System.out.println("input: " +input);
			if(input %2==0){
				System.out.println("짝수");
			}
			else{
				System.out.println("홀수");
			}
		
		//문제1] 위의 if~else문을 삼항 연산자로 바꿔 작성해보시오
		String a=(input%2==0)?"짝수":"홀수";
		System.out.println(a);
			
		}
	}


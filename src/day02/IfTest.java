package day02;
import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
			System.out.println("0~9������ ������ �Է��ϼ���=>");
			Scanner scan =new Scanner(System.in);
			int input=scan.nextInt();
			
			System.out.println("input: " +input);
			if(input %2==0){
				System.out.println("¦��");
			}
			else{
				System.out.println("Ȧ��");
			}
		
		//����1] ���� if~else���� ���� �����ڷ� �ٲ� �ۼ��غ��ÿ�
		String a=(input%2==0)?"¦��":"Ȧ��";
		System.out.println(a);
			
		}
	}


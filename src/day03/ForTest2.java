package day03;

public class ForTest2 {

	public static void main(String[] args) {
		//����1] 1���� 10������ ���� ���غ���
		// for���� ���	 ex) 1+2+3+.....+10
		//1���� 10������ ���� ���غ���
		//1*2*3*.....*10
		int sum=0, gop=1;
		
		for(int i=1; i<=10; i++) {
			sum+=i;
			gop*=i;
		}
		System.out.println("�� ����: "+sum);
		System.out.println("�� ����: "+gop);
		
		//����2] 0~100������ �� �� ¦���� �� ���غ���
		int sum2=0;
		for(int i=1; i<101; i++) {
			if(i%2==0) {
				System.out.println(sum2+"+"+i);
				sum2+=i;
			}
		}
		System.out.println("0~100 ¦�� ��: " +sum2);

	}

}

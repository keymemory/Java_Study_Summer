package day03;

public class ForTest3 {

	public static void main(String[] args) {
		//��ø for ����
		for(int i=2;i<4;i++) {
			for(int k=0;k<2;k++) {
				System.out.println("i="+i+", k="+k);
			}
			System.out.println("**********");
		}

		for(int i=0;i<3;i++) {
			for(int k=0;k<4;k++) {
				System.out.println("i="+i+", k="+k);
			}
			System.out.println("----------");
		}
		
		/*
		 ����5] ��ø for������ �̿��Ͽ� �Ʒ� ������ ��µǵ��� �ض�
		*****
		*****
		*****
		*/
		for(int i=0; i<3; i++) {
			for(int k=0; k<5; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//����6] ������ �����
		for(int i=2; i<10; i++) {
			for(int k=1; k<10; k++) {
				System.out.println(i + "x" + k + "=" + i*k );
			}
		}
	}

}

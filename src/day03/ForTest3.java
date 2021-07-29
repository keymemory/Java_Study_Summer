package day03;

public class ForTest3 {

	public static void main(String[] args) {
		//중첩 for 루프
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
		 문제5] 중첩 for루프를 이용하여 아래 오양이 출력되도록 해라
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
		
		//문제6] 구구단 만들기
		for(int i=2; i<10; i++) {
			for(int k=1; k<10; k++) {
				System.out.println(i + "x" + k + "=" + i*k );
			}
		}
	}

}

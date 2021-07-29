package day03;

public class ForTest2 {

	public static void main(String[] args) {
		//문제1] 1에서 10까지의 합을 구해보자
		// for루프 사용	 ex) 1+2+3+.....+10
		//1에서 10까지의 곱을 구해보자
		//1*2*3*.....*10
		int sum=0, gop=1;
		
		for(int i=1; i<=10; i++) {
			sum+=i;
			gop*=i;
		}
		System.out.println("총 합은: "+sum);
		System.out.println("총 곱은: "+gop);
		
		//문제2] 0~100까지의 수 중 짝수의 합 구해보자
		int sum2=0;
		for(int i=1; i<101; i++) {
			if(i%2==0) {
				System.out.println(sum2+"+"+i);
				sum2+=i;
			}
		}
		System.out.println("0~100 짝수 합: " +sum2);

	}

}

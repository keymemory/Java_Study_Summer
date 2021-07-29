package day04;

public class ArrayTest4 {

	public static void main(String[] args) {
		double real[] = { 2.13, 5.71, 2.87, 7.89 }; // 4.1
		for(int i=0; i<real.length; i++) {
			System.out.print(real[i]+" ");
		}
		System.out.println();
		
		int ary[] = new int[12]; // 4.2
		ary[2] = 10;
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		int two[][] = new int[3][4]; // 4.3
		two[1][2] = 20;
		for(int i=0; i<two.length; i++) {
			for(int k=0; k<two[i].length; k++) {
			System.out.print(two[i][k]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int cnt[] = new int[20]; // 4.4
		for(int i=0; i<cnt.length; i++) {
			System.out.print(cnt[i]+" ");
		}
		System.out.println();
		
		int matrixA[][] = {{12,23},{3,73},{43,2}}; // 4.5
		for(int i=0; i<matrixA.length; i++) {
			for(int k=0; k<matrixA[i].length; k++) {
			System.out.print(matrixA[i][k]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}

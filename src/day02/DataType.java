package day02;

public class DataType {
	
	public DataType(){
		System.out.println("2.실수형-----");
		//float: 단정밀도, 소수점 이하 7자리까지
		//double: 배정밀도, 소수점 이하 15~16자리 디폴트
		float ft=1.234F;
		float ft2=0.56f;//반드시 접미사 f를 붙여주어야 한다. 그렇지 않으면 double로 인식
		System.out.println("ft:" +ft);
		System.out.println("ft2:" +ft2);
		float ft3=321;
		System.out.println("ft3:" +ft3);
		float ft4=3.456F;
		System.out.println("ft4:" +ft4);
		int e = (int)ft4; //강제적 형변환
		System.out.println("e:" +e);
		float ft5=0x12;//1*16+2=18
		System.out.println("ft5:" +ft5); //18.0
		
		//byte->short->int->long | ->float->double
		//------------------>묵시적 형변환
		//<------------------강제적 형변환(Casting)
		//캐스팅 연산자 ()를 이용하여 형변환 해줘야 한다
		//주의, 테이터 손실이 있을 수 있다
		
		byte b=10;
		long c=b;
		System.out.println("c: " +c);
		int d=(int)c; // 강제적 형변환
		System.out.println("d: " +d);
		
		//double
		double dt1=.899;
		System.out.println("dt1: " +dt1);
		double dt2=.889E5;
		double dt3=.899E-5;
		System.out.println("dt2: " +dt2);
		System.out.println("dt3: " +dt3);
		
		System.out.println("3.문자형-----");
		//char: 2byte 0~65536. 모든 국가의 언어표현이 가능, 자바 유니코드 체계 사용
		char ch='A'; //65
		System.out.println("ch: " +ch);
		char ch2='가';
		System.out.println("ch2: " +ch2);
		char ch3='\uff57';
		System.out.println("ch3: " +ch3);
		System.out.println(ch+1); //66, 문자형+(산술연산)문자형 ==> 정수
		
		System.out.println("4.논리형-----");
		boolean bool=true;
		System.out.println("bool: " +bool);
		boolean bool2=5>10;
		System.out.println("bool2: " +bool2);
	}
	
	public static void main(String[] args) {
		DataType dt = new DataType();
	}

}

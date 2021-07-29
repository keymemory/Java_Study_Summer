package day02;

public class DataType2 {
	
	public void go(){
		System.out.println("-----gogo-----");
		System.out.println("5.참조형-----");
		//※ 참조형(Reference Type)은 반드시 new 연산자로 객체를 생성해 사용해야 한다
		//그러나 예외는 있따. String의 경우, 너무나도 자주 사용하기 때문에 마치 기본형처럼
		//문자열 값을 직접 할당해 줄 수 있게 하고 있다.
		String str1 = "Hello";
		String str2 = new String("Hello");
		System.out.println("str1:" +str1);
		System.out.println("str2:" +str2);
		String str3 = "JAVA";
		System.out.println(str1+str3); // String 의 값을 더하기 연산자로 결합하면 결과는 문자열 결합
		
		int m=10;
		int n=30;
		System.out.println(m+n+"<=합"); // 연산을 하려면 문자를 뒤에 배치
		System.out.println("합=>" + m+n); // 문자('합')가 먼저 나오면 뒤에도 문자로 인식
		System.out.println("합=>:" +(m+n)); // 연산을 하려면 괄호로 묶어라
		
	}
	
	public static void main(String[] args) {
		DataType2 dt = new DataType2();
		dt.go();
	}

}

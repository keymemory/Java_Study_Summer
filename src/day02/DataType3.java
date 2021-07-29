package day02;

public class DataType3 {
	
	public static void main(String[] args) {
		System.out.println("1.----------");
		//제어문자: 인쇄할 수 없거나, 키보드로 표한할 수 없는 특별한 문자
		//역슬래시(\)와 한개의 문자와 결합하여 작성
		/*
		 * Escape문자:
		 * - \n: 개행, 스크린 커서 위치를 다음 줄의 처음으로 옮김
		 * - \t: 수형 탭, 스크린 커서를 다음 탭으로 옮김
		 * - \r: 캐리지 리턴, 스크린 커서의 위치를 현재 줄의 처음으로 옮긴다. 개행하지는 않는다.
		 * - \\: 역슬래시 문자 출력할 때 사용
		 * - \": 큰 따옴표를 출력할 때 사용
		 * - \': 작은 따옴표를 출력시 사용
		 */
		
		System.out.println("여기는 첫째 줄");
		System.out.println("입니다");
		System.out.println("여기는 둘째 줄 \n여기는 셋째 줄");
		System.out.println("국어\t\t영어\t\t수학");
		System.out.println("----------------------------------------");
		System.out.println("90\t\t80\t\t70");
		System.out.println("----------------------------------------");
		System.out.println("이번엔 캐리지 리턴을 써볼까요?\rA");
		System.out.println("역슬래시(\\)를 출력할때는"+"이스케이프 문자를 사용합니다");
		//"안녕하세요. 저는 누구 입니다."
		System.out.println("\"안녕하세요. 저는 누구 입니다.\"");
	}

}

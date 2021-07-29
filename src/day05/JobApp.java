package day05;

import java.util.Scanner;

public class JobApp {
	//구직 등록 프로그램
	public void showMenu() {
		System.out.println("-----JOB v1.0-----");
		System.out.println("** 1. 구직 등록 **");
		System.out.println("** 2. 구인 등록 **");
		System.out.println("** 3. 구직자 정보 **");
		System.out.println("** 4. 종료 **");
		System.out.println("메뉴 번호를 입력하세요 =>");
	}//showMenu()------
	
	public static void inputPerson() { //1.구직등록 메뉴 실행하는 메소드
		//구직을 원하는 사람의 인적정보를 입력받는 메소드
		//이름, 나이, 성별, 전화번호를 입력받아 Person 객체에 저장
		Scanner scan = new Scanner(System.in);
		Person person = new Person();
		System.out.println("이름을 입력하세요 =>");
		person.name = scan.next();
		System.out.println("나이를 입력하세요 =>");
		person.age = scan.nextInt();
		System.out.println("성별을 입력하세요 =>");
		System.out.println("1.남자 2.여자");
		int s = scan.nextInt();
		if(s==1) {
			person.sex = 'M';
		}
		else {
			person.sex = 'F';
		}
		System.out.println("전화번호를 입력하세요 =>");
		person.tel = scan.next();
		String info = person.showProfile();
		System.out.println(info);
	}//inputPreson()-------

	public static void main(String[] args) {
		JobApp joa = new JobApp();
		Scanner scn = new Scanner(System.in);
		while(true) {
			joa.showMenu();
		int num = scn.nextInt();
		if(num==4){
			System.exit(0); //프로그램 종료 - 정상종료(0)
		}
		else if(num==1) { //1.구직 등록 메뉴 실행(구직을 원하는 사람의 인적정보 입력받는 메소드 호출)
			joa.inputPerson();
		}
		else {
			
		}
		
		}//while()-----
	}

}



class Person{
	//추상화
	//속성, 메소드 정의 -> has a 관계 생각하기
	String name;
	int age;
	String tel;
	char sex;
	
	//모든 사람의 정보를 문자열로 반환하는 메소드
	public String showProfile() {
		String result = null;
		result = "-----" + name + "프로필-----";
		result+="\n나이: " +age;
		result+="\n성별: " +sex;
		result+="\n전화: " +tel;
		return result;
	}
	
	//희망 직종과 희망 연봉을 출력하는 메소드 작성
	public void wantJob(String job, int pay) {
		System.out.println("-----" + name + "님");
		System.out.println("--희망 직종--" + job);
		System.out.println("--희망 연봉--" + pay);
	}
	
}
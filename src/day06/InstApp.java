package day06;
import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InstApp {

	final static int PMAX=30; // 상수선언
	private Person person[] = new Person[PMAX]; // 30명 전원
	private int count; // 배열의 인덱스로서 사용될 변수
	
	public Person[] getPerson() {
		return person;
	}
	
	public int getCount() {
		return count;
	}
	
	// 메인 메뉴를 보여주는 메소드
	public static void mainMenu() {
		out.println("-----------Main Menu-----------");
		out.println("1.등록  2.검색  3.삭제  4.출력 5.종료");
		out.println("-------------------------------");
		out.println("번호를 입력하세요 =>");
		out.println("-------------------------------");
	}//mainMenu()-----------------
	
	// 위 메뉴를 보여주는 메소드
	public static void subMenu() {
		out.println("-----------Sub Menu-----------");
		out.println("1.학생  2.강사  3.직원  4.상위 메뉴 ");
		out.println("-------------------------------");
		out.println("번호를 입력하세요 =>");
		out.println("-------------------------------");
	}//subMenu()-----------------
	
	// 서브 메뉴 출력 / 케이스 별로 로직 수
	public void register() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			subMenu();
			int no=0;
			try{
				no=sc.nextInt();
			}
			catch(InputMismatchException e) {
				out.println("숫자로 입력하세요");
					return;
			}
			
			switch(no) {
			case 1: //학생
				Student st=new Student();
				st.inputInfo(); //학생 정보를 입력받음
				addPerson(st); //등록된 객체를 배열에 저장
				break;
			case 2: //교사
				Teacher tc=new Teacher();
				tc.inputInfo();
				addPerson(tc);
				break;
			case 3: //직원
				Staff sf=new Staff();
				sf.inputInfo();
				addPerson(sf);
				break;
			case 4: //상위 메뉴
				return; 
				
			default: out.println("지원되지 않는 메뉴번입니다.");
			}//switch()-----------
			
		}//while()--------------
		
	}//register()-------------
	
	//1. 등록한 사람들을 배열에 저장하는 메소드
	public void addPerson(Person p) {
		if(count<person.length){
			person[count++]=p;
		}
		else {
			out.println("30명 정원 초과 되었어요!");
		}
	}//addPerson()-----------------
	
	//2. 이름으로 등록된 사람을 검색하는 메소드
	public String findPerson(String name) {
		for(int i=0; i<count; i++) {
			//배열에 저장된 사람의 이름을 꺼내온다
			String arrName = person[i].getName();
			
			//검색하고자 하는 사람의 이름과 꺼낸 이름이 일치하는지 비교
			if(name.equals(arrName)) {
				person[i].printAll(); // 같으면 그 사람의 정보를 출력
				return person[i].getInfo();
			}
		}//for()-----
		out.println(name + "이란 사람 없습니다");
		return name + "이란 사람 없습니다";
	}//findPerson()------
	
	//3. 이름으로 삭제하는 메소드
	public String removePerson(String name) {
		for(int i=0; i<count; i++) {
			String pname = person[i].getName();
			
			if(name.equals(pname)) {
				for(int j=i; j<count; j++) {
					person[j]=person[j+1];
				}
			count--;
			out.println(name + "님 정보가 삭제되었습니다");
			return name + "님 정보가 삭제되었습니다";
			}//if()------
			
		}//for()-----
		out.println(name + "님 정보가 없습니다");
		return name + "님 정보가 없습니다";
	}//removePerson()------
	
	//4. 배열에 저장된 사람의 모든 정보 출력
	public String printAll() {
		String str="";
		for(int i=0; i<count; i++) {
			if(person[i] instanceof Student) {
				str+="\n ---학생정보---\n";
			}
			else if(person[i] instanceof Teacher) {
				str+="\n ---교사정보---\n";
			}
			else {
				str+="\n ---직원정보---\n";
			}
			str+=person[i].getInfo();
		}
		out.println(str);
		return str;
	}//printAll()-----
	
	
	
	public static void main(String[] args) {
		InstApp instapp = new InstApp();
		Scanner scan = new Scanner(System.in);
			
		while(true) {
		instapp.mainMenu();
		int no = scan.nextInt();
		
		switch(no) {
		case 1: //등록
			instapp.register();
			break;
		case 2: //검색
			out.println("검색: 사람 이름 =>");
			String name = scan.next();
			out.println("--" + name + "님을 검색합니다");
			instapp.findPerson(name);
			break;
		case 3: //삭제
			out.println("삭제: 사람 이름 =>");
			name = scan.next();
			instapp.removePerson(name);
			break;
		case 4: //출력
			instapp.printAll();
			break;
		case 5:
			out.println("프로그램 종료");
			System.exit(0); //프로그램 정상 종료
			break;
		default:
			out.println("지원하지 않는 메뉴 번호입니다");
		}//switch()-----
		
		}//while()------
	}//main()-------

	
}/////////////////////

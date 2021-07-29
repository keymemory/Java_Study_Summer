package day05;

public class TestClass {

	public static void main(String[] args) {

		Student stu = new Student();
		stu.name = "학생입니다";
		stu.age = 23;
		stu.hakbun = "20141625";
		System.out.println("이름: " + stu.name);
		System.out.println("나이: " + stu.age);
		System.out.println("학번: " + stu.hakbun);

	}

}

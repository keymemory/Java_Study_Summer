package day01;

public class MyDemo {
	
	//1. Ŭ���� ���� a ���� : ��, �������� �ڷ�Ÿ��
	//2. ��� ���� b ����
	//3. ������ ����
	//4. ��� �޼ҵ� demo() ����: "mydemo" ���ڿ��� ����ϴ� �޼ҵ�
	//5. static �޼ҵ� my() ���� : "my"���ڿ� ����ϴ� �޼ҵ�
	
	static int a; //1
	int b; //2
	
	public MyDemo(){ //3
		a=10;
		b=20;
	}
	
	public void demo(){ //4
		
		System.out.println("mydemo");
	}
	
	public static void my(){ //5
		
		System.out.println("my");
	}
	
	public static void main(String[] args) {

		MyDemo my = new MyDemo();
		//2. ��� �޼ҵ� ȣ�� - static �� �ٿ����� ���� ��
		// ��ü�� �Ǵ� ����������.�޼ҵ��̸�()
		my.demo();
		//3. static �޼ҵ� ȣ��
		// Ŭ�����̸�.�޼ҵ��̸�()
		MyDemo.my();
		
		MyDemo.a=30;
		my.b=40;
		System.out.println("a:" + MyDemo.a);
		System.out.println("b:" + my.b);
	}

}

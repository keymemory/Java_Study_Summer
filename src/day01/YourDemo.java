package day01;

public class YourDemo {

	//1. main() �޼ҵ带 �ۼ�
	//2. �����ڸ� ����
	//3. main() �޼ҵ� �ȿ��� �����ڸ� ȣ��
	//4. Ŭ���� �޼ҵ�(static �޼ҵ�)�� �����ϰ� �̸� main()�ȿ��� ȣ��
	//5. ��� �޼ҵ带 �ϳ� ����. �� �Ű������� �޾Ƶ鿩�� �̸� main() �޼ҵ� �ȿ��� ȣ��
	
	public YourDemo(){ //2
		
		System.out.println("������");
	}
	
	
	public static void first(){ //4
		
		System.out.println("Ŭ���� static ���ڿ�");	
	}
	
	public void second(){
		
		System.out.println("��� �޼ҵ� ���ڿ�");
	}
	
	public void third(String s1, String s2){ //5
		System.out.println("-------------------");
		System.out.println(s1);
		System.out.println("-------------------");
		System.out.println(s2);
	}
	
	public static void main(String[] args){ //1, 3
		System.out.println("-----���ν���-----");
		
		//������ Ÿ�� ������ = new ������()
		YourDemo your = new YourDemo();
		
		//Ŭ���� �޼ҵ� ȣ�� �� Ŭ������.�޼ҵ��();
		YourDemo.first();
		your.second();
		
		
		//��� �޼ҵ� ȣ���
		//1) ���� ��ü�� �����ϰ� (�����ڸ� ȣ�����ְ�)
		//�� ��ü�� �����ϰ� �ִ� ������.�޼ҵ��() �� ������� ȣ��
		//��, ��ü��.�޼ҵ��()
		
		System.out.println("-----���ν���2-----");
		YourDemo your2 = new YourDemo();
		your2.third("��Ʈ��ũ", "���α׷���");
	}
	
	
	
}

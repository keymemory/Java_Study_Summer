package day02;

public class DataType2 {
	
	public void go(){
		System.out.println("-----gogo-----");
		System.out.println("5.������-----");
		//�� ������(Reference Type)�� �ݵ�� new �����ڷ� ��ü�� ������ ����ؾ� �Ѵ�
		//�׷��� ���ܴ� �ֵ�. String�� ���, �ʹ����� ���� ����ϱ� ������ ��ġ �⺻��ó��
		//���ڿ� ���� ���� �Ҵ��� �� �� �ְ� �ϰ� �ִ�.
		String str1 = "Hello";
		String str2 = new String("Hello");
		System.out.println("str1:" +str1);
		System.out.println("str2:" +str2);
		String str3 = "JAVA";
		System.out.println(str1+str3); // String �� ���� ���ϱ� �����ڷ� �����ϸ� ����� ���ڿ� ����
		
		int m=10;
		int n=30;
		System.out.println(m+n+"<=��"); // ������ �Ϸ��� ���ڸ� �ڿ� ��ġ
		System.out.println("��=>" + m+n); // ����('��')�� ���� ������ �ڿ��� ���ڷ� �ν�
		System.out.println("��=>:" +(m+n)); // ������ �Ϸ��� ��ȣ�� �����
		
	}
	
	public static void main(String[] args) {
		DataType2 dt = new DataType2();
		dt.go();
	}

}

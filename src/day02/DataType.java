package day02;

public class DataType {
	
	public DataType(){
		System.out.println("2.�Ǽ���-----");
		//float: �����е�, �Ҽ��� ���� 7�ڸ�����
		//double: �����е�, �Ҽ��� ���� 15~16�ڸ� ����Ʈ
		float ft=1.234F;
		float ft2=0.56f;//�ݵ�� ���̻� f�� �ٿ��־�� �Ѵ�. �׷��� ������ double�� �ν�
		System.out.println("ft:" +ft);
		System.out.println("ft2:" +ft2);
		float ft3=321;
		System.out.println("ft3:" +ft3);
		float ft4=3.456F;
		System.out.println("ft4:" +ft4);
		int e = (int)ft4; //������ ����ȯ
		System.out.println("e:" +e);
		float ft5=0x12;//1*16+2=18
		System.out.println("ft5:" +ft5); //18.0
		
		//byte->short->int->long | ->float->double
		//------------------>������ ����ȯ
		//<------------------������ ����ȯ(Casting)
		//ĳ���� ������ ()�� �̿��Ͽ� ����ȯ ����� �Ѵ�
		//����, ������ �ս��� ���� �� �ִ�
		
		byte b=10;
		long c=b;
		System.out.println("c: " +c);
		int d=(int)c; // ������ ����ȯ
		System.out.println("d: " +d);
		
		//double
		double dt1=.899;
		System.out.println("dt1: " +dt1);
		double dt2=.889E5;
		double dt3=.899E-5;
		System.out.println("dt2: " +dt2);
		System.out.println("dt3: " +dt3);
		
		System.out.println("3.������-----");
		//char: 2byte 0~65536. ��� ������ ���ǥ���� ����, �ڹ� �����ڵ� ü�� ���
		char ch='A'; //65
		System.out.println("ch: " +ch);
		char ch2='��';
		System.out.println("ch2: " +ch2);
		char ch3='\uff57';
		System.out.println("ch3: " +ch3);
		System.out.println(ch+1); //66, ������+(�������)������ ==> ����
		
		System.out.println("4.����-----");
		boolean bool=true;
		System.out.println("bool: " +bool);
		boolean bool2=5>10;
		System.out.println("bool2: " +bool2);
	}
	
	public static void main(String[] args) {
		DataType dt = new DataType();
	}

}

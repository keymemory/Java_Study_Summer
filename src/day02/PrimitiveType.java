package day02;

public class PrimitiveType {
	
	public PrimitiveType(){
		System.out.println("1.������-----");
		byte bt=10;//-128~127
		byte bt2=127;
		System.out.println("bt:" +bt);
		System.out.println("bt2:" +bt2);
		
		short st=1000;
		System.out.println("st:" +st);
		
		int it=30;//�������� ����Ʈ
		
		long in=40;
		long in2=40L;	//L,I �̶�� ���̻縦 �ٿ��ش�
		System.out.println("it:" +it);
		System.out.println("in:" +in);
		System.out.println("in2:" +in2);
		
		int i=1000000000;// 0�� 9��, int���� �ִ� ����
		long j=10000000000L;//0�� 10��
		System.out.println("i:" +i);
		System.out.println("j:" +j);
		
		int a = 010;//8����, 0~7 �տ� 0�� ���δ�
		System.out.println("a:" +a);
		int b = 0341;
		System.out.println("b:" +b);
		
		long c=0x11; //16����
		System.out.println("c");
		long d=0x2AC;
		System.out.println("d");
	}
	
	public static void main(String[] args) {
		PrimitiveType p = new PrimitiveType();
	}

}

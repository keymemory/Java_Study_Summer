package day02;
/*
 * ����(variable, field, property, parameter)
 * 1> Ŭ���� ���� : static ����
 * 2> ��� ���� : instance ����
 * 3> ���� ���� : local ����, automatic ����, �޼ҵ� �� �� �Ǵ� �ν��Ͻ� ���ȿ��� ����� ����
 */

/* - �� packaga�� �ΰ��� class
 * �� ���������� ���� Ŭ������ ������ ���
 * public �Ӽ��� �� Ŭ������ ������ �Ѵ�
 * �ַ� main()�޼ҵ带 ������ Ŭ������ public �Ӽ��� ������, ������ �� ���ϸ��� �־�� �Ѵ�.
 * �̶� �������� �ϸ� ���õ� Ŭ���� ������ ��� ����
 */

class Demo{
	
}

public class VarTest2 {

	int a=10; // ��� ����, �ν��Ͻ� ����
	static int b=20; // ũ���� ����, static ����

	public VarTest2(){ // ������ - ��ȯ Ÿ�� ���X , ������ �տ� void ������X
		int c=30; // ���� ����, ���� ���� - �ʱ�ȭ ��Ű��
		System.out.println("VarTest() ������");
		System.out.println("�������� c: " +c);
	}

public static void main(String[] args){
	//1. Ŭ���� ���� b�� ���
	//Ŭ������. ����
	System.out.println("Ŭ���� ���� b: " +VarTest2.b);
	//2.��� ���� a�� ���
	//��ü ���� ��, ��ü��.����
	VarTest2 v = new VarTest2();
	System.out.println("��� ���� a: " +v.a);
	//3.���� ���� c�� ���
	//System.out.println("�������� c: " +v.c);
	//���� ������ ����� �� �ȿ����� ��밡��
	int c=300; // c�� ���� ����, �ʱ�ȭ �ʿ�
	System.out.println("�������� c: " +c);

	}
}

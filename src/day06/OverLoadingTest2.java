package day06;

public class OverLoadingTest2 {

	public static void main(String[] args) {
		
		CoffeeMachine cm = new CoffeeMachine();
		// 1. ��ũĿ��
		cm.getTea(2, 2, 2);
		// 2. �� Ŀ��
		cm.getTea(3);
		// 3. ����Ŀ��
		cm.getTea(2, 3);
		System.out.println(cm.getTea(2, 3));
	}

}



class CoffeeMachine{
	
	int coffee;
	int cream;
	int sugar;
	
	// ������
	public CoffeeMachine() { // �⺻ ������
		
	}
	
	// ���� ������ ( ���� 3�� )
	public CoffeeMachine(int c, int cr, int su) {
		coffee=c;
		cream=cr;
		sugar=su;
	}
	
	// Ŀ�� ����� getTea() �޼ҵ� �����ε� �ϱ�
	
	public void getTea(int c, int cr, int su) { // 1. ��ũ Ƽ(Ŀ��) �����
		System.out.println("--��ũĿ�� ����--");
		System.out.println("Ŀ��: " + c);
		System.out.println("ũ��: " + cr);
		System.out.println("����: " + su);
	}
	
	// �� Ƽ(Ŀ��) �����
	public void getTea(int c) { // 2. �� Ƽ(Ŀ��) �����
		System.out.println("--��Ŀ�� ����--");
		System.out.println("Ŀ��: " + c);
	}
	
	// 3. ���� Ŀ�� �� ����ϴ� �޼ҵ�
	public int getTea(int c, int su) {
		System.out.println("--����Ŀ�� ����--");
		System.out.println("Ŀ��: " + c);
		System.out.println("����: " + su);
		
		return (c+su);
	}
}//----------------------------



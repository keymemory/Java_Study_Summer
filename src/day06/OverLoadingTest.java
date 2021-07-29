package day06;

public class OverLoadingTest {

	public static void main(String[] args) {
		
		Superman superman = new Superman("���۸�123", 195, 130);
		Superman superman2 = new Superman("���۸�123", 180);
		superman.showInfo();
		superman2.showInfo();
		
		System.out.println();
		Aquaman aquaman = new Aquaman("����Ƹ�123", 182, 125);
		Aquaman aquaman2 = new Aquaman(188, 127);
		aquaman.showInfo();
		aquaman2.showInfo();
	}

}



class Superman{
	
	String name;
	int height;
	int power;
	
	// ������ �޼ҵ�
	public Superman() { // �⺻ ������
		// ��� ���� �ʱ�ȭ
		/*name="���۸�";
		height=190;
		power=100;*/
	}
	
	// ������ �����ε�
	// ���� 3�� ������
	public Superman(String name, int height, int power) {
		this.name=name;
		this.height=height;
		this.power=power;
	}
	
	// ���� 2�� ������ �����ε�
	public Superman(String name, int height) {
		/* this.name=name;
		this.height=height;
		power=20; */
		// �ڱ� �ڽ��� �����ڸ� ȣ���� �� ����Ѵ�.
		this(name, height, 20);
	}
	
	// ���� 2�� ������ �����ε�
	public Superman(int h, int p) {
		/* name="���۸�2";
		height=h;
		power=p; */
		this("���۸�2", h, p); // �ڱ� �ڽ��� ������ ȣ��� ���
	}
	
	// ��� �޼ҵ� - �� �Ӽ� ��� ����ϴ� showInfo()
	public void showInfo() {
		System.out.println("--���۸� ����--");
		System.out.println("�̸�: " + name);
		System.out.println("Ű: " + height);
		System.out.println("�ʴɷ�: " + power);
	}
}//----------------------------


class Aquaman{
	String name;
	int height;
	int speed;
	
	public Aquaman() {
		name="����Ƹ�";
		height=200;
		speed=150;
	}
	
	// ������ �����ε�
	
	public Aquaman(String n, int h, int s) {
		name = n;
		height = h;
		speed = s;
	}
	
	public Aquaman(String n, int h) {
		this(n, h, 100);
	}
	
	public Aquaman(int h, int s) {
		this("����Ƹ�2", h, s);
	}
	
	public void showInfo() {
		System.out.println("--����Ƹ� ����--");
		System.out.println("�̸�: " + name);
		System.out.println("Ű: " + height);
		System.out.println("���ǵ�: " + speed);
	}
}//--------------------------------
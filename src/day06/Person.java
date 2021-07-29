package day06;

// �߻� Ŭ����
// 1�� �̻��� �߻� �޼ҵ带 ���� Ŭ����
// �������� ǥ���ϱ� ����

public abstract class Person {
	String name;
	String id;
	String cName;
	
	// ������ �����ε�
	public Person() {
		super();
	}
	
	public Person(String name, String id, String cName) {
		this.name=name;
		this.id=id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	// �߻� �޼ҵ� ����
	public abstract void inputInfo(); // ���� ����� ������ �Է¹޴� �޼ҵ�
	public abstract String getInfo(); // ���� ����� ������ ����ϴ� �޼ҵ�
	
	// ���� ��ü�� ������ ����ϴ� �޼ҵ�
	public void printAll() {
		System.out.println(this.getInfo());
	}

	public void setAddr(String cName) {
		this.cName = cName;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}

package day05;

public class HeadStore {

	public static void main(String[] args) {
		NatureMenu na = new NatureMenu();
		Store1 s1 = new Store1();
		Store2 s2 = new Store2();
		Store3 s3 = new Store3();
		na.sundae();
		s1.kimchi();
		s2.gonggibab();
		s3.bibimbab();

	}
}

class NatureMenu {
	public NatureMenu() {
	}
	
	public void kimchi() {
		System.out.println("��ġ� - 5000��");
	}
	
	public void budae() {
		System.out.println("�δ�� - 6000��");
	}
	
	public void bibimbab() {
		System.out.println("����� - 6000��");
	}
	
	public void sundae() {
		System.out.println("���뱹 - 5000��");
	}
	
	public void gonggibab() {
		System.out.println("����� - 1000��");
	}
}
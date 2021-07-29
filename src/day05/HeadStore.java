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
		System.out.println("±èÄ¡Âî°³ - 5000¿ø");
	}
	
	public void budae() {
		System.out.println("ºÎ´ëÂî°³ - 6000¿ø");
	}
	
	public void bibimbab() {
		System.out.println("ºñºö¹ä - 6000¿ø");
	}
	
	public void sundae() {
		System.out.println("¼ø´ë±¹ - 5000¿ø");
	}
	
	public void gonggibab() {
		System.out.println("°ø±â¹ä - 1000¿ø");
	}
}
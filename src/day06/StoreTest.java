package day06;

public class StoreTest {

	public static void main(String[] args) {
		HeadStore st1 = new Store1();
		st1.kimchi();
		st1.budae();
		st1.bibimbab();
		st1.sundae();
		st1.gonggibab();
		
		System.out.println("--------------------");
		HeadStore st2 = new Store2();
		st2.kimchi();
		st2.budae();
		st2.bibimbab();
		st2.sundae();
		st2.gonggibab();
		
		System.out.println("--------------------");
		HeadStore st3 = new Store3();
		st3.kimchi();
		st3.budae();
		st3.bibimbab();
		st3.sundae();
		st3.gonggibab();

	}

}

package day05;

public class MainTest {

	public static void main(String[] args) {
		NewMenu nm = new NewMenu();
		nm.makeBeefCungKucJang();
		nm.makeCungKucJang();

	}

}



class OldMenu{
	public OldMenu() {
		
	}
	
	public void makeCungKucJang(){
		System.out.println("û����");
	}
	
	public void makeDoenJangGuk() {
		System.out.println("���屹");
	}
	
	public void makeGalBiJjim() {
		System.out.println("������");
	}
	
	public void makeKongBiJi() {
		System.out.println("�����");
	}
	
}
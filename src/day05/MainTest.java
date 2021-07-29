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
		System.out.println("청국장");
	}
	
	public void makeDoenJangGuk() {
		System.out.println("된장국");
	}
	
	public void makeGalBiJjim() {
		System.out.println("갈비찜");
	}
	
	public void makeKongBiJi() {
		System.out.println("콩비지");
	}
	
}
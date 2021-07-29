package day05;

public class NewMenu extends OldMenu{
	
	public NewMenu() {
		
	}
	
	@Override
	public void makeCungKucJang() {
		System.out.println("냄새 없는 청국장입니다");
	}
	
	public void makeBeefCungKucJang() {
		System.out.println("쇠고기 청국장입니다");
	}
	
	public void makeHotDoenJangGuk() {
		System.out.println("매운 된장국입니다");
	}

	public void makeKongNaMool() {
		System.out.println("콩나물국입니다");
	}
}

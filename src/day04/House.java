package day04;

public class House {
	
	//속성 - (멤버 변수)
	private int roomTotal; //방의 수
	private String ownerName; //주인 이름
	
	//생성자
	public House() {
		//초기화
		roomTotal=3;
		ownerName="홍길동";
	}
	
	//캡슐화 접근 메소드
	public void setRoomTotal(int roomtotal) {
		roomTotal = roomtotal;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public int getRoomTotal() {
		return roomTotal;
	}
	
	//메소드
	public void rent() {
		System.out.println("세놓다");
	}
	
	public int roomCount() {
		return roomTotal;
	}
}

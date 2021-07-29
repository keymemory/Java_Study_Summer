package day04;

public class BuDongSan {

	public static void main(String[] args) {
		
		House house = new House();
		house.rent();
		int room = house.roomCount(); // 자료형이 int 이기 때문에 int로 받는다
		System.out.println("주인 이름: "+house.getOwnerName());
		System.out.println("방의 개수: "+room);
		house.setOwnerName("강아지"); // house.ownerName="강아지";
		house.setRoomTotal(2); // house.roomTotal=2;
		System.out.println("주인 이름: "+house.getOwnerName());
		System.out.println("방의 개수: "+house.getRoomTotal());
	}

}

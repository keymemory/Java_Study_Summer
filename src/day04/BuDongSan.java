package day04;

public class BuDongSan {

	public static void main(String[] args) {
		
		House house = new House();
		house.rent();
		int room = house.roomCount(); // �ڷ����� int �̱� ������ int�� �޴´�
		System.out.println("���� �̸�: "+house.getOwnerName());
		System.out.println("���� ����: "+room);
		house.setOwnerName("������"); // house.ownerName="������";
		house.setRoomTotal(2); // house.roomTotal=2;
		System.out.println("���� �̸�: "+house.getOwnerName());
		System.out.println("���� ����: "+house.getRoomTotal());
	}

}

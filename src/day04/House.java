package day04;

public class House {
	
	//�Ӽ� - (��� ����)
	private int roomTotal; //���� ��
	private String ownerName; //���� �̸�
	
	//������
	public House() {
		//�ʱ�ȭ
		roomTotal=3;
		ownerName="ȫ�浿";
	}
	
	//ĸ��ȭ ���� �޼ҵ�
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
	
	//�޼ҵ�
	public void rent() {
		System.out.println("������");
	}
	
	public int roomCount() {
		return roomTotal;
	}
}

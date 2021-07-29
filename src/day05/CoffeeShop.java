package day05;

public class CoffeeShop {

	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		cm.setCoffee(3);
		cm.setCream(3);
		cm.setSugar(3);
		System.out.println("커피: " + cm.getCoffee());
		System.out.println("크림: " + cm.getCream());
		System.out.println("설탕: " + cm.getSugar());
	}
}



class CoffeeMachine{
	private int coffee;
	private int sugar;
	private int cream;
	
	public void setCoffee(int c) {
		coffee = c;
	}
	
	public void setSugar(int s) {
		sugar = s;
	}

	public void setCream(int cr) {
		cream = cr;
	}
	
	public int getCoffee() {
		return coffee;
	}
	
	public int getSugar() {
		return sugar;
	}
	
	public int getCream() {
		return cream;
	}
	
	public CoffeeMachine(){
		
	}
	
	
}

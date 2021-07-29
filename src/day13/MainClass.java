package day13;

public class MainClass {

	public static void main(String[] args) {

		ThreadTest trt = new ThreadTest();
		Thread thread = new Thread(trt, "A");
		thread.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");

	}

}

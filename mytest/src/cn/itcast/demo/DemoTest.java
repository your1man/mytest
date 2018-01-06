package cn.itcast.demo;

public class DemoTest {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new MyThread2());
		try {
			t1.start();
			t1.join();
			t2.start();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package MulitiThreading;
/**
 * 通过实现runnable接口的方式实现多线程
 * @author wanghan
 *
 */
public class TestThread2 implements Runnable {
	//run()方法里是线程体
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+ ":" + i);
		}
	}

	public static void main(String[] args) {
		//创建线程对象，把实现了runnable接口的对象作为参数传入;
		Thread thread1 = new Thread(new TestThread2());
		thread1.start();//启动线程
		Thread thread2 = new Thread(new TestThread2());
		thread2.start();
	}
}

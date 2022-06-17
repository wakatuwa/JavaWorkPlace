package MulitiThreading;
/**
 * 线程优先级调度
 * @author wanghan
 *
 */
public class TestThreadPriority {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThreadPriority(), "t1");
		Thread t2 = new Thread(new MyThreadPriority(), "t2");
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}
}

class MyThreadPriority extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}

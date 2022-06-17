package MulitiThreading;
/**
 * 获取线程基本信息的方法
 * @author wanghan
 *
 */
public class MyThread {
	public static void main(String[] args) throws Exception{
		Runnable r = new TestThread99();
		Thread t = new Thread(r, "Name test");//定义线程对象，并传入参数
		t.start();
		System.out.println("name is: " + t.getName());
		Thread.currentThread().sleep(1000);
		System.out.println(t.isAlive());
		System.out.println("Over!");
	}
}

class TestThread99 implements Runnable {
	//线程体
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println(i);
	}
}
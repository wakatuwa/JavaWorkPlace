package MulitiThreading;
/**
 * 测试生产者与消费者模式
 * @author wanghan
 *
 */
public class TestProduce {
	public static void main(String[] args) {
		SyncStack sStack = new SyncStack();
		Shengchan sc = new Shengchan(sStack);
		Xiaofei xf = new Xiaofei(sStack);
		sc.start();
		xf.start();
	}
}

class Mantou {
	int id;
	Mantou(int id) {
		this.id = id;
	}
}

class SyncStack {	//缓冲区 馒头筐
	int index = 0;
	Mantou[] ms = new Mantou[10];

	public synchronized void push(Mantou m) {
		while (index == ms.length) { //说明馒头筐满了
			try {
				this.wait();
				//执行此方法的线程暂停，进入阻塞状态，等消费者消费了馒头再生产
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//唤醒在当前对象等待池的第一个线程
		//notify叫醒所有在当前对象等待池中等待的所有线程
		this.notify();
		
		ms[index] = m;
		index++;
	}
	
	public synchronized Mantou pop() {
		while (index == 0) { //如果馒头筐是空的
			try {
				this.wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
		index--;
		return ms[index];
	}
}

class Shengchan extends Thread {	//生产者线程
	SyncStack ss = null;
	
	public Shengchan (SyncStack ss) {
		this.ss = ss;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("生产馒头：" + i);
			Mantou m = new Mantou(i);
			ss.push(m);
		}
	}
}

class Xiaofei extends Thread {	//消费者线程
	SyncStack ss = null;
	public Xiaofei(SyncStack ss) {
		this.ss = ss;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Mantou m = ss.pop();
			System.out.println("消费馒头:" + i);
		}
	}
	
}
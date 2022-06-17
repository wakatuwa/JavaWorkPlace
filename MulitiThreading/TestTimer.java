package MulitiThreading;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 任务定时调度
 * @author wanghan
 *
 */
public class TestTimer {
	public static void main(String[] args) {
		Timer t1 = new Timer();//定义计时器
		MyTask task1 = new MyTask();
		t1.schedule(task1, 3000);
	}
}

class MyTask extends TimerTask {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("任务1:" + i);
		}
	}
}
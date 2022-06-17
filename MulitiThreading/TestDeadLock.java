package MulitiThreading;
/**
 * 测试死锁问题
 * @author wanghan
 *
 */
class Lipstick {	//口红类

}

class Mirror {	//镜子类

}

class Makeup extends Thread {	//化妆类继承了Thread类
	int flag;
	String girl;
	static Lipstick lipstick = new Lipstick();
	static Mirror mirror = new Mirror();

	@Override
	public void run() {
		doMakeup();
	}

	void doMakeup() {
        if (flag == 0) {
            synchronized (lipstick) {
                System.out.println(girl + "拿着口红！");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            synchronized (mirror) {
                System.out.println(girl + "拿着镜子！");
            }
        } else {
            synchronized (mirror) {
                System.out.println(girl + "拿着镜子！");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (lipstick) {
                System.out.println(girl + "拿着口红！");
            }
        }
    }
}
public class TestDeadLock {
	public static void main(String[] args) {
		Makeup m1 = new Makeup();
		m1.girl = "大丫";
		m1.flag = 0;
		Makeup m2 = new Makeup();
		m2.girl = "二丫";
		m2.flag = 1;
		m1.start();
		m2.start();
	}

}

package ObjectOrientedAdvanced;
/**
 *
 * @author wanghan
 *
 */
public class Friend {
	//和其他人约好时间通知我
	public void order(final Me me) throws InterruptedException {
		System.out.println("2.朋友接到电话说：我现在和其他人沟通一下，请稍等...");

		new Thread(new Runnable() {
			public void run() {
				try {
					System.out.println("4.朋友正在和其他人沟通.");
					Thread.sleep(5000);
					System.out.println("5.已经约好时间了，准备给我回电话");
					me.noticeMe();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}
}

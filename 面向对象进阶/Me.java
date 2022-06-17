package ObjectOrientedAdvanced;
/**
 *
 * @author wanghan
 *
 */
public class Me {
	//给朋友打电话
	public void callFriend(Friend friend) throws InterruptedException {
		System.out.println("1.给朋友打电话，询问聚会时间.");
		friend.order(this);
		doOtherThing();
	}

	public void noticeMe() {
		System.out.println("6.我收到了朋友的通知.");
	}

	public void doOtherThing() {
		System.out.println("3.我先忙其他事情...");
	}
}

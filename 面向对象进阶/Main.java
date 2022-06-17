package ObjectOrientedAdvanced;
/**
 * 测试callback 回调机制
 * @author wanghan
 *
 */

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Me me = new Me();
		Friend friend = new Friend();
		me.callFriend(friend);
	}
}

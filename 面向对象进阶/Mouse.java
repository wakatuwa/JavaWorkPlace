package ObjectOrientedAdvanced;
/**
 * 测试向下转型
 * @author wanghan
 *
 */
public class Mouse implements Electronics{
	public void move() {
		System.out.println("Move the mouse");
	}

	public void onClick() {
		System.out.println("Click the mouse");
	}
}

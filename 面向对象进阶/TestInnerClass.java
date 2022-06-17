package ObjectOrientedAdvanced;
/**
 * test innerclass
 * @author wanghan
 *
 */
class TestInnerClass {
	private int age = 10;
	public void show() {
		System.out.println(age);
	}

	public class Inner {
		private int age = 20;
		public void show() {
			System.out.println(age);
		}
	}
}

package ObjectOrientedAdvanced;
/**
 * 测试继承树追溯
 * @author wanghan
 *
 */
public class TestSuper02 {
	public static void main(String[] args) {
		ChildClass child = new ChildClass();
	}
}

class GrandFatherClass {
	public GrandFatherClass() {
		System.out.println("Create a GrandFatherClass.");
	}
}

class FatherClass extends GrandFatherClass {
	public FatherClass() {
		System.out.println("Create a FatherClass.");
	}
}

class ChildClass extends FatherClass {
	public ChildClass() {
		System.out.println("Create a ChildClass.");
	}
}

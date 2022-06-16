package ObjectOrientedAdvanced;
/**
 * 测试继承树
 * @author wanghan
 *
 */
public class TestSuper02 {
	public static void main(String[] args) {
		System.out.println("开始创建一个ChildClass对象。。。");
		new ChildClass2();
	}
}

class FatherClass2 {
	public FatherClass2() {
		//super(); //默认调用父类object构造器
		System.out.println("创建FatherClass");
	}
}

class ChildClass2 extends FatherClass2 {
	public ChildClass2() {
		//super();//默认去调用父类FatherClass2的构造器
		System.out.println("创建ChildClass");
	}
}

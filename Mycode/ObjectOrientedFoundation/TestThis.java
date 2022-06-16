package ObjectOrientedFoundation;
/**
 * 测试this用法
 * @author wanghan
 *
 */
public class TestThis {
	int a, b, c;
	
	TestThis(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	TestThis(int a, int b, int c) {
		this(a, b); //调用构造器，构造器的调用必须用在第一句
		this.c = c;
	}
	
	void sing() {
		
	}
	void eat() {
		this.sing(); //调用本类中的sing();
		System.out.println("你妈妈喊你回家吃饭！");		
	}
}

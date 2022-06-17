package ObjectOrientedAdvanced;
/**
 * 测试以及重写toString方法
 * @author wanghan
 *
 */
public class TesttoString {
	public static void main(String[] args) {
		Person01 p = new Person01();
		p.age = 20;
		p.name = "李东";
		System.out.println("info:" + p);

		TesttoString t = new TesttoString();
		System.out.println(t);
	}
}

class Person01 {
	String name;
	int age;
	@Override
	public String toString() {
		return name + ",年龄: " + age;
	}
}

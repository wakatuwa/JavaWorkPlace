package ObjectOrientedAdvanced;

/**
 * 测试重写
 * @author wanghan
 *
 */
public class TestOverride {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.run();
	}
}

class Vehicle {
	public void run() {
		System.out.println("跑。。。");
	}
	
	public void stop() {
		System.out.println("停止！");
	}
	
	public Person whoIsPsg() {
		return new Person();
	}
}

class Horse extends Vehicle {
	public void run() {
		System.out.println("四蹄翻飞，嘚嘚。。。");
	}
	
	public Student whoIsPsg() {
		return new Student();
	}
}



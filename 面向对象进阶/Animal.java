package ObjectOrientedAdvanced;
/**
 * 测试多态
 * @author wanghan
 *
 */
class Animal {
	public void shout() {
		System.out.println("叫了一声！");
	}
}
class Dog extends Animal {
	public void shout() {
		System.out.println("旺旺旺！");
	}
	public void seeDoor() {
			System.out.println("看门中....");
	}
}
class Cat extends Animal {
	public void shout() {
    	System.out.println("喵喵喵喵！");
	}
}

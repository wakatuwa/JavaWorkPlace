package ObjectOrientedAdvanced;
/**
 * 测试抽象方法和抽象类
 * @author wanghan
 *
 */
public class TestAbstractClass {
	public static void main(String[] args) {
		Zombie dave = new Zombie();
		dave.shout();
		dave.eat();
	}
}

//抽象类
abstract class Monster {
	abstract public void shout();//抽象方法
}

class Zombie extends Monster{
	public void shout() {
		System.out.println("Ahhhhhh");
	}
	public void eat() {
		System.out.println("Eating people");
	}
}
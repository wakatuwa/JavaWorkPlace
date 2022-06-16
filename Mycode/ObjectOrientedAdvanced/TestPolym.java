package ObjectOrientedAdvanced;
/**
 * 测试多态
 * @author wanghan
 *
 */
public class TestPolym {
	public static void main(String[] args) {
		Animal a = new Animal();
		animalCry(a);
		Animal d = new Dog(); //子类自动转为父类（自动向上转型）
		animalCry(d);	//父类引用指向子类对象
		
		Dog d2 = (Dog)d; //强制向下转型
		d2.seeDoor();
		
		Animal c = new Cat();
		Dog d3 = (Dog)c; 
		d3.seeDoor();
		
		Animal dog = new Dog();
		animalCry(dog);
	}
	
	static void animalCry(Animal a) {
		a.shout();		
	}
	
}

class Animal {
	public  void shout() {
		System.out.println("叫了一声！");
	}
}

class Dog extends Animal {
	public void shout() {
		System.out.println("汪汪汪！");
	}
	
	public void seeDoor() {
		System.out.println("看门！");
	}
}

class Cat extends Animal {
	public void shout() {
		System.out.println("喵喵喵！");
	}
}

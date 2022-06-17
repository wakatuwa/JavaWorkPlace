package ObjectOrientedAdvanced;
/**
 * 测试多态
 * @author wanghan
 *
 */
public class TestPolym {
	public static void main(String[] args) {
		Animal a1 = new Cat();//向上自动转型
		//传的具体是哪一个类就调用哪一个类的方法。大大提高了程序的可扩展性。
		animalCry(a1);
		Animal a2 = new Dog();
		animalCry(a2);//a2是编译类型，Dog对象是运行时类型
		
		//编写程序时，如果想调用运行时类型的方法，只能进行强制类型转换。
		// 否则通不过编译器的检查。
		Dog dog = (Dog)a2;//向下需要强制类型转换
		dog.seeDoor();
	}
	
	static void animalCry(Animal a) {
		a.shout();
	}
}

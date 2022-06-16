package ObjectOrientedAdvanced;
/**
 * 测试封装
 * @author wanghan
 *
 */
public class TestEncapsulation {
	public static void main(String[] args) {
		Human h = new Human();
		//h.age = 13;
		h.name = "wanghan";
	}
}

class Boy extends Human {
	void sayHello() {
//		System.out.println(age); 	//子类无法使用父类的私有属性和方法
	}
}
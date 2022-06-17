package ObjectOrientedAdvanced;
/**
 * 测试继承
 * @author wanghan
 *
 */
public class TestExtends {
	public static void main(String[] args) {
	Student s = new Student("zhangsan", 175, "Java");
	s.rest();
	s.study();
	}
}

class Person {
	String name;
	int height;
	public void rest() {
		System.out.println("Hava a rest!");
	}
}

class Student extends Person {
	String major;
	public void study() {
		System.out.println("Studying!");
	}

	public Student(String name, int height, String major) {
		//天然拥有父类的属性
		this.name = name;
		this.height = height;
		this.major = major;
	}
}
package testWork;
/**
 *编写 Java 程序用于显示人的姓名和年龄。定义一个人类Person。
 * 该类中应该有两个私有属性： 姓名 (name) 和年龄 (age) 。定义构造方法用来初始化数据成员。
 * 再定义显示(display()) 方法将姓名和年龄打印出来。在 main 方法中创建人类的实例然后将信息显示。
 * @author wanghan
 *
 */
public class TestWorkPerson {
	public static void main(String[] args) {
		Person xiaoming = new Person("xiaoming", 18);
		xiaoming.display();
	}
}
class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("姓名：" + name);
		System.out.println("年龄：" + age);
	}
}

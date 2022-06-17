package ObjectOrientedBasics;
/**
 * 作业Person
 * @author wanghan
 *
 */
public class Person {
	int age;//年龄
	String name;//姓名

	public Person(String name, int age) {
		this.name = name;
		this.age = age;	
	}
	void display() {
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		Person p = new Person("zhangsan", 123);
		p.display();
	}
}



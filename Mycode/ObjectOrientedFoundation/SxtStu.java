package ObjectOrientedFoundation;
/**
 * 定义一个类
 * @author wanghan
 *
 */
public class SxtStu {
	//属性
	int id;
	String name; 
	int age;
	
	Computer comp;//计算机
	
	//方法
	void study() {
		System.out.println("学生在学习！使用电脑：" + comp.brand);		
	}
	
	void play() {
		System.out.println("学生在玩游戏！");
	}
	//构造方法,用于创建这个类的对象。无参的构造方法可以有系统自动创建
	SxtStu() { 
		
	}
	//程序执行的入口，必须要有
	//javac SxtStu.java, java SxtStu
	public static void main(String[] args) {
		SxtStu stu = new SxtStu();
		System.out.println(stu);
		stu.id = 1001;
		stu.name = "高琪";
		stu.age = 18;
		
		Computer c1 = new Computer();
		System.out.println(c1);
		c1.brand = "Lenovo";
		
		stu.comp = c1;
		stu.study();
		stu.play();
	}	
}
class Computer{
	String brand;
}

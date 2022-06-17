package ObjectOrientedBasics;
/**
 * 模拟学生使用电脑
 * @author wanghan
 *
 */
public class SxtStu {
	//field
	int id;
	String sname;
	int age;
	Computer comp;
	void study() {
		System.out.println("正在使用电脑的品牌："+comp.brand);
	}
	SxtStu() {
		
	}
	public static void main(String[] args) {
		SxtStu stu1 = new SxtStu();
		stu1.sname = "张三";
		Computer comp1 = new Computer();
		comp1.brand = "联想";
		stu1.comp = comp1;
		stu1.study();
	}
}

class Computer {
	String brand; //电脑品牌
}

package cn.sxt.oo;

import ObjectOrientedAdvanced.Human;
import ObjectOrientedAdvanced.Person4;

/**
 * 测试封装
 * @author wanghan
 *
 */
public class TestEncapsulation2 {
	public static void main(String[] args) {
		Human h = new Human();
//		h.age = 13;
//		h.name = "wanghan";
		
		Person4 p4 = new Person4();
//		p4.age= 14;
		p4.setAge(-14);
		p4.getName();
		System.out.println(p4.getAge());
	}
}

class Girl extends Human {
	void sayGood() {
		System.out.println(height);
	}
}

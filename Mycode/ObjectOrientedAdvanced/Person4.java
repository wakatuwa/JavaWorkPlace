package ObjectOrientedAdvanced;
/**
 * 仍然测试封装
 * @author wanghan
 *
 */
public class Person4 {
	private int id;
	private String name;
	private int age;
	private boolean man;
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {  
		return this.name;
	}
	
	public void setAge(int age) {
		if (age>=1 && age <=130) {
			this.age = age;
		} else {
			System.out.println("请输入正常的人类年龄！");
		}
	}
	


	public int getAge() {
		return this.age;
	}
}

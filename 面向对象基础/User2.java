package ObjectOrientedBasics;
/**
 * 测试static修饰符
 * @author wanghan
 *
 */
public class User2 {
	int id;
	String name;
	String pwd;
	static String company = "umbrella";

//	public User2(int id, String name) {
//		this.id = id;
//		this.name = name;
//	}

//	public void login() {
//		printCompany();
//		System.out.println(company);
//		System.out.println("登录： " + name);
//
//	}

	public static void printCompany() {
//		login();//调用非静态成员变量，编译报错
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		//User2 u = new User2(101, "zhangsan");
		User2.printCompany();
		User2.company = "保护伞";
		User2.printCompany();
	}
}

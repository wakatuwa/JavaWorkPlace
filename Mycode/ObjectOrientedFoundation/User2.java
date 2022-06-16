package ObjectOrientedFoundation;
/**
 * 测试static
 * @author wanghan
 *
 */
public class User2 {
	int id;
	String name;
	String pwd;
	
	static String company = "北京尚学堂";
	
	public User2 (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void login() {
		printCompany();
		System.out.println(company);
		System.out.println("登录:" + name);
	}
	
	public static void printCompany() { //静态方法不能使用非静态成员
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		User2 u = new User2(1001, "zhangsan");
		User2.printCompany();
		User2.company = "北京阿里";
		User2.printCompany();
		
	}
}

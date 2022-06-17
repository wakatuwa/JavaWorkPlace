package ObjectOrientedBasics;
/**
 * 构造方法的重载
 * @author wanghan
 *
 */
public class User {
	int id; //id
	String name; //账户名
	String pwd; //密码
	public User() {
		
	}
	public User(int id, String name) {
		System.out.println("正在初始化已经创建好的对象：" +this);		
		this.id = id;
		this.name = name;
	}
	public void login() {		
		System.out.print(this.id+" ");
		System.out.println(this.name+",要登录！");//不写this效果一样
	}
	
	public static void main(String[] args) {
		User u3 = new User(101, "高小七");
		System.out.println("打印高小七对象：" +u3);
		u3.login();
	}
}

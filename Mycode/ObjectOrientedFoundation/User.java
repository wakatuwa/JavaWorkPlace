package ObjectOrientedFoundation;
/**
 * 构造方法的重载
 * @author wanghan
 *
 */
public class User {
	int id;
	String name;
	String pwd;
	
	public User() {
		
	}
	
	public User(int id, String name) {
		//super(); 	//构造方法的第一句总是super
		this.id = id;	//this标识创建好的对象
		this.name = name;
	}
	public User(int id, String name, String pwd) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User(101, "小七");
		User u3 = new User(100, "小八", "123456");
	}
}

package testWork;
/**
 * 构造方法与重载：定义一个网络用户类，信息有用户 ID、用户密码、 email 地址。
 * 在建立类的实例时把以上三个信息都作为构造函数的参数输入， 其中用户 ID 和用户密码时必须缺省时 email地址是用户 ID 加上字符串"@gameschool.com"。
 * @author wanghan
 *
 */
public class TestWorkUser {
	public static void main(String[] args) {
		User test1 = new User("xiaoming","123","cc.com");
		User test2 = new User("xiaohong", "123");
		test1.test();
		test2.test();

	}
}

class User{
	private String id;
	private String pwd;
	private String email;

	public User(String id, String pwd, String email) {
		this.id = id;
		this.email = email;
		this.pwd = pwd;
	}

	public User(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
		this.email = id + "@gameschool.com";
	}

	public void test() {
		System.out.println("用户名:" + id);
		System.out.println("密码:" + pwd);
		System.out.println("邮箱地址:" + email);
	}
}

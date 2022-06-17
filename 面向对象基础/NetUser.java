package ObjectOrientedBasics;
/**
 * 构建一个网络用户类
 * @author wanghan
 *
 */
public class NetUser {
	String id;
	String password;
	String email;
	public NetUser(String id, String password, String email) {
		this.id = id;
		this.password = password;
		this.email = email;
	}
	public NetUser(String id, String password) {
		this.id = id;
		this.password = password;
		email = this.id+"@gameschool.com";
	}
	public void print() {
		System.out.println(id+"  "+password+"  "+email);
	}
	public static void main(String[] args) {
		NetUser one = new NetUser("001", "123456", "001@gameschool.com");
		NetUser two = new NetUser("002", "123");
		one.print();
		two.print();
	}
}

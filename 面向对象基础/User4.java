package ObjectOrientedBasics;
/**
 * 参数传值机制
 * @author wanghan
 *
 */
public class User4 {
	int id;
	String name;
	
	public User4(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void testParameterTransfer01(User4 u) {
		u.name = "1号";
	}
	
	public void testParameterTransfer02(User4 u) {
		u = new User4(002,"2号");
	}
	
	public static void main(String[] args) {
		User4 u1 = new User4(003, "3号");
		
		u1.testParameterTransfer01(u1);
		System.out.println(u1.name);
		
		u1.testParameterTransfer02(u1);
		System.out.println(u1.name);		
		
	}
 }

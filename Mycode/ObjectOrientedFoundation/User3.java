/**
 * 测试静态初始化块
 * 
 */
package ObjectOrientedFoundation;

public class User3 {
	int id; 
	String name;
	String pwd;
	static String company;
	static {
		System.out.println();
		company = "北京尚学堂";
		printCompany();
	}
	
	public static void printCompany() {
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		User3 u3 = null;
	}
}

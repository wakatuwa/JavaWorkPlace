package ObjectOrientedBasics;
/**
 * 静态初始化块
 * @author wanghan
 *
 */
public class User3 {
	int id;
	static String company="Umbrella";
	static {
		System.out.println("执行类的初始化工作");
		company = "保护伞公司";
		printCompany();
		
	}
	public static void printCompany() {
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		
	}
}
